package lab3;

import javafx.scene.control.TextArea;

public class Lab3_main {

    static Store store = new Store();

    public static void work3( TextArea input) {

        Producer producer = new Producer(input);
        Consumer consumer = new Consumer(input);

        new Thread(consumer).start();

        new Thread(producer).start();
    }
}
