import java.awt.*;
import java.awt.font.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Calculator implements ActionListener, KeyListener{

	
	static final int n = 4;
	static final int k = 6;
	
	String textField= "";
	
	JTextField screen;
	
	JButton AC, negeativeAndPositive, percent,
	division, multiplication, minus, plus, equal;
	
	JButton one, two, three, four, five, six, seven,
	eight, nine, zero, comma;
	
	Calculator() {
		
		JFrame frame = new JFrame("Calculator");
		frame.setLayout(new GridLayout(n, k));
		frame.setSize(300, 400);
		frame.getContentPane().setBackground(new Color(33, 35, 36));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		frame.setVisible(true);
		
		screen = new JTextField(textField);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Calculator();
			}
		});
	}
}
