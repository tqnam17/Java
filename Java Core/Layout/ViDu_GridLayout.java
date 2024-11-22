package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_GridLayout extends JFrame {
	public ViDu_GridLayout() {
		this.setTitle("ViDu_GridLayout");
		this.setSize(600, 400);
		// Căn giữa cửa sổ chương trình
		this.setLocationRelativeTo(null);

// Set Layout
		GridLayout gridLayout = new GridLayout();
		GridLayout gridLayout_1 = new GridLayout(4, 4); // (dòng,cột)
		GridLayout gridLayout_2 = new GridLayout(4, 4, 50, 20); // (kc ngang, kc dọc)

		this.setLayout(gridLayout_2);

////		/*
//		  JButton jButton1 = new JButton("1"); 
////		  JButton jButton2 = new JButton("2");
////		  JButton jButton3 = new JButton("3");
////		  
////		  
////		  // add thành phần 
////		  this.add(jButton1); this.add(jButton2); this.add(jButton3);
////		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
////		  this.setVisible(true);
////		 
//	 */

		for (int i = 0; i < 16; i++) {
			JButton jButton = new JButton(i + "");
			this.add(jButton);
		}
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new ViDu_GridLayout();
	}
}
