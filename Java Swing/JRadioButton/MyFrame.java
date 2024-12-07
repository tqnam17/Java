import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener {

	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotdogButton;

	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		ImageIcon pizzaIcon = new ImageIcon("pizza.png");
		ImageIcon humbergerIcon = new ImageIcon("humberger.png");
		ImageIcon hotdogIcon = new ImageIcon("hotdog.png");

		pizzaButton = new JRadioButton("Pizza");
		hamburgerButton = new JRadioButton("Humburger");
		hotdogButton = new JRadioButton("Hotdog");

		pizzaButton.setIcon(pizzaIcon);
		hamburgerButton.setIcon(humbergerIcon);
		hotdogButton.setIcon(hotdogIcon);

		ButtonGroup group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(hamburgerButton);
		group.add(hotdogButton);

		pizzaButton.addActionListener(this);
		hamburgerButton.addActionListener(this);
		hotdogButton.addActionListener(this);

		this.add(pizzaButton);
		this.add(hamburgerButton);
		this.add(hotdogButton);

		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == pizzaButton) {
			System.out.println("You ordered pizza!");
		} else if (e.getSource() == hamburgerButton) {
			System.out.println("You ordered a hamburger!");
		} else if (e.getSource() == hotdogButton) {
			System.out.println("You ordered a hotdog!");
		}
	}
}
