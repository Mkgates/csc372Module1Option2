/**
 * This is for CSC372 - Module 2 Option 2 CT: Create a GUI application that calculates a user's age 
 * based on their birthdate.
 */

package csc372Module2Option2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
;
public class AgeCalculator {
	public static void main(String[] args) {
		// Create frame
		JFrame frame = new JFrame ("Age Calculator");
		frame.setSize (500,300);
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		//Create panel
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,1));
		
		//Create components
		JLabel label = new JLabel ("Enter your birthdate (YYYY-MM-DD):");
		JTextField birthdateField = new JTextField(10);
		JButton calculateButton = new JButton("Calculate Age");
		JLabel resultLabel = new JLabel("Your age will be displayed here.", SwingConstants.CENTER);
		
		//Action Listener
		calculateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String input = birthdateField.getText();
					LocalDate birthDate = LocalDate.parse(input, DateTimeFormatter.ISO_LOCAL_DATE);
					LocalDate today = LocalDate.now();
					int age = Period.between(birthDate, today).getYears();
					resultLabel.setText("Your age: " + age + " years");
					} catch (Exception ex) {
						resultLabel.setText("Invalid date format. Use YYYY-MM-DD.");
					}
			}
		});
		
		//Add componenets to panel
		panel.add(label);
		panel.add(birthdateField);
		panel.add(calculateButton);
		panel.add(resultLabel);
		
		//Add panel to frame
		frame.add(panel);
		frame.setVisible(true);;

	}

	
		
}

