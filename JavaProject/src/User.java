public class User {
    private String username;
    private String password;
    private BankAccount account;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.account = null;
    }

    public void updateAccountDetails(String newUsername, String newPassword) {
        this.username = newUsername;
        this.password = newPassword;
    }

    public String getPassword() {
        return password;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }
}