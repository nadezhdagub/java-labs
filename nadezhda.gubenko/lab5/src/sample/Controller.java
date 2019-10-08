package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import static lab1.lab1_main.work1;
import static lab2.Lab2_main.work2;
import static lab3.Lab3_main.work3;
import static lab4.lab4_main.work4;


public class Controller {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button b1;

    @FXML
    private Button b2;

    @FXML
    private Button b3;

    @FXML
    private Button b4;

    @FXML
    private TextArea t1;

    @FXML
    private TextArea t2;

    @FXML
    private TextArea t3;

    @FXML
    private TextArea t4;



    @FXML
    void initialize() {


        b1.setOnAction(event -> {
            t1.setText(null);
            String[] mass = {t2.getText(),t3.getText(),t4.getText()};
                    try {
                        if ((mass.length != 1) || (Integer.parseInt(mass[0]) < 1)) {
                            work1(mass, t1);
                            t2.setText(null);
                            t3.setText(null);
                            t4.setText(null);
                        }

                    } catch (Exception e) {
                        System.err.print(e.getMessage());
                    }

        });

        b2.setOnAction(event -> {
            t1.setText(null);
            String t = t2.getText();
                    try {
                        if ((Integer.parseInt(t) < 1)) {
                            work2(t, t1);
                            t2.setText(null);
                            t3.setText(null);
                            t4.setText(null);
                        }

                    } catch (Exception e) {
                        System.err.print(e.getMessage());
                    }

        });

        b3.setOnAction(event -> {
 t1.setText(null);

            work3(t1);
            t2.setText(null);
            t3.setText(null);
            t4.setText(null);
        });

        b4.setOnAction(event -> {
// res.setText(null);

            String[] mass = {t2.getText(), t3.getText()};
            try {
                if ((mass.length != 1) || (Integer.parseInt(mass[0]) < 1)) {
                    work4(mass, t1);
                    t2.setText(null);
                    t3.setText(null);
                    t4.setText(null);
                }
            } catch (Exception e) {
                System.err.print(e.getMessage());
            }

        });

    }
}
