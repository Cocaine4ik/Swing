import java.awt.*;
import java.awt.font.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import Buttons.*;

public class Calculator{

	Double res;
	Double res1;
	
	String textField= "";
	
	JTextField mainScreen;
	
	JButton bC, bNegAndPos, bPercent,
	bDivision, bMulti, bMinus, bPlus, bRes;
	
	JButton b1, b2, b3, b4, b5, b6, b7,
	b8, b9, b0, bComma;
	
	Font fScreen;
	
	Calculator() {
		
		JFrame frame = new JFrame("Calculator");
		frame.setLayout(null);
		frame.setSize(265, 415);
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		frame.setVisible(true);
		
		// fonts options
		fScreen = new Font("Comic Sans MS", Font.BOLD, 48);
		
		// First row. Main Screen
		mainScreen = new JTextField();
		mainScreen.setBounds(10, 20, 230, 50);
		mainScreen.setBackground(new Color(0, 0, 0));
		mainScreen.setForeground(new Color(255, 255, 255));
		mainScreen.setBorder(null);
		mainScreen.setFont(fScreen);
		
		// Second Row. Four buttons:
		// Clear Button styles and options
		bC = new GreyRoundButton("Ñ");
		bC.setBounds(10, 80, 50, 50);
		
		// Negative & Positive Button styles and options
		bNegAndPos = new GreyRoundButton("±");
		bNegAndPos.setBounds(70, 80, 50, 50);
		
		// Percent Button styles and options
		bPercent = new GreyRoundButton("%");
		bPercent.setBounds(130, 80, 50, 50);
		
		// Division Button styles and options
		bDivision = new BlueRoundButton("/");
		bDivision.setBounds(190, 80, 50, 50);
		
		// Second Row. Four buttons:
		// Number "7" Button styles and options
		b7 = new RoundButton("7");
		b7.setBounds(10, 140, 50, 50);
		
		// Number "8" Button styles and options
		b8 = new RoundButton("8");
		b8.setBounds(70, 140, 50, 50);
		
		// Number "9" Button styles and options
		b9 = new RoundButton("9");
		b9.setBounds(130, 140, 50, 50);
		
		// Multiplication Button styles and options
		bMulti = new BlueRoundButton("x");
		bMulti.setBounds(190, 140, 50, 50);
		
		// Third Row. Four buttons:
		// number "4" Button styles and options
		b4 = new RoundButton("4");
		b4.setBounds(10, 200, 50, 50);
		
		// Number "5" Button styles and options
		b5 = new RoundButton("5");
		b5.setBounds(70, 200, 50, 50);
		
		// Number "6" Button styles and options
		b6 = new RoundButton("6");
		b6.setBounds(130, 200, 50, 50);
		
		// Minus Button styles and options
		bMinus = new BlueRoundButton("-");
		bMinus.setBounds(190, 200, 50, 50);
		
		// Fourth row. Four buttons:
		// Number "1" Button styles and options
		b1 = new RoundButton("1");
		b1.setBounds(10, 260, 50, 50);
		
		// Number "2" Button styles and options
		b2 = new RoundButton("2");
		b2.setBounds(70, 260, 50, 50);
		
		// Number "3" Button styles and options
		b3 = new RoundButton("3");
		b3.setBounds(130, 260, 50, 50);
		
		// Plus Button styles and options
		bPlus = new BlueRoundButton("+");
		bPlus.setBounds(190, 260, 50, 50);
		
		// Fifth row. Four buttons:
		// Number "0" Button styles and options
		b0 = new RoundButton("0");
		b0.setBounds(10, 320, 110, 50);
		
		// Comma Button styles and options
		bComma = new RoundButton(",");
		bComma.setBounds(130, 320, 50, 50);
			
		// Equal Button styles and options
		bRes = new BlueRoundButton("=");
		bRes.setBounds(190, 320, 50, 50);
		
		frame.add(mainScreen);
	
		frame.add(bC);
		frame.add(bNegAndPos);
		frame.add(bPercent);
		frame.add(bDivision);
		frame.add(b7);
		frame.add(b8);
		frame.add(b9);
		frame.add(bMulti);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		frame.add(bMinus);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(bPlus);
		frame.add(b0);
		frame.add(bComma);
		frame.add(bRes);
				
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				mainScreen.setText(mainScreen.getText() + 1);
				if (res == null) {
					res = Double.valueOf(mainScreen.getText());
				}
				else {
					res1 = Double.valueOf(mainScreen.getText());
				}
				
			}
			
		});
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				mainScreen.setText(mainScreen.getText() + 2);
				if (res == null) {
					res = Double.valueOf(mainScreen.getText());
				}
				else {
					res1 = Double.valueOf(mainScreen.getText());
				}
				
			}
			
		});
		
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				mainScreen.setText(mainScreen.getText() + 3);
				if (res == null) {
					res = Double.valueOf(mainScreen.getText());
				}
				else {
					res1 = Double.valueOf(mainScreen.getText());
				}
				
			}
			
		});
		
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				mainScreen.setText(mainScreen.getText() + 4);
				if (res == null) {
					res = Double.valueOf(mainScreen.getText());
				}
				else {
					res1 = Double.valueOf(mainScreen.getText());
				}
				
			}
			
		});
		
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				mainScreen.setText(mainScreen.getText() + 5);
				if (res == null) {
					res = Double.valueOf(mainScreen.getText());
				}
				else {
					res1 = Double.valueOf(mainScreen.getText());
				}
				
			}
			
		});
		
		
		b6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				mainScreen.setText(mainScreen.getText() + 6);
				if (res == null) {
					res = Double.valueOf(mainScreen.getText());
				}
				else {
					res1 = Double.valueOf(mainScreen.getText());
				}
				
			}
			
		});
		
		b7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				mainScreen.setText(mainScreen.getText() + 7);
				if (res == null) {
					res = Double.valueOf(mainScreen.getText());
				}
				else {
					res1 = Double.valueOf(mainScreen.getText());
				}
				
			}
			
		});
		
		b8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				mainScreen.setText(mainScreen.getText() + 8);
				if (res == null) {
					res = Double.valueOf(mainScreen.getText());
				}
				else {
					res1 = Double.valueOf(mainScreen.getText());
				}
				
			}
			
		});
		
		b9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				mainScreen.setText(mainScreen.getText() + 9);
				if (res == null) {
					res = Double.valueOf(mainScreen.getText());
				}
				else {
					res1 = Double.valueOf(mainScreen.getText());
				}
				
			}
			
		});
		
		b0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				mainScreen.setText(mainScreen.getText() + 0);
				if (res == null) {
					res = Double.valueOf(mainScreen.getText());
				}
				else {
					res1 = Double.valueOf(mainScreen.getText());
				}
				
			}
			
		});
		
		bPlus.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {
			res = Double.valueOf(mainScreen.getText());
			textField = "+";
			}			
		});
		
		bMinus.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {
			res = Double.valueOf(mainScreen.getText());
			textField = "-";
			}			
		});
		
		bMulti.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent ae) {
				res = Double.valueOf(mainScreen.getText());
				textField = "*";
			}
		});
		
		bDivision.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent ae) {
				res = Double.valueOf(mainScreen.getText());
				textField = "/";
			}
		});
		bRes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				// TODO Auto-generated method stub
				double num = Double.valueOf(res);
				double num1 = Double.valueOf(res1);
				String tf = textField;
				
				MethodCalc mc = new MethodCalc();
				String Result = String.valueOf(mc.calc(num, tf, num1));
				mainScreen.setText(Result);
				
			}
		});
}

	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Calculator();
			}
		});
	}
}
