package nutri.api.application.service;

import nutri.api.domain.model.Client;
import nutri.api.infrastructure.datasource.client.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client getClientById(int id) {
        return clientRepository.getClientById(id);
    }
}
