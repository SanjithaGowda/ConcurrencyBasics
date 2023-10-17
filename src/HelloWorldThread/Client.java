package HelloWorldThread;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread td = new Thread(hwp);
        td.start();

        System.out.println("hello world from thread: "+ Thread.currentThread().getName());

    }
}
