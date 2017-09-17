package application;

import javafx.scene.control.Button;

public class Model {

	public long calculate(long firstnum, long secondnum, String operator) {
		System.out.println(operator); 
		switch(operator.toString()) {
			case "+":
				return firstnum + secondnum;
			case "-":
				return firstnum - secondnum;
			case "×":
				return firstnum * secondnum;
			case "÷":
				if(firstnum * secondnum == 0) {
					return 0;
				}
				return firstnum / secondnum;
				
		}
		System.out.println("Unknow operator " + operator);
		return 0;
	}
}
