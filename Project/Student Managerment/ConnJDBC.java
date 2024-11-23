package ConnData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConnJDBC {
	static String url = "jdbc:mySQL://localhost:3306/studentmn";
	static String username = "root";
	static String password = "";

	public static Connection getConnection() {
		Connection connection = null;
		try {

			// Tạo kết nối
			connection = DriverManager.getConnection(url, username, password);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;

	}

	public static List<Student> findAll() {
		List<Student> studentList = new ArrayList<Student>();
		String query = "select*from student";
		try {
			Connection connection = getConnection();

			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				Student st = new Student(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getInt("gender"),
						rs.getString("major"), rs.getFloat("score"));
				studentList.add(st);

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return studentList;
	}

	public static void insert(Student st) {

		String query = "insert into student (name,age,gender,major,score) value(?,?,?,?,?)";
		try {
			Connection connection = getConnection();

			PreparedStatement pstmt = connection.prepareStatement(query);

			pstmt.setString(1, st.getName());
			pstmt.setInt(2, st.getAge());
			pstmt.setInt(3, st.getGender());
			pstmt.setString(4, st.getMajor());
			pstmt.setFloat(5, st.getScore());
			pstmt.execute();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void delete(Student st) {
		String query = "delete from student where name = '" + st.getName() + "'";

		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			
		}
	public static void Update(Student st) {
		String query = "Update student set name=?, age=?, gender=?, major=?, score=? WHERE name = ?";
	try {
		Connection connection = getConnection();

		PreparedStatement pstmt = connection.prepareStatement(query);

		pstmt.setString(1, st.getName());
		pstmt.setInt(2, st.getAge());
		pstmt.setInt(3, st.getGender());
		pstmt.setString(4, st.getMajor());
		pstmt.setFloat(5, st.getScore());
		 pstmt.setString(6, st.getName()); // Điều kiện WHERE sử dụng tên
		pstmt.executeUpdate();
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	}
	public static List<Student> findByName(Student s) {
		List<Student> studenl = new ArrayList<Student>();
		String query = "select* from student where student.name = '" + s.getName() + "'";
		try {
			Connection connection = getConnection();

			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				Student st = new Student(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getInt("gender"),
						rs.getString("major"), rs.getFloat("score"));
				studenl.add(st);

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return studenl;
	}
}
