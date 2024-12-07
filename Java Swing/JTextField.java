import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame1 extends JFrame implements ActionListener {
	JButton button;
	JTextField textField;

	MyFrame1() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		button = new JButton("Submit");
		button.addActionListener(this);

		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250, 40));
		textField.setFont(new Font("Consolas", Font.PLAIN, 35));
		textField.setForeground(Color.green);
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.white);
		textField.setText("usename");

		this.add(button);
		this.add(textField);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {

			button.setEnabled(false);
			textField.setEnabled(false);

		}

	}

	public static void main(String[] args) {
		MyFrame1 myFrame = new MyFrame1();

	}
}
