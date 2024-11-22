package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main_Border {
	public static void main(String[] args) {

		JFrame fram = new JFrame();
		fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fram.setSize(500, 500);
		fram.setLayout(new BorderLayout(10, 10));
		fram.setVisible(true);

		JPanel jPanel1 = new JPanel();
		JPanel jPanel2 = new JPanel();
		JPanel jPanel3 = new JPanel();
		JPanel jPanel4 = new JPanel();
		JPanel jPanel5 = new JPanel();

		jPanel1.setBackground(Color.red);
		jPanel2.setBackground(Color.red);
		jPanel3.setBackground(Color.red);
		jPanel4.setBackground(Color.red);
		jPanel5.setBackground(Color.red);

		jPanel1.setPreferredSize(new Dimension(100, 100));
		jPanel2.setPreferredSize(new Dimension(100, 100));
		jPanel3.setPreferredSize(new Dimension(100, 100));
		jPanel4.setPreferredSize(new Dimension(100, 100));
		jPanel5.setPreferredSize(new Dimension(100, 100));

		/// ----------sub

		JPanel jPanel6 = new JPanel();
		JPanel jPanel7 = new JPanel();
		JPanel jPanel8 = new JPanel();
		JPanel jPanel9 = new JPanel();
		JPanel jPanel10 = new JPanel();

		jPanel6.setBackground(Color.green);
		jPanel7.setBackground(Color.black);
		jPanel8.setBackground(Color.blue);
		jPanel9.setBackground(Color.orange);
		jPanel10.setBackground(Color.yellow);

		jPanel5.setLayout(new BorderLayout());

		jPanel6.setPreferredSize(new Dimension(50, 50));
		jPanel7.setPreferredSize(new Dimension(50, 50));
		jPanel8.setPreferredSize(new Dimension(50, 50));
		jPanel9.setPreferredSize(new Dimension(50, 50));
		jPanel10.setPreferredSize(new Dimension(50, 50));

		jPanel5.add(jPanel6, BorderLayout.NORTH);
		jPanel5.add(jPanel7, BorderLayout.WEST);
		jPanel5.add(jPanel8, BorderLayout.EAST);
		jPanel5.add(jPanel9, BorderLayout.SOUTH);
		jPanel5.add(jPanel10, BorderLayout.CENTER);

		fram.add(jPanel1, BorderLayout.NORTH);
		fram.add(jPanel2, BorderLayout.WEST);
		fram.add(jPanel3, BorderLayout.EAST);
		fram.add(jPanel4, BorderLayout.SOUTH);
		fram.add(jPanel5, BorderLayout.CENTER);

	}
}
