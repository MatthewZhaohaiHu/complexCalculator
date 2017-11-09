package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {


    @FXML
    private TextField display;

    private boolean start = true;
    private String operator = "";
    private float firstnum = 0;
    private Model model = new Model();
    
    @FXML
    void processNumButAction(ActionEvent event) {
    		//dot also consider as a "Number" button	
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

    		if(!"=".equals(buttonText)) { //when not equal to final calculator sign
  			if(!operator.isEmpty())	 //do calculation before move to next operator 
   				return;
    			operator = buttonText;
    			firstnum = Float.parseFloat(display.getText());
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
