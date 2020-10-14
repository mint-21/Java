package ex00;

public class Program {
    public static void main(String[] args) {
        User name = new User("lol", 300);
        User name2 = new User("pol", 500);
        System.out.println(name.getUserName() + " id " + name.getIdentifier() + " balance = " + name.getBalance());
        System.out.println(name2.getUserName() + " id " + name2.getIdentifier() + " balance = " + name2.getBalance());

        Transaction tran = new Transaction(name, name2, "debits", -100);
        Transaction tran2 = new Transaction(name, name2, "credits", -100);
        System.out.println(tran.getAmount());
        System.out.println(tran2.getAmount());
    }
}
