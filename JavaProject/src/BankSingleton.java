import java.util.HashMap;
import java.util.Map;

public class BankSingleton {
    private static BankSingleton instance;
    private Map<String, User> users;

    private BankSingleton() {
        this.users = new HashMap<>();
    }

    public static BankSingleton getInstance() {
        if (instance == null) {
            instance = new BankSingleton();
        }
        return instance;
    }

    public User authenticateUser(String username, String password) {
        if (users.containsKey(username) && users.get(username).getPassword().equals(password)) {
            return users.get(username);
        } else {
            return null;
        }
    }

    public User createAccount(String username, String password) {
        if (!users.containsKey(username)) {
            User user = new User(username, password);
            int accountNumber = username.hashCode(); // Use a better method for generating account numbers
            user.setAccount(new BankAccount(accountNumber));
            users.put(username, user);
            return user;
        } else {
            return null;
        }
    }
}