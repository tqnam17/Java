import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {

//	Calendar calendar;
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	JLabel timeLable;
	JLabel dayLable;
	JLabel dateLable;
	String time;
	String day;
	String date;
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Clock Program");
		this.setLayout(new FlowLayout());
		this.setSize(350, 200);
		this.setResizable(false);

		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		dayFormat = new SimpleDateFormat("EEEE");
		dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
		
		timeLable = new JLabel();
		timeLable.setFont(new Font("ＭＳ 明朝", Font.PLAIN, 50));
		timeLable.setForeground(new Color(0x00FF00));
		timeLable.setBackground(Color.black);
		timeLable.setOpaque(true);

		dayLable = new JLabel();
		dayLable.setFont(new Font("ＭＳ 明朝", Font.PLAIN, 45));
		
		dateLable = new JLabel();
		dateLable.setFont(new Font("ＭＳ 明朝", Font.PLAIN, 45));
		
		this.add(timeLable);
		this.add(dayLable);
		this.add(dateLable);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

		setTime();

	}

	private void setTime() {
		while (true) {
			time = timeFormat.format(Calendar.getInstance().getTime());
			timeLable.setText(time);
			
			day = dayFormat.format(Calendar.getInstance().getTime());
			dayLable.setText(day);
			
			date = dateFormat.format(Calendar.getInstance().getTime());
			dateLable.setText(date);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
	public static void main(String[] args) {
		new MyFrame();
	}
}
