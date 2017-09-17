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
    private String operator = "";
    private long firstnum = 0;
    private Model model = new Model();
    
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
    		String buttonText = ((Button)event.getSource()).getText();

    		if(!"=".equals(buttonText)) {
  			if(!operator.isEmpty())
   				return;
    			operator = buttonText;
    			firstnum = Long.parseLong(display.getText());
    			display.setText("");
    		}
    		else {
    			
			if(operator.isEmpty())
				return; //cal dont know what to do
    			
    			display.setText(String.valueOf(model.calculate(firstnum, Long.parseLong(display.getText()), operator)));
    			
    			operator = "";
    			start = true;
    		}
    }

}
