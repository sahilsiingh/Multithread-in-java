public class multithreadingSleepMethod extends Thread{
    @Override

    public void run(){
        for(int i =  1; i<5 ; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } 
    }
    
    public static void main(String[] args) {
        
        multithreading t1 = new multithreading();
        t1.start();

    }
}