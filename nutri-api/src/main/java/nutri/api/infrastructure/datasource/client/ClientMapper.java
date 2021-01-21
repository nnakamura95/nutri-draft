package nutri.api.infrastructure.datasource.client;

import nutri.api.domain.model.Client;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClientMapper {

    Client getClientById(int id);

    Client saveClient(Client client);

    List<Client> getAllClient();

    Client updateClient(int id, Client client);
}
