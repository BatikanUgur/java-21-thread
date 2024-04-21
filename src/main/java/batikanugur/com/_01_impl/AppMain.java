package batikanugur.com._01_impl;

class MyBaseThread implements Runnable  {


    @Override
    public void run() {

    }
}

public class AppMain {
    public static void main(String[] args) {

        MyBaseThread myBaseThread = new MyBaseThread();
        System.out.println("Main thread started");

        Thread thread = new Thread(myBaseThread);
        thread.start();
    }
}