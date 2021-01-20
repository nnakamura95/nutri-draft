package nutri.api.infrastructure.datasource.client;

import nutri.api.domain.model.Client;
import nutri.api.domain.model.ClientRepository;
import org.springframework.stereotype.Repository;

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
}
