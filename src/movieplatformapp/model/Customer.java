package movieplatformapp.model;

public class Customer extends User {
    public Customer() {
    }

    public Customer(String id, String username, String password, String fullName) {
        super(id, username, password, fullName);
    }
}
