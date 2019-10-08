public class Task  implements Runnable{

    private Object wait;
    private int count;
    private int number;
    private boolean last = false;


    public Task(Object wait, int count, int number) {
        this.wait =  wait;
        this.count = count;
        this.number = number;
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

            System.out.print(" Thread" + number);
            if (last) {
                System.out.println();
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
