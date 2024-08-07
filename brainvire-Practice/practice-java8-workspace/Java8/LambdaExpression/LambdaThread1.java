package Java8.LambdaExpression;

public class LambdaThread1 {
    public static void main(String[] args) {
        Runnable thread1 = () -> {

            for (int i = 0; i < 10; i++) {
                System.out.println("val " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(thread1);
        t1.setName("Swapnil");
        t1.start();
    }
}
