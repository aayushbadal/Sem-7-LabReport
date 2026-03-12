/*
8. Write a java program to develop multithreaded application by following ways.
    a. By implementing Runnable Interface
*/

package Lab2;

class Thread1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 50; i++)
            System.out.println("Thread 1 Prints:" + i);
    }
}

class Thread2 implements Runnable {
    public void run() {
        for (int i = 51; i <= 100; i++)
            System.out.println("Thread 2 Prints:" + i);
    }
}

public class Q08a {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        t1.start();
        t2.start();

    }

}
