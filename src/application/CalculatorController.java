package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML
    private Button sin;

    @FXML
    private Button leftbrackets;

    @FXML
    private Button cos;

    @FXML
    private Button dot;

    @FXML
    private Button undo;

    @FXML
    private Button rightbrackets;

    @FXML
    private Button powerof;

    @FXML
    private Button allcrear;

    @FXML
    private Button delete;

    @FXML
    private Button devision;

    @FXML
    private Button equal;

    @FXML
    private Button times;

    @FXML
    private Button plus;

    @FXML
    private Button minus;

    @FXML
    private TextField display;

    private boolean start = true;
    private String operator;
    
    @FXML
    void processNumButAction(ActionEvent event) {
    		String buttonText = ((Button)event.getSource()).getText();
    		if(start) {
    			start = false;
    			display.setText(buttonText);
    		}
    		else {
    			display.setText(display.getText() + buttonText);
    		}
    }

    @FXML
    void processOperatorButAction(ActionEvent event) {
    		//String buttonText = ((Button)event.getSource()).getText();
    		operator = event.getSource().toString();
    		if(event.getSource() == equal) {
    			
    		}
    		else {
    			//calculation
    		}
    }

}
