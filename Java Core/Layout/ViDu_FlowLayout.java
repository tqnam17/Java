package view;

import java.awt.FlowLayout;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_FlowLayout extends JFrame {
	public ViDu_FlowLayout() {
		this.setTitle("ViDu_FlowLayout");
		this.setSize(600, 400);
		// Căn giữa cửa sổ chương trình
		this.setLocationRelativeTo(null);

// Set Layout
		FlowLayout flowLayout = new FlowLayout();
		FlowLayout flowLayout_1= new FlowLayout(FlowLayout.RIGHT);
		FlowLayout flowLayout_2 = new FlowLayout(FlowLayout.CENTER, 100, 50);
		
		this.setLayout(flowLayout_2);

		JButton jButton1 = new JButton("1");
		JButton jButton2 = new JButton("2");
		JButton jButton3 = new JButton("3");
// add  thành phần
		this.add(jButton1);
		this.add(jButton2);
		this.add(jButton3);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new ViDu_FlowLayout();
	}
}
