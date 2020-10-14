package ex02;

public class User {
    private Integer id;
    private String name;
    private Integer balance;

    public User(String name, Integer balance) {
        setUserName(name);
        setBalance(balance);
        this.id = UserIdsGenerator.getInstance().generateId();
    }

    public Integer getIdentifier() {
        return (id);
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
        else
            System.err.println("balance is not");
    }
}
