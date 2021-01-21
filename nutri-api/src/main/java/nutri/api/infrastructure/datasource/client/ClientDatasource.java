package nutri.api.infrastructure.datasource.client;

import nutri.api.domain.model.Client;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientDatasource implements ClientRepository {

    private ClientMapper clientMapper;

    public ClientDatasource(ClientMapper clientMapper) {
        this.clientMapper = clientMapper;
    }

    @Override
    public Client getClientById(int id) {
        return clientMapper.getClientById(id);
    }

    @Override
    public Client saveClient(Client client) {
        return clientMapper.saveClient(client);
    }

    @Override
    public List<Client> getAllClient() {
        return clientMapper.getAllClient();
    }

    @Override
    public Client updateClient(int id, Client client) {
        return clientMapper.updateClient(id, client);
    }

    @Override
    public Client deleteClient(int id) {
        return clientMapper.deleteClient(id);
    }
}
