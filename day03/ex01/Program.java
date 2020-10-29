package ex01;
import java.util.Scanner;

public class Program extends Thread {
    private String name;
    static boolean fl = true;

    public Program(String name) {
        this.name = name;
    }

    public void Method1(boolean fl) {
        synchronized (this.name) {
            if (fl == true) {
                System.out.println(this.name);
                fl = false;
            }
        }
    }
    public void Method2(boolean fl) {
        synchronized (this.name) {
            if (fl == false)
                System.out.println(this.name);
        }
    }

    @Override
    public void run() {
        Method1(fl);
        Method2(fl);
    }
}

class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String[] retval = str.split("=");
        int count = Integer.parseInt(retval[1].trim());

        while (count > 0) {
            Program thread1 = new Program("Egg");
            Program thread2 = new Program("Hen");
            thread1.start();
            thread1.join();
            thread2.start();
            thread2.join();
            count--;
        }
    }
}
