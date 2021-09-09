package fr.orsys.msa.gc.web.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="client-api", url = "${app.api.clients.url}")
public interface ClientService {

    @GetMapping("/api/clients")
    List<Client> findAllClients();
}
