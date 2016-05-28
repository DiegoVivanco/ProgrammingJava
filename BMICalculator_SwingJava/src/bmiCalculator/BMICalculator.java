package bmiCalculator;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
//import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class BMICalculator {
	private final JTextField txtMass = makePrettyTextField();
	private final JTextField txtHeight = makePrettyTextField();
	private final JButton btnCalc = makePrettyButton("Calculate BMI");
	
	private final BMICalculator self = this;

	public BMICalculator() {
		
		// Construimos el Frame
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("BMI Calculator");
		
		// Definir el tamaño de los textBox
		txtMass.setPreferredSize(new Dimension(200,30));
		txtHeight.setPreferredSize(new Dimension(200,30));
		txtMass.setMaximumSize(txtMass.getPreferredSize());
		txtHeight.setMaximumSize(txtHeight.getPreferredSize());
		
		// Añadir los paneles y sus propiedades
		frame.getContentPane().setLayout(
			new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
		
		frame.getContentPane().setBackground(new Color(232, 240, 255));
		
		frame.getContentPane().add(makePrettyLabel("Your mass (kg):"));
		frame.getContentPane().add(Box.createRigidArea(new Dimension(5,5)));
		frame.getContentPane().add(txtMass);
		frame.getContentPane().add(Box.createRigidArea(new Dimension(5,5)));
		
		frame.getContentPane().add(Box.createVerticalGlue());
		
		frame.getContentPane().add(makePrettyLabel("Your height (cm):"));
		frame.getContentPane().add(Box.createRigidArea(new Dimension(5,5)));
		frame.getContentPane().add(txtHeight);
		frame.getContentPane().add(Box.createRigidArea(new Dimension(5,5)));
		
		frame.getContentPane().add(Box.createVerticalGlue());
		frame.getContentPane().add(btnCalc);
		frame.getContentPane().add(Box.createRigidArea(new Dimension(5,5)));

		// pack y hacer visible
		frame.pack();
		frame.setVisible(true);
	}
	
	protected double calculateBMI(double mass, double height) {
		return mass / Math.pow(height/100.0, 2.0);
		}
		// estilo de los componentes
	
		private JLabel makePrettyLabel(String title) {
			JLabel label = new JLabel(title);
			label.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
			label.setForeground(new Color(53, 124, 255));
			return label;
			}
	
		private JButton makePrettyButton(String title) {
			JButton button = new JButton(title);
			button.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
			button.setBorder(BorderFactory.createRaisedBevelBorder());
			button.setBackground(Color.white);
			button.setForeground(new Color(53, 124, 255));
			return button;
			}
		
		private JTextField makePrettyTextField() {
			JTextField field = new JTextField();
			field.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 14));
			field.setHorizontalAlignment(JTextField.RIGHT);
			field.setBorder(BorderFactory.createLoweredBevelBorder());
			return field;
		}
		
		
		// Add BMI calculation
		btnCalc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				double mass;
				double height;
					try {
						mass = Double.parseDouble(txtMass.getText());
						height = Double.parseDouble(txtHeight.getText());
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(self,
								"Please enter a valid number for mass and height.",
								"Input error",
								JOptionPane.ERROR_MESSAGE);
						return;
					}
					double result = calculateBMI(mass, height);
					JOptionPane.showMessageDialog(self,
							"Your BMI is: " + (Math.round(result*100.0)/100.0),
							"Your BMI result",
							JOptionPane.PLAIN_MESSAGE);
					}
					});

}
}
