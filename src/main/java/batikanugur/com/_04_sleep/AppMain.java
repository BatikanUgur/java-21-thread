package batikanugur.com._04_sleep;

public class AppMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        try {

            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Hata: " + e);
        }

        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;

        System.out.println("Start  time : " + startTime);
        System.out.println("End time    : " + endTime);
        System.out.println("Elapsed time: " + elapsedTime);
    }

}
