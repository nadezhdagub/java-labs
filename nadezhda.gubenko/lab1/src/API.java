import java.io.IOException;

class api {

    private float __operand1, __operand2;

    private Float performOperation(String operation){
        try {
            switch (operation){
                case "+" : return __Plus();
                case "-" : return __Minus();
                case "*" : return __Multiply();
                case "/" : return __Divide();

                default : {
                    throw new IOException("Operand not recognised! Please provide a new input");
                }
            }
        }
        catch (Exception e){
            System.out.print("Exception::" + e);
            return null;
        }
    }

    public api(String operand1, String operation, String operand2){
        try {
            __operand1 = Float.parseFloat(operand1);
            __operand2 = Float.parseFloat(operand2);
            System.out.print("Oper1 = " + operand1 + "\n");
            System.out.print("Operation = " + operation + '\n');
            System.out.print("Oper2 = " + operand2 + '\n');
            System.out.print(performOperation(operation));
        }
        catch (Exception e){
            System.out.print("Exception::" + e);
        }
    }
    private Float __Plus(){
        System.out.print("Sum = ");
        return __operand1 + __operand2;
    }
    private Float __Minus(){
        System.out.print("Minus = ");
        return __operand1 - __operand2;
    }
    private Float __Multiply(){
        System.out.print("Multi = ");
        return __operand1 * __operand2;
    }
    private  Float __Divide(){
        System.out.print("Division = ");
        return __operand1 / __operand2;
    }
}

