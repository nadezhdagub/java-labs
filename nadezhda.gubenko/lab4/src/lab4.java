public class lab4 {

    public static void main(String[] args) {
        int tN = Integer.parseInt(args[0]);
        int sN = Integer.parseInt(args[1]);
        try {
            if (args.length != 2)
                throw new ArithmeticException(" Invalid number of arguments");
            Task[] threads = new Task[tN];

            for (int i = 0; i < tN; i++) {
                threads[i] = new Task(
                        i == 0 ? null : threads[i - 1],
                        sN,
                        i
                );
            }

            threads[0].setWait(threads[tN - 1]);
            threads[tN - 1].setLast(true);

            for (int i = tN; i > 0; i--) {
                new Thread(threads[i - 1]).start();
            }
        }
        catch (Exception e){
        System.err.println(e.getMessage());
    }




    }
}