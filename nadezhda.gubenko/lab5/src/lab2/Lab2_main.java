package lab2;

import java.awt.*;

import javafx.scene.control.TextArea;

public class Lab2_main {


    private static int arraySize;

    public static void work2(String args, TextArea input) {

        try {
            if ( (Integer.parseInt(args) < 1) || (args.contains("[0-9]+") == true))
                throw new ArithmeticException("Error");


            arraySize = Integer.parseInt(args);
            int n = Integer.parseInt(args);

            Object[] obj = new Object[n];

            int rn;
            for (int i = 0; i < n; i++) {
                rn = (int) (Math.random() * 4);
                switch (rn) {
                    case 0:

                        obj[i] = new Book();

                        break;
                    case 1:
                        obj[i] = new Shoe();
                        break;
                    case 2:
                        obj[i] = new Toy();
                        break;
                    case 3:
                        obj[i] = new Picture();
                        break;
                }
            }
            Object c = new Object();
            Toy toy = new Toy();
            Picture picture = new Picture();

            for (int i = 0; i < n; ++i) {
                if (obj[i] instanceof Shoe) {
                    c = obj[i];
                    ((Shoe) c).whoAmI(input);
                }
                if (obj[i] instanceof Toy) {
                    c = obj[i];
                    ((Toy) c).whoAmI(input);
                }
                if (obj[i] instanceof Picture) {
                    c = obj[i];
                    ((Picture) c).whoAmI(input);
                }
                if(obj[i] instanceof Book){
                    c = obj[i];
                    ((Book) c).whoAmI(input);
                }
            }
            input.appendText("----------------------------------" + "\n");

            for (int i = 0; i < n; ++i) {

                if (obj[i] instanceof Toy) {
                    input.appendText("Product:");
                    c = obj[i];
                    ((Toy) c).whoAmI(input);
                    input.appendText("Present:");
                    input.appendText(toy.it_can_be_presented("it can be presented" + "\n"));
                }
                if (obj[i] instanceof Picture) {
                    input.appendText("Product:");
                    c = obj[i];
                    ((Picture) c).whoAmI(input);
                    input.appendText("Present:");
                    input.appendText(picture.it_can_be_presented("it can be presented" + "\n"));
                }
            }

        } catch (Exception e) {
            System.err.print(e.getMessage());
        }
    }
}
