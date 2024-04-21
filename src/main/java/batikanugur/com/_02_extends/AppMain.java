package batikanugur.com._02_extends;

class MyBaseThread extends Thread  {

    @Override
    public void run() {
        System.out.println("Thread çalışıyor: " + Thread.currentThread().getName());
    }

}

public class AppMain {
    public static void main(String[] args) {

        MyBaseThread myBaseThread = new MyBaseThread();
        System.out.println("Extends Main thread started");
        myBaseThread.start();
    }
}