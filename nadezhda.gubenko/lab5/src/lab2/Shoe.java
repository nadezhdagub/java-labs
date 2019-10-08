package lab2;

import javafx.scene.control.TextArea;


public  class Shoe implements Product {
    @Override
    public  void whoAmI(TextArea inf) {
        inf.appendText("Shoe" + "\n");
    }
}