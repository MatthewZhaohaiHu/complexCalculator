package application;

public class Model {

	public long calculation(long leftnum, long rightnum, String operator) {
		switch(operator) {
			case "plus":
				return leftnum + rightnum;
			case "minus":
				return leftnum - rightnum;
			case "times":
				return leftnum * rightnum;
			case "devision":
				if(leftnum * rightnum == 0) {
					return 0;
				}
				return leftnum / rightnum;
				
		}
		System.out.println("Unknow operator " + operator);
		return 0;
	}
}
