package lab4;

import javafx.scene.control.TextArea;

public class Task  implements Runnable{

    private Object wait;
    private int count;
    private int number;
    private boolean last = false;
    TextArea inf;


    public Task(Object wait, int count, int number, TextArea inf) {
        this.wait =  wait;
        this.count = count;
        this.number = number;
        this.inf = inf;
    }


    @Override
    public void run() {

        for (int i=0; i<count; ++i) {

            if (wait != null && !(number == 0 && i == 0))
                synchronized(wait) {
                    try {
                        wait.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            inf.appendText(" Thread" + number);
            if (last) {
                inf.appendText(  "\n");
            }

            synchronized(this) {
                this.notify();
            }

        }
    }

    public void setWait(Object wait) {
        this.wait = wait;
    }

    public void setLast(boolean last) {
        this.last = last;
    }
}
