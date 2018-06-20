package CalcInterface;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class CalcFrame extends JFrame {

	public CalcFrame(String title) {
		
		super(title);
		
		setLayout(new BorderLayout());
		setSize(265, 415);
		getContentPane().setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setVisible(true);
	}
}
