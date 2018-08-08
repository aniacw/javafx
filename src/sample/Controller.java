package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;

public class Controller {
//    @FXML
//    private Button button;

    @FXML
    private Slider slider;

    @FXML
    private Label label;

    @FXML
    public void initialize(){
        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                label.setText(String.valueOf(newValue));
            }
        });
    }

    @FXML
    public void onButtonClick(javafx.event.ActionEvent e){
        //button.setText(button.getText() + ".");
    ListV
    }

}
