package nutri.api.infrastructure.datasource.client;

import nutri.api.domain.model.Client;

import java.util.List;

public interface ClientRepository {
    Client getClientById(int id);

    Client saveClient(Client client);

    List<Client> getAllClient();

    Client updateClient(int id, Client client);
}
