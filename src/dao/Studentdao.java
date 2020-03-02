package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.StudentEntity;
import utils.StudentUtils;

public class Studentdao extends StudentUtils {
	private  Connection conn;
	private ResultSet rs;
	private PreparedStatement pst;
	
	public List<StudentEntity> Find() {
		List<StudentEntity> list = new ArrayList<StudentEntity>();
		try {
			conn = createConnection();
			String sql="SELECT * FROM studentsinfo";
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			StudentEntity aa = null; 
			while (rs.next()) {
				aa = new StudentEntity(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4));
				list.add(aa);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// TODO: handle finally clause
			closeAll(rs, pst, conn);
		}
		return list;
	}

	public int deleteid(int stuId) {
		int list = 0;
		try {
			conn = createConnection();
			String sql="DELETE FROM studentsinfo WHERE id=?";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, stuId);
			list = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// TODO: handle finally clause
			closeAll(rs, pst, conn);
		}
		return list;
	}
}
