public class InterDemo {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(new Producer(sharedResource), "Producer");
        Thread consumerThread1 = new Thread(new Consumer(sharedResource), "Consumer-1");
        Thread consumerThread2 = new Thread(new Consumer(sharedResource), "Consumer-2");

        consumerThread1.start();
        consumerThread2.start();
        producerThread.start();

        try {
            producerThread.join();
            consumerThread1.join();
            consumerThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread terminates last.");
    }
}
