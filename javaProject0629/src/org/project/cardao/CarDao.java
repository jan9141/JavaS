package org.project.cardao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.project.DbConnect.DbConnect;
import org.project.cardto.CarDto;

import com.mysql.cj.protocol.Resultset;

public class CarDao {
	private static final CarDao INSTANCE = new CarDao();

	private CarDao() {
		System.out.println("CarDao 싱글톤");
	}

	public static CarDao getInstance() {
		return INSTANCE;
	}

	public int insertDo(String car_no, String car_type, String car_last_check_date, String car_expire_date) {
		int rs = 0;

		PreparedStatement pstm = null; // sql 처리
		String query = ""; // 실제 query
		Connection conn = null; // Driver, DB연동

		try {
			conn = DbConnect.getConnection();
			query = "insert into car values(?,?,?,?)";

			pstm = conn.prepareStatement(query);

			pstm.setString(1, car_no);
			pstm.setString(2, car_type);
			pstm.setString(3, car_last_check_date);
			pstm.setString(4, car_expire_date);

			// return 1이면 회원가입 성공
			rs = pstm.executeUpdate(); // INSERT, UPDATE or DELETE
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}
		}

		return rs;
	}

	public int updateDo(String car_no, String car_type, String car_last_check_date, String car_expire_date) {
		int rs = 0;

		PreparedStatement pstm = null; // sql 처리
		String query = ""; // 실제 query
		Connection conn = null; // Driver, DB연동

		try {
			conn = DbConnect.getConnection();
			query = "update car set car_type=?,car_last_check_date=?,car_expire_date=? where car_no=? ";

			pstm = conn.prepareStatement(query);

			pstm.setString(1, car_type);
			pstm.setString(2, car_last_check_date);
			pstm.setString(3, car_expire_date);
			pstm.setString(4, car_no);

			// return 1이면 회원가입 성공
			rs = pstm.executeUpdate(); // INSERT, UPDATE or DELETE
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}
		}

		return rs;

	}

	public int deleteDo(String car_no) {
		int rs = 0;

		PreparedStatement pstm = null; // sql 처리
		String query = ""; // 실제 query
		Connection conn = null; // Driver, DB연동

		try {
			conn = DbConnect.getConnection();
			query = "delete from car where car_no=?";

			pstm = conn.prepareStatement(query);

			pstm.setString(1, car_no);

			// return 1이면 회원가입 성공
			rs = pstm.executeUpdate(); // INSERT, UPDATE or DELETE
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}
		}

		return rs;
	}

	public ArrayList<CarDto> list() {
		ArrayList<CarDto> cars = new ArrayList<CarDto>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DbConnect.getConnection();
			query = " select * from car ";
			pstm = conn.prepareStatement(query);

			// return 1이면 성공
			rs = pstm.executeQuery(); //select
			
			while(rs.next()) {
				String car_no = rs.getString(1);
				String car_type = rs.getString(2);
				String car_last_check_date = rs.getString(3);
				String car_expire_date = rs.getString(4);
				
				cars.add(new CarDto(car_no, car_type, car_last_check_date, car_expire_date));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
				if (rs != null) rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}

			return cars;
		}

	}
}
