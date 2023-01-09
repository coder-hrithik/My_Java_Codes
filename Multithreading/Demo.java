package Multithreading;

public class Demo extends Thread {

    public Demo() {
        super(" \n My extending thread");
        System.out.println("My thread created");
    }

    @Override
    public void run() {
        int m;
        try {
            for (int i = 1; i < 11; i++) {
                m = 5 * i;
                Thread.sleep(1000);
                System.out.println("5 * " + i + " = " + m);
            }
            System.out.println("\n");
            for (int i = 1; i < 11; i++) {
                m = 7 * i;
                Thread.sleep(1000);
                System.out.println("7 * " + i + " = " + m);
            }
        } catch (InterruptedException e) {
            System.out.println("My thread interupted");
        }
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.start();
    }
}
