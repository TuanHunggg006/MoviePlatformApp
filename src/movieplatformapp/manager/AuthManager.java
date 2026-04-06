package movieplatformapp.manager;

import movieplatformapp.model.Admin;
import movieplatformapp.model.Customer;
import movieplatformapp.model.User;

public class AuthManager {

    public User login(String username, String password) {
        if (username.equals("admin") && password.equals("123")) {
            return new Admin("A01", "admin", "123", "Admin");
        }

        if (username.equals("user") && password.equals("123")) {
            return new Customer("C01", "user", "123", "Customer");
        }

        return null;
    }
}