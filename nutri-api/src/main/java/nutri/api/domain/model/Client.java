package nutri.api.domain.model;

import java.util.UUID;

public class Client {

    int id;
    String clientNumber;
    String name;
    String email;
    String healthCondition;
    String phone;
    String dataOfBirth;
    int age;
    String gender;
    String address;

    public Client(int id, String clientNumber, String name, String email,
                  String healthCondition, String phone, String dataOfBirth,
                  int age, String gender, String address) {
        this.id = id;
        this.clientNumber = clientNumber;
        this.name = name;
        this.email = email;
        this.healthCondition = healthCondition;
        this.phone = phone;
        this.dataOfBirth = dataOfBirth;
        this.age = age;
        this.gender = gender;
        this.address = address;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(String dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
