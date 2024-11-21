package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.Sach;

public class SachDAO implements DAOInterface<Sach> {

	public static SachDAO getInstance() {
		return new SachDAO();
	}

	@Override
	public int insert(Sach t) {
		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();

			// Bước 2: tạo ra đối tượng statement
			Statement st = con.createStatement();

			// Bước 3: thực thi câu lệnh SQL
			String sql = "UPDATE sach (id, tenSach, giaBan, namXuatBan) " + " VALUES ('" + t.getId() + "' , '"
					+ t.getTenSach() + "' , " + t.getGiaBan() + " , " + t.getNamXuatBan() + ")";

			ketQua = st.executeUpdate(sql);

			// Bước 4:
			System.out.println("Bạn đã thực thi: " + sql);
			System.out.println("Có " + ketQua + " dòng bị thay đổi!");

			// Bước 5:
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public int update(Sach t) {

		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();

			// Bước 2: tạo ra đối tượng statement
			Statement st = con.createStatement();

			// Bước 3: thực thi câu lệnh SQL
			String sql = "UPDATE sach " + " SET " + " tenSach='" + t.getTenSach() + "'" + ", giaBan=" + t.getGiaBan()
					+ ", namXuatBan=" + t.getNamXuatBan() + " WHERE id='" + t.getId() + "\'";
			System.out.println(sql);
			ketQua = st.executeUpdate(sql);

			// Bước 4:
			System.out.println("Bạn đã thực thi: " + sql);
			System.out.println("Có " + ketQua + " dòng bị thay đổi!");

			// Bước 5:
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;

	}

	@Override
	public int delete(Sach t) {

		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();

			// Bước 2: tạo ra đối tượng statement
			Statement st = con.createStatement();

			// Bước 3: thực thi câu lệnh SQL
			String sql = "DELETE from sach " + "WHERE id = '" + t.getId() + "\'";
			System.out.println(sql);
			ketQua = st.executeUpdate(sql);

			// Bước 4:
			System.out.println("Bạn đã thực thi: " + sql);
			System.out.println("Có " + ketQua + " dòng bị thay đổi!");

			// Bước 5:
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;

	}

	@Override
	public ArrayList<Sach> selectAll() {

		ArrayList<Sach> ketQua = new ArrayList<Sach>();
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();

			// Bước 2: tạo ra đối tượng statement
			Statement st = con.createStatement();

			// Bước 3: thực thi câu lệnh SQL
			String sql = "SELECT * FROM sach";
			System.out.println(sql);
			ResultSet rs = st.executeQuery(sql);

			// Bước 4:
			while (rs.next()) {
				String id = rs.getString("id");
				String tenSach = rs.getString("tenSach");
				float giaBan = rs.getFloat("giaBan");
				int namXuatBan = rs.getInt("namXuatBan");

				Sach sach = new Sach(id, tenSach, giaBan, namXuatBan);
				ketQua.add(sach);
			}

			// Bước 5:
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;

	}

	@Override
	public Sach selectById(Sach t) {


		Sach ketQua = null;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();

			// Bước 2: tạo ra đối tượng statement
			Statement st = con.createStatement();

			// Bước 3: thực thi câu lệnh SQL
			String sql = "SELECT * FROM sach where id='"+t.getId()+"'";
			System.out.println(sql);
			ResultSet rs = st.executeQuery(sql);

			// Bước 4:
			while (rs.next()) {
				String id = rs.getString("id");
				String tenSach = rs.getString("tenSach");
				float giaBan = rs.getFloat("giaBan");
				int namXuatBan = rs.getInt("namXuatBan");

				ketQua = new Sach(id, tenSach, giaBan, namXuatBan);
			}

			// Bước 5:
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;

	
	}

	@Override
	public ArrayList<Sach> selectByCondition(String condition) {
		


		ArrayList<Sach> ketQua = new ArrayList<Sach>();
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();

			// Bước 2: tạo ra đối tượng statement
			Statement st = con.createStatement();

			// Bước 3: thực thi câu lệnh SQL
			String sql = "SELECT * FROM sach where "+ condition;
			System.out.println(sql);
			ResultSet rs = st.executeQuery(sql);

			// Bước 4:
			while (rs.next()) {
				String id = rs.getString("id");
				String tenSach = rs.getString("tenSach");
				float giaBan = rs.getFloat("giaBan");
				int namXuatBan = rs.getInt("namXuatBan");

				Sach sach = new Sach(id, tenSach, giaBan, namXuatBan);
				ketQua.add(sach);
			}

			// Bước 5:
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;

	
	}

}
