import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Calculator implements ActionListener{

	static final int n = 4;
	static final int k = 6;
	
	JLabel screen;
	
	JButton AC, negeativeAndPositive, percent,
	division, multiplication, minus, plus, equal;
	
	JButton one, two, three, four, five, six, seven,
	eight, nine, zero, comma;
	
	Calculator() {
		
		JFrame frame = new JFrame("Calculator");
		frame.setLayout(new GridLayout(n, k));
		frame.setSize(200, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
