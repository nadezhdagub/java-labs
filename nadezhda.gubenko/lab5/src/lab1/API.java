package lab1;

import javafx.scene.control.TextArea;
import java.io.IOException;


class api {

    private double __operand1, __operand2;


    public api(String operand1, String operation, String operand2, TextArea inf) {
        try {
            __operand1 = Double.parseDouble(operand1);
            __operand2 = Double.parseDouble(operand2);
            inf.appendText("Oper1 = " + operand1 + "\n");
            inf.appendText("Operation = " + operation + '\n');
            inf.appendText("Oper2 = " + operand2 + '\n');
            String res1 = Double.toString(__operand1 + __operand2);
            String res2 = Double.toString(__operand1 - __operand2);
            String res3 = Double.toString(__operand1 * __operand2);
            String res4 = Double.toString(__operand1 / __operand2);
            switch (operation) {
                case "+":
                    inf.appendText(res1);
                    break;
                case "-":
                    inf.appendText(res2);
                    break;
                case "*":
                    inf.appendText(res3);
                    break;
                case "/":
                    inf.appendText(res4);
                    break;
            }
        } catch (Exception e) {
            System.out.print("Exception::" + e);
        }
    }


}

