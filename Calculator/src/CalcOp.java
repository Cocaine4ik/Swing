
public class CalcOp {
	
	public double Calculate(String op, double n, double res) {
		
			    if (op.equals("+"))
			      res += n;
			    
			    else if (op.equals("-"))
			      res -= n;
			    
			    else if (op.equals("x"))
			      res *= n;
			    
			    else if (op.equals("/"))
			      res /= n;
			    
			    else if (op.equals("="))
			      res = n;
			    
				if(op.equals("±"))
					res = n - n*2;
				
				if(op.equals("%"))
					res = n/100;
				
				if(op.equals("√"))
					res = Math.sqrt(n);
			    
			    return res;
	}
}
