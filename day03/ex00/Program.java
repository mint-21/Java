package ex00;
import java.util.Scanner;

public class Program extends Thread {
    private String name;
    public Program(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        try{
            Thread.sleep(10);
        }catch(InterruptedException e){
            return;
        }
        System.out.println(this.name);
    }
}

class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String[] retval = str.split("=");
        int count = Integer.parseInt(retval[1].trim());
        int a = count;

        while (a > 0) {
            Program thread1 = new Program("Egg");
            Program thread2 = new Program("Hen");
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();
            a--;
        }
        while (--count > 0)
            System.out.println("Human");
    }
}
