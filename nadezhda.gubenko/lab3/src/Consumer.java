public class Consumer implements Runnable{


    public String getName(){
        return "Consumer " + Thread.currentThread().getName();
    }

    public void run(){
        int n3 = 0;
        while (n3 < 3)
        {
            n3 += 1;

        int val = Lab3.store.get();

        System.out.println(this.getName() + " " + val);
        Lab3.store.noty();
        Lab3.store.product= -1;
        }
    }
}