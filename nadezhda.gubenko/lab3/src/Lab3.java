
public class Lab3 {

    static Store store = new Store();

    public static void main(String[] args) {

        try {
            if ((args.length != 1) || (Integer.parseInt(args[0]) < 1) || (args[0].contains("[0-9]+") == true))
                throw new ArithmeticException("Error");
            Producer producer = new Producer();
            Consumer consumer = new Consumer();

            new Thread(consumer).start();

            new Thread(producer).start();

        } catch (Exception e) {
            System.err.print(e.getMessage());
        }
    }
}
