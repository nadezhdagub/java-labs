
public class lab1 {

    public static void main(String[] args) {
        try {
            if(args.length != 3)
                throw new ArithmeticException(" Invalid number of arguments");

            api api = new api(args[0], args[1], args[2]);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
