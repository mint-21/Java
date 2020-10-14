package ex02;

public class Program {
    public static void main(String[] args) throws UserNotFoundException {
        User name = new User("lol", 100);
        User name2 = new User("pol", 200);
        User name3 = new User("jon", 300);
        User name4 = new User("jen", 300);
        User name5 = new User("json", 300);

        UsersArrayList arrayList = new UsersArrayList();

        arrayList.UserAdd(name);
        arrayList.UserAdd(name2);
        arrayList.UserAdd(name3);
        arrayList.UserAdd(name4);
        arrayList.UserAdd(name5);
        System.out.println("user by ID = " + arrayList.userRetID(2).getUserName());
        System.out.println("user by index = " + arrayList.userRetIndex(2).getUserName());
        System.out.println("number of users = " + arrayList.numUsersRet());
        System.out.println("not user " + arrayList.userRetID(6));
        System.out.println(name.getUserName() + " id " + name.getIdentifier() + " balance = " + name.getBalance());
        System.out.println(name2.getUserName() + " id " + name2.getIdentifier() + " balance = " + name2.getBalance());
    }
}
