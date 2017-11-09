package application;

import javafx.scene.control.Button;
import static java.lang.Math.pow;

public class Model {

	public float calculate(float firstnum, float secondnum, String operator) {
		switch(operator.toString()) {
			case "+":
				return firstnum + secondnum;
			case "-":
				return firstnum - secondnum;
			case "×":
				return firstnum * secondnum;
			case "÷":
				if(firstnum * secondnum == 0)
					return 0;
				return firstnum / secondnum;
			case "(": // dont need num
				return 0;
			case ")":  // dont need num
				return 0;
			case ".": //only need 1 number
				return 0;
			case "a^b": 
				return (long) Math.pow(firstnum, secondnum);
			case "DEL": //only need 1 number
				return 0;
		}
		System.out.println("Unknow operator " + operator);
		return 0;
	}
}
