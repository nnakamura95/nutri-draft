package nutri.api.presentation.controller;

import nutri.api.application.service.ClientService;
import nutri.api.domain.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientApiController {

    @Autowired
    ClientService clientService;

    @GetMapping("/{id}")
    public Client get(@PathVariable("id") int id) {
        Client client = clientService.getClientById(id);
        return client;
    }

    @GetMapping
    @ResponseBody
    public List<Client> getAll() {
        List<Client> clientList = clientService.getAllClient();
        return clientList;
    }

    @PostMapping
    public Client post(@RequestBody Client client) {
        Client clientAdded= clientService.saveClient(client);
        return clientAdded;
    }

    @PutMapping("/{id}")
    public Client put(@PathVariable("id") int id , @RequestBody Client client) {
        Client updateClient = clientService.updateClient(id, client);
        return updateClient;
    }

    @DeleteMapping("/{id}")
    public Client delete(@PathVariable("id") int id) {
        Client deleteClient = clientService.deleteClient(id);
        return deleteClient;
    }


}
