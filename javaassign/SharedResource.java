class SharedResource {
    private boolean isProcessed = false;

    public synchronized void produce() {
        System.out.println(Thread.currentThread().getName() + ": Producing data...");
        isProcessed = true;
        notifyAll();
    }

    public synchronized void consume() {
        while (!isProcessed) {
            try {
                System.out.println(Thread.currentThread().getName() + ": Waiting for data...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + ": Consumed data!");
    }
}

class Producer implements Runnable {
    private final SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        sharedResource.produce();
    }
}

class Consumer implements Runnable {
    private final SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        sharedResource.consume();
    }
}

