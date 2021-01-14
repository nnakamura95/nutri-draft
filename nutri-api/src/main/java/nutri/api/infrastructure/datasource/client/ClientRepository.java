package nutri.api.infrastructure.datasource.client;

import nutri.api.domain.model.Client;

public interface ClientRepository {
    Client getClientById(int id);
}
