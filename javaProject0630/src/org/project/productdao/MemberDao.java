package org.project.productdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.project.dbConnect.DbConnect;

import productDto.member0630Dto;

public class MemberDao {
	
	//싱글톤
	private static final MemberDao INSTANCE = new MemberDao();
	
	private MemberDao() {
		System.out.println("singleton");
	}
	public static MemberDao getInstance() {
		return INSTANCE;
	}
	// 고객정보
	public ArrayList<member0630Dto> mem(){
		ArrayList<member0630Dto> ber = new ArrayList<member0630Dto>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";
		try {
			conn = DbConnect.getConnection();
			query = "select * from member0630";
			pstm = conn.prepareStatement(query);
			
			//retrun 1이면 성공
			rs = pstm.executeQuery(); // select
			
			while(rs.next()) {
				int memberNo=rs.getInt(1);
				String userName=rs.getString(2);
				String userPhone=rs.getString(2);
				String addr=rs.getString(2);
				String inDay=rs.getString(2);
				String grade=rs.getString(2);
				String city=rs.getString(2);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
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
		}
		
		return ber;
	}
	public int insertDo(String userName, String userPhone, String addr, String inDay, String grade, String City) {
		int rs=0;
		PreparedStatement pstm = null; //sql 처리
		String query = ""; //실제 query
		Connection conn = null; // Driver , DB 연동
		
		try {
			conn = DbConnect.getConnection();
			query = "insert into member0630 vlaues(memberNo_seq.NEXTVAL,?,?,?,?,?,?)";
			
			pstm = conn.prepareStatement(query);
			
			
			pstm.setString(1, userName);
			pstm.setString(2, userPhone);
			pstm.setString(3, addr);
			pstm.setString(4, inDay);
			pstm.setString(5, grade);
			pstm.setString(6, City);
			
			
			
			// return 1이면 회원가입 성공
			rs = pstm.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
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
	public int updateDo(String userName, String userPhone, String addr, String inDay, String grade, String city, int memberNo) {
		int rs = 0;
		PreparedStatement pstm = null; //sql 처리
		String query = ""; //실제 query
		Connection conn = null; // Driver , DB 연동
		
		try {
			conn = DbConnect.getConnection();
			query = "update member0630 set userName=?,userPhone=?,addr=?,inDay=?,grade=?,city=? where memberNo=?";
			
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, userName);
			pstm.setString(2, userPhone);
			pstm.setString(3, addr);
			pstm.setString(4, inDay);
			pstm.setString(5, grade);
			pstm.setString(6, city);
			pstm.setInt(7, memberNo);
			
			rs = pstm.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
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
	public int deleteDo(int memberNo) {
		int rs=0;
		PreparedStatement pstm = null; //sql
		String query = "";
		Connection conn = null;
		
		try {
			conn = DbConnect.getConnection();
			query = "delete from member0630 where memberNo=? ";
			
			pstm = conn.prepareStatement(query);
			pstm.setInt(1, memberNo);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
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
}
