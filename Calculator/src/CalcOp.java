
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
			    else if (op.equals("C"))
			    	res = 0;
			    return res;
	}
}
