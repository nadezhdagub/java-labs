public class Lab2 {


  //  private static int arraySize;

    public static void main(String[] args) {

        try {
            if ((args.length != 1) || (Integer.parseInt(args[0]) < 1) || (args[0].contains("[0-9]+") == true))
                throw new ArithmeticException("Error");


            int n = Integer.parseInt(args[0]);

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
            Object c ;
            Toy toy = new Toy();
            Picture picture = new Picture();

            for (int i = 0; i < n; ++i) {
                if (obj[i] instanceof Book) {
                    c = obj[i];
                    ((Book) c).whoAmI();
                }
                if (obj[i] instanceof Shoe) {
                    c = obj[i];
                    ((Shoe) c).whoAmI();
                }
                if (obj[i] instanceof Toy) {
                    c = obj[i];
                    ((Toy) c).whoAmI();
                }
                if (obj[i] instanceof Picture) {
                    c = obj[i];
                    ((Picture) c).whoAmI();
                }
            }
            System.out.println("----------------------------------");

            for (int i = 0; i < n; ++i) {

                if (obj[i] instanceof Toy) {
                    System.out.print("Product:");
                    c = obj[i];
                    ((Toy) c).whoAmI();
                    System.out.print("Present:");
                    System.out.println(toy.it_can_be_presented("it    presented"));
                }
                if (obj[i] instanceof Picture) {
                    System.out.print("Product:");
                    c = obj[i];
                    ((Picture) c).whoAmI();
                    System.out.print("Present:");
                    System.out.println(picture.it_can_be_presented("it presented"));
                }
            }

        } catch (Exception e) {
            System.err.print(e.getMessage());
        }
    }
}
