package test;

import java.util.ArrayList;

import dao.KhachHangDAO;
import dao.SachDAO;
import model.KhachHang;
import model.Sach;

public class TestKhachHangDAO {
	public static void main(String[] args) {
		ArrayList<KhachHang> list = KhachHangDAO.getInstance().selectAll();
		for (KhachHang kh : list) {
			System.out.println(kh.toString());
		}
	}
}