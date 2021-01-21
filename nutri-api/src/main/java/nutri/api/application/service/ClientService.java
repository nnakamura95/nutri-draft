package nutri.api.application.service;

import nutri.api.domain.model.Client;
import nutri.api.infrastructure.datasource.client.ClientRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Transactional
    public Client getClientById(int id) {
        return clientRepository.getClientById(id);
    }

    @Transactional
    public Client saveClient(Client client) {
        return clientRepository.saveClient(client);
    }

    public List<Client> getAllClient() {
        return clientRepository.getAllClient();
    }

    public Client updateClient(int id, Client client) {
        return clientRepository.updateClient(id, client);
    }
}
