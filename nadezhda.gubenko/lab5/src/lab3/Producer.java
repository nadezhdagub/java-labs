package lab3;

import javafx.scene.control.TextArea;

import java.util.Random;

public class Producer implements Runnable{

    private Random rand = new Random();

    TextArea inf;


    Producer(TextArea inf){


        this.inf=inf;
    }

    public String getName(){
        return "Producer " ;
    }


    public void run(){
        int n3 = 0;
        while (n3 < 3) {
            n3 += 1;
            int random = rand.nextInt(100 + 1);
            Lab3_main.store.put(random);
            inf.appendText(this.getName() + " " + Integer.toString(random) + "\n");
            Lab3_main.store.waitt();
        }
    }
}