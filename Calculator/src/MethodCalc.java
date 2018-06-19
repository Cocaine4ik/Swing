public class MethodCalc {
	public double calc(double n1, String op, double n2) {
		
		double res = 0;
		switch(op) {
		
		// plus
		case "+" :
			res = n1 + n2;
			break;
		
		// minus
		case "-" :
			res = n1 - n2;
			break;
			
		// division
		case "/" :
			res = n1 / n2;
			break;
			
		// percent
		case "%" : 
			res = res/100;
			
		// transform to positive or to negative
		case "±" :
			if(res > 0)
			res = (res*2) - res;
			else if (res < 0)
				res = (res*2) + res;
			else
				res = 0;
			break;
			
			// clear field
		case "C" :
			res = 0;
			break;	
		}
		return res;
	}
	
}
