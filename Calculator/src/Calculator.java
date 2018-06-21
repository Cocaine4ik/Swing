import java.awt.*;
import java.awt.font.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import CalcButtons.*;
import CalcInterface.*;
import CalcInterface.CalcDisplay;
import CalcInterface.CalcFrame;
import CalcInterface.CalcPanel;

public class Calculator implements ActionListener{

	boolean flag = true;
	
	double res = 0;
	
	String bNames = "C±%/789x456-123+0√.=";
	String op = "=";
	JTextField display;
	JPanel panel;
	JButton button;
	CalcOp cOp;	
	Calculator() {
		
		// Create main frame
		JFrame frame = new CalcFrame("Calculator");
		
		display = new CalcDisplay();
		frame.add(display, "North");
		
		panel = new CalcPanel();
	    
	    
	    for (int i = 0; i < bNames.length(); i++) {
	    	
	    	if(i == 0 || i == 1 || i == 2)
	    		button = new GreyRoundButton(bNames.substring(i, i + 1));
	    	
	    	else if(i == 3 || i == 7 || i == 11 || i == 15 || i == 19)
	    		button = new BlueRoundButton(bNames.substring(i, i + 1));
	    	
	    	else 
		        button = new RoundButton(bNames.substring(i, i + 1));

	        panel.add(button);
	        button.addActionListener(this);
	      }
	    frame.add(panel, "Center");
}
	
	public void actionPerformed(ActionEvent ae) {
		
		String gAC = ae.getActionCommand();
    	cOp = new CalcOp();
        double x = 0;
        
		if(gAC.charAt(0) >= '0' && gAC.charAt(0) <= '9' || gAC.equals(".")) {
			
	        if(flag)
	        	 display.setText(gAC);
	        else
	        	display.setText(display.getText() + gAC);
        	flag = false;
		        }
		
		else if(gAC.equals("C")) {		
				gAC = "";
				res = 0;
				display.setText(gAC);
		}
		else{
		        x = Double.parseDouble(display.getText());
		        res = cOp.Calculate(op, x, res);
		        display.setText("" + res);
		        op = gAC;
		        flag = true;
		      }
		}		
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Calculator();
			}
		});
	}
}