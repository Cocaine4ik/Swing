import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

// utility for compare files and 
// finding differences in their location

public class FileCompAndLoc implements ActionListener{

	JTextField fileA;
	JTextField fileB;
	
	JButton buttonComp;
	
	JCheckBox locateCB;
	
	JLabel labelA, labelB;
	JLabel defineA, and, defineB;
	JLabel result;
	
	FileCompAndLoc() {
		
		JFrame frame = new JFrame("Compare files Utility");
		
		frame.setLayout(new FlowLayout());
		
		frame.setSize(400, 300);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		fileA = new JTextField(14);
		fileB = new JTextField(14);
		
		labelA = new JLabel("Enter the first file name: ");
		labelB = new JLabel("Enter the second file name: ");
		locateCB = new JCheckBox("Show defines.");
		defineA = new JLabel("");
		defineB = new JLabel("");
		and = new JLabel("");
		result = new JLabel("");
		
		buttonComp = new JButton("Compare");
		buttonComp.addActionListener(this);
		
		frame.add(labelA);
		frame.add(fileA);
		frame.add(labelB);
		frame.add(fileB);
		frame.add(locateCB);
		frame.add(buttonComp);
		frame.add(result);
		frame.add(defineA);
		frame.add(and);
		frame.add(defineB);
		
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
	int i = 0, j = 0;
	String defA = "";
	String defB = "";
		if(fileA.getText().equals("")) {
			result.setText("First file is missing");
			return;
		}
		if(fileB.getText().equals("")) {
			result.setText("Second file is missing");
			return;
		}
		
		try (FileInputStream fA =  new FileInputStream(fileA.getText());
				FileInputStream fB = new FileInputStream(fileB.getText())){
			do {
				i = fA.read();
				j = fB.read();
				
				defA += (char)i;
				defB += (char)j;

				if( (i != j) &&( (char)i == ' ' && (char)j == ' ')) break;
			}
			while (i != -1 && j != -1);
			
			defA = defA.substring(defA.length() - 20);
			defB = defB.substring(defB.length() - 20);
			
			if(i != j) {
				if(locateCB.isSelected()) {
					
					result.setText("Files differ in:");
					defineA.setText(defA);
					and.setText("and");
					defineB.setText(defB);
				}
				else 
					result.setText("Files are not the same");
			}
			else
				result.setText("File compare equal");
		}
		catch (IOException exc) {
			result.setText("File Error");
		}
	
	}

	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new FileCompAndLoc();
			}
		});
	}
}

