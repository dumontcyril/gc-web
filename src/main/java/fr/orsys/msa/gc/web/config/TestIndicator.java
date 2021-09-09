package fr.orsys.msa.gc.web.config;

import fr.orsys.msa.gc.web.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class TestIndicator implements HealthIndicator {

    @Autowired
    ClientService clientService;

    @Override
    public Health health() {
        try{
            clientService.findAllClients();
            return Health.up().build();
        }catch (Exception e){

            return Health.down(e).build();
        }
    }
}
