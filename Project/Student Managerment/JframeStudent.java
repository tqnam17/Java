package ConnData;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JframeStudent extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtMajor;
	private JTextField txtScore;
	private static JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JframeStudent frame = new JframeStudent();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JframeStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 991, 658);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Student Managerment");
		lblNewLabel.setFont(new Font("MS UI Gothic", Font.PLAIN, 30));
		lblNewLabel.setBounds(350, 10, 289, 111);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		lblNewLabel_1.setBounds(40, 150, 93, 36);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Age");
		lblNewLabel_1_1.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(40, 200, 93, 36);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Gender");
		lblNewLabel_1_2.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(40, 250, 93, 36);
		contentPane.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("Major");
		lblNewLabel_1_3.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(40, 300, 93, 36);
		contentPane.add(lblNewLabel_1_3);

		JLabel lblNewLabel_1_4 = new JLabel("Score");
		lblNewLabel_1_4.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		lblNewLabel_1_4.setBounds(40, 350, 93, 36);
		contentPane.add(lblNewLabel_1_4);

		txtName = new JTextField();
		txtName.setBounds(100, 155, 183, 26);
		contentPane.add(txtName);
		txtName.setColumns(10);

		txtAge = new JTextField();
		txtAge.setColumns(10);
		txtAge.setBounds(100, 207, 183, 26);
		contentPane.add(txtAge);

		txtMajor = new JTextField();
		txtMajor.setColumns(10);
		txtMajor.setBounds(100, 307, 183, 26);
		contentPane.add(txtMajor);

		txtScore = new JTextField();
		txtScore.setColumns(10);
		txtScore.setBounds(100, 357, 183, 26);
		contentPane.add(txtScore);

		JComboBox cbGender = new JComboBox();
		cbGender.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		cbGender.setModel(new DefaultComboBoxModel(new String[] { "Male", "Female" }));
		cbGender.setBounds(100, 251, 183, 36);
		contentPane.add(cbGender);

		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student st = new Student();
				st.setName(txtName.getText());
				st.setAge(Integer.parseInt(txtAge.getText()));
				st.setGender(cbGender.getSelectedIndex());
				st.setMajor(txtMajor.getText());
				st.setScore(Float.parseFloat(txtScore.getText()));
				ConnJDBC.insert(st);
				JOptionPane.showMessageDialog(null, "Save Success");
				showData(ConnJDBC.findAll());
			}
		});
		btnSave.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		btnSave.setBounds(318, 443, 117, 56);
		contentPane.add(btnSave);

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Student st = new Student();
				st.setName(txtName.getText());
				ConnJDBC.delete(st);
				showData(ConnJDBC.findAll());
			}
		});
		btnDelete.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		btnDelete.setBounds(468, 443, 117, 56);
		contentPane.add(btnDelete);

		JButton btnFind = new JButton("Find");
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student st = new Student();
				st.setName(txtName.getText());

				// List<Student> listStudent = new ArrayList<Student>();
				// listStudent = ConnJDBC.findByName(st);
				showData(ConnJDBC.findByName(st));

			}
		});
		btnFind.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		btnFind.setBounds(618, 443, 117, 56);
		contentPane.add(btnFind);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Student st = new Student();
				st.setName(txtName.getText());
				st.setAge(Integer.parseInt(txtAge.getText()));
				st.setGender(cbGender.getSelectedIndex());
				st.setMajor(txtMajor.getText());
				st.setScore(Float.parseFloat(txtScore.getText()));
				ConnJDBC.Update(st);
				JOptionPane.showMessageDialog(null, "Save Success");
				showData(ConnJDBC.findAll());
			}
		});
		btnUpdate.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		btnUpdate.setBounds(768, 443, 117, 56);
		contentPane.add(btnUpdate);

		JButton btnRefresh = new JButton("Refresh Input");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtName.setText("");
				txtAge.setText("");
				txtMajor.setText("");
				txtScore.setText("");
			}
		});
		btnRefresh.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		btnRefresh.setBounds(43, 80, 163, 56);
		contentPane.add(btnRefresh);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(318, 148, 637, 255);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, },
				new String[] { "ID", "Name", "Age", "Gender", "Major", "Score" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(43);
		table.getColumnModel().getColumn(1).setPreferredWidth(242);
		table.getColumnModel().getColumn(2).setPreferredWidth(46);
		table.getColumnModel().getColumn(3).setPreferredWidth(54);
		table.getColumnModel().getColumn(4).setPreferredWidth(127);
		table.getColumnModel().getColumn(5).setPreferredWidth(84);
		table.setFont(new Font("MS UI Gothic", Font.PLAIN, 14));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Current list");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				showData(ConnJDBC.findAll());
			}
		});
		btnNewButton.setFont(new Font("MS UI Gothic", Font.BOLD, 18));
		btnNewButton.setBounds(546, 527, 339, 73);
		contentPane.add(btnNewButton);
		showData(ConnJDBC.findAll());
	}

	public void showData(List<Student> studentl) {
		List<Student> listStudent = new ArrayList<>();
		listStudent = studentl;
		DefaultTableModel tableModel;
		tableModel = (DefaultTableModel) table.getModel();
		tableModel.setRowCount(0);

		for (Student student : listStudent) {
			String gender = student.getGender() == 0 ? "Male" : "Female"; // Sử dụng toán tử ba ngôi
			tableModel.addRow(new Object[] { student.getId(), student.getName(), student.getAge(), gender,
					student.getMajor(), student.getScore() });
		}
	}
}
