package lab2;


import javafx.scene.control.TextArea;

public class Toy implements Present {
    @Override
    public void whoAmI(TextArea inf) {
        inf.appendText("Toy" + "\n");
    }

    @Override

    public String it_can_be_presented(String i) {
        return i;
    }
}