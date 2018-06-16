// java help reference system 
// with Swing usage

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Help implements ListSelectionListener {

	
	JList <String> menu;
	JLabel helpon;
	JScrollPane scroll;
	
	String menuList [] = {
		"1. If", "2. Switch", "3. For", "4. While",
		"5. Do-while", "6. Break", "7. Continue"
	};
	
	Help() {
		JFrame frame = new JFrame("Help On");
		
		frame.setLayout(new FlowLayout());
		frame.setSize(200, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		menu = new JList <String> (menuList);
		menu.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scroll = new JScrollPane(menu);
		scroll.setPreferredSize(new Dimension(120, 130));
		
		helpon = new JLabel("<html> <h1>Help ON</h1> </html>");
		
		menu.addListSelectionListener(this);
		
		frame.add(scroll);
		frame.add(helpon);
		
		frame.setVisible(true);
	}
	
	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		
		int idx = menu.getSelectedIndex();
		
		if(idx != -1) {
			switch(idx) {
			case 0 : helpon.setText("<html> The if <br> if(condtion) statement </html>"); break;
			
			case 1 : helpon.setText("<html> The switch <br> if(condtion) statement <br> switch(expression) { <br> case constant: <br> "
					+ "Statement sequence <br> break; <br> //... <br>  } </html>"); break;
			
			case 2 : helpon.setText("<html> The for <br> for(init; condition; iteration) <br> statement; </html>"); break;
			
			case 3 : helpon.setText("<html> The while <br> while(condition)statement; </html>"); break;
			
			case 4 : helpon.setText("<html> The do-while <br> do { <br> statement <br> } while(condition); </html>"); break;
			
			case 5 : helpon.setText("<html> The break <br> breal; or break label; </html>"); break;
			
			case 6 : helpon.setText("<html> The continue <br> continue; or continue label; </html>"); break;
			}
			
			}
		else // else ask again to make a choice
			helpon.setText("Help On");
	}
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Help();
			}
		});
	}
}
