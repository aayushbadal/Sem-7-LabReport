//10. Write a java program to demonstrate the concept of synchronization in multithreaded applications.

package Lab2;

class Printer {
    public synchronized void display() {
        try {
            System.out.print("\nJava is");
            Thread.sleep(3000);
            System.out.print(" OOP language\n");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class Threadx extends Thread {
    Printer pr;

    public Threadx(Printer p) {
        pr = p;
    }

    public void run() {
        pr.display();
    }
}

public class Q10 {
    public static void main(String[] args) {
        Printer p = new Printer();
        Threadx t1 = new Threadx(p);
        Threadx t2 = new Threadx(p);
        t1.start();
        t2.start();
    }
}
