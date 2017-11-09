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

    		if(!"=".equals(buttonText)) { 
  			if(!operator.isEmpty())	 
   				return;
    			operator = buttonText;
    			firstnum = Float.parseFloat(display.getText());
    			System.out.println("1st "+firstnum);
    			if ("DEL".equals(operator)) {
      				firstnum = 0;
      				display.setText("");
      				operator = "";
      				return;		
    			}
    			display.setText("");
    		}
    		else {
			if(operator.isEmpty())
				return; 
    			display.setText(String.valueOf(model.calculate(firstnum, Long.parseLong(display.getText()), operator)));
    			operator = "";
    			start = true;
    		}
    }
    
    

}
