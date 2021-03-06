package CalcButtons;
import java.awt.*;
import java.awt.geom.Ellipse2D;

import javax.swing.*;

public class RoundButton extends JButton {
	
	Font fScreen, fButton;
	
  public RoundButton(String label) {
    super(label);

// These statements enlarge the button so that it 
// becomes a circle rather than an oval.
    Dimension size = getPreferredSize();
    size.width = size.height = Math.max(size.width, 
      size.height);
    setPreferredSize(size);
    
    // Set off all borders
    setBorderPainted(false);
	setFocusPainted(false);
	setContentAreaFilled(false);
	
	setBackground(new Color(59, 59, 59));
	setForeground(new Color(255, 255, 255));
	fScreen = new Font("Comic Sans MS", Font.BOLD, 48);
	fButton = new Font("Comic Sans MS", Font.BOLD, 20);
	
	setFont(fButton);
  }

// Paint the round background and label.
  protected void paintComponent(Graphics g) {
    if (getModel().isArmed()) {
// You might want to make the highlight color 
   // a property of the RoundButton class.
      g.setColor(Color.lightGray);
    } else {
      g.setColor(getBackground());
    }
    g.fillOval(0, 0, getSize().width-1, 
      getSize().height-1);

// This call will paint the label and the 
   // focus rectangle.
    super.paintComponent(g);
  }

// Hit detection.
  Shape shape;
  public boolean contains(int x, int y) {
// If the button has changed size, 
   // make a new shape object.
    if (shape == null || 
      !shape.getBounds().equals(getBounds())) {
      shape = new Ellipse2D.Float(0, 0, 
        getWidth(), getHeight());
    }
    return shape.contains(x, y);
  }
}
