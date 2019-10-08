package lab2;

import javafx.scene.control.TextArea;


public  class Book implements Product {
    @Override
    public  void whoAmI(TextArea inf) {
        inf.appendText("Shoe" + "\n");
    }
}