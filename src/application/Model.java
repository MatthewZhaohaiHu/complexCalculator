package application;

import javafx.scene.control.Button;

public class Model {

	public long calculate(long firstnum, long secondnum, String operator) {
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
			case "(":
				return 0;
			case ")":
				return 0;
			case ".":
				return 0;
			case "a^b": //power sign
				return 0;
			case "DEL":
				return 0;
		}
		System.out.println("Unknow operator " + operator);
		return 0;
	}
}
