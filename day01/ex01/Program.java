package ex01;

public class Program {
    public static void main(String[] args) {
        User name = new User("lol", 100);
        User name2 = new User("pol", 200);
        System.out.println(name.getUserName() + " id " + name.getIdentifier() + " balance = " + name.getBalance());
        System.out.println(name2.getUserName() + " id " + name2.getIdentifier() + " balance = " + name2.getBalance());
        System.out.println(name.getUserName() + " id " + name.getIdentifier() + " balance = " + name.getBalance());
        System.out.println("ID = " + name.getIdentifier());
    }
}
