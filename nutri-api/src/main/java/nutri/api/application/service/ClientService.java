package nutri.api.application.service;

import nutri.api.domain.model.Client;
import nutri.api.domain.model.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client getClientById(int id) {
        return clientRepository.getClientById(id);
    }
}
