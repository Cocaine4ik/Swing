package CalcInterface;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;

public class CalcDisplay extends JTextField {

	Font fDisplay = new Font("Comic Sans MS", Font.BOLD, 48);
	
	public CalcDisplay() {
		setBackground(new Color(0, 0, 0));
		setForeground(new Color(255, 255, 255));
		setBorder(null);
		setFont(fDisplay);
	}
}
