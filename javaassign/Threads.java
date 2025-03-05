public class Threads {
    public static void main(String[] args) {
        CounterThread thread1=new CounterThread();
        CounterThread thread2=new CounterThread();
        CounterThread thread3=new CounterThread();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
