package nutri.api.domain.model;

import nutri.api.domain.model.Client;

public interface ClientRepository {
    Client getClientById(int id);
}
