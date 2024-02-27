import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.Random;

class Market{
    LinkedList<String> list = new LinkedList<>();
    final int capacity = 5;
    String[] fruits={"Apple","Orange","Watermelon","Banana"};
    Random random = new SecureRandom();

    public void produce() throws InterruptedException{
        while(true){
            synchronized (this){
                while(list.size()==5)
                    wait();

                String fruit = fruits[random.nextInt(4)];
                System.out.println("Farmer produced "+fruit+"\n ----------------------------------");
                list.add(fruit);
                notifyAll();
                Thread.sleep(400);
            }
        }
    }

    public void consume() throws InterruptedException{
        while(true){
            synchronized (this){
                while(list.size()==0)
                    wait();

                String fruit = list.removeFirst();
                System.out.println("Customer bought "+fruit+"\n ----------------------------------");
                notifyAll();
                Thread.sleep(400);
            }
        }
    }
}

public class Prog7 {
    public static void main(String[] args) throws InterruptedException{
        final Market market = new Market();
        Thread t1= new Thread(new Runnable(){
            public void run(){
                try{
                    market.produce();
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        Thread t2= new Thread(new Runnable(){
            public void run(){
                try{
                    market.consume();
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
