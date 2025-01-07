package multithreading;

public class test {
        public static void main(String[] args) {

        thread one = new thread();
        Thread t1 = new Thread(one);
        t1.start();

        for (; ; ) {
            System.out.println("i m winner");
        }
    }
}

// main thread

// .............................................................................................................

package multithreading;

public class thread implements Runnable{
    @Override
    public void run() {
        for(; ;) {
            System.out.println("i m loser");
        }
    }
}

// extended thread
