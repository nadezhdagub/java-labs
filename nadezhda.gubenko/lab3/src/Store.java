class Store{
     int product = -1;


    public synchronized int get() {
        synchronized
        while (product < 0) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        return product;
    }
    public synchronized void noty() {
        notify();
    }



    public synchronized void waitt() {
        try {
            wait();
        }
        catch (InterruptedException e) {
        }
    }

    public synchronized void put(int number) {
        product = number;
        notify();
    }
}