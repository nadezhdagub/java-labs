package lab3;

import javafx.scene.control.TextArea;

public class Consumer implements Runnable{

    TextArea inf;


    Consumer(TextArea inf){


        this.inf=inf;
    }

    public String getName(){
        return "Consumer " ;
    }

    public void run(){
        int n3 = 0;
        while (n3 < 3)
        {
            n3 += 1;

        int val = Lab3_main.store.get();

        inf.appendText(this.getName() + " " + val + "\n");
        Lab3_main.store.noty();
        Lab3_main.store.product= -1;
        }
    }
}