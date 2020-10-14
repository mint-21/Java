package ex00;

public class User {
    private static int count;
    private Integer ID = count++;
    private String name;
    private Integer balance;

    public User(String name, Integer balance) {
        setUserName(name);
        setBalance(balance);
    }

    public Integer getIdentifier() {
        return (ID);
    }

    public String getUserName() {
        return (name);
    }

    public void setUserName(String name) {
        this.name = name;
    }

    public Integer getBalance() {
        return (balance);
    }

    public void setBalance(Integer balance) {
        if (balance > 0)
            this.balance = balance;
    }
}
