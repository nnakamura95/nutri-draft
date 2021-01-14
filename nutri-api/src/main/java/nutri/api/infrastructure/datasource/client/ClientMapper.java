package nutri.api.infrastructure.datasource.client;

import nutri.api.domain.model.Client;

public interface ClientMapper {
    Client getClientById(int id);
}
