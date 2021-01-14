package nutri.api.domain.model;

import java.util.UUID;

public class Client {

    int id;
    UUID client_number;
    String name;
    String email;
    String health_condition;

    public Client(int id, UUID client_number, String name, String email, String health_condition) {
        this.id = id;
        this.client_number = client_number;
        this.name = name;
        this.email = email;
        this.health_condition = health_condition;
    }

    public Client() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UUID getClient_number() {
        return client_number;
    }

    public void setClient_number(UUID client_number) {
        this.client_number = client_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHealth_condition() {
        return health_condition;
    }

    public void setHealth_condition(String health_condition) {
        this.health_condition = health_condition;
    }
}
