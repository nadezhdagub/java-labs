package lab1;

import javafx.scene.control.TextArea;

public class lab1_main {

    public static void work1(String[] args, TextArea inpu) {
        try {
            if(args.length != 3)
                throw new ArithmeticException(" Invalid number of arguments");

            api api = new api(args[0], args[1], args[2], inpu);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
