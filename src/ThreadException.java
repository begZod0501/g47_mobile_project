public class ThreadException {
    public static void main(String[] args) {
        Runnable task1=()->{

            int num=1/0;
            System.out.println(num);
        };
        Thread thread=new Thread(task1);
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("log faylga yoz " + e.getMessage());
            }
        });
        thread.start();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("hello");


    }
}
