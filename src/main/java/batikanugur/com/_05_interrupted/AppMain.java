package batikanugur.com._05_interrupted;

import java.util.Random;

public class AppMain {

    public static long sayac = 0;

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        Random randomNo = new Random();

        final var mainThread = Thread.currentThread();

        new Thread( ()-> {

            for (int i = 0; i < 100; i++) {
                sayac++;
                //System.out.println("Selam: " + i);

                try {
                    int mySleepTime = randomNo.nextInt(10);
                    Thread.sleep(mySleepTime);
                    System.out.println("random: " + mySleepTime);//randomNo.nextInt(3000)
                } catch (InterruptedException e) {
                   // throw new RuntimeException();
                    System.out.println("Hata: " + e);
                }

                System.out.println("Sayac: " + sayac);

                if(sayac==25 ) {
                    mainThread.interrupt();
                    break;
                }
            }



        }).start();

        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;

        System.out.println("Start  time : " + startTime);
        System.out.println("End time    : " + endTime);
        System.out.println("Elapsed time: " + elapsedTime);
    }


}
