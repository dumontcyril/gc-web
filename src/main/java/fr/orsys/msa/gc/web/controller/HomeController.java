package fr.orsys.msa.gc.web.controller;

import fr.orsys.msa.gc.web.service.Client;
import fr.orsys.msa.gc.web.service.ClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

@Controller
@Slf4j
public class HomeController {

    @Autowired
    ClientService clientService;

    @RequestMapping("/")
    public String home(Model model){

        try {
            String hostName = InetAddress.getLocalHost().getHostName();
            model.addAttribute("hostname", hostName);
        } catch (UnknownHostException e) {
          log.error(e.getMessage(), e);
        }

        List<Client> clients = clientService.findAllClients();
        model.addAttribute("clients", clients);
        return "listClients";
    }
}
