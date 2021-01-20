package nutri.api.domain.model;

import java.util.UUID;

public class Client {

    int id;
    String clientNumber;
    String name;
    String email;
    String healthCondition;


    public Client(int id, String clientNumber, String name, String email, String healthCondition) {
        this.id = id;
        this.clientNumber = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.healthCondition = healthCondition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
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

    public String getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(String healthCondition) {
        this.healthCondition = healthCondition;
    }

}
