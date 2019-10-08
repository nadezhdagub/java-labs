import java.util.Random;

public class Producer implements Runnable{

    private Random rand = new Random();

    public String getName(){
        return "Producer " + Thread.currentThread().getName();
    }


    public void run(){
        int n3 = 0;
        while (n3 < 3) {
            n3 += 1;
            int random = rand.nextInt(100 + 1);
            Lab3.store.put(random);
            System.out.println(this.getName() + " " + Integer.toString(random));
            Lab3.store.waitt();
        }
    }
}