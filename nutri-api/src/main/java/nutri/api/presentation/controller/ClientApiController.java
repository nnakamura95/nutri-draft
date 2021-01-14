package nutri.api.presentation.controller;

import nutri.api.application.service.ClientService;
import nutri.api.domain.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientApiController {

    ClientService clientService;

    @GetMapping("/{id}")
    public Client get(@PathVariable("id") int id){
        Client client = clientService.getClientById(id);
        return client;
    }
}
