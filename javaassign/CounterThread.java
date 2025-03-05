 class CounterThread extends Thread{
    private static int counter=0;
    private static final int MAX_COUNT=1000;
    private static final Object lock = new Object();

    @Override
    public void run(){
        while(true){
            synchronized (lock) {
                if (counter>=MAX_COUNT){
                    break;
                }
                counter++;

                System.out.println(Thread.currentThread().getName()+"incremented counter to: " +counter);
            }
        }
    }
    
}


