package org.project.productdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.project.dbConnect.DbConnect;

import productDto.product_0630Dto;

public class ProductDao {
	
	// 싱글톤
	private static final ProductDao INSTANCE = new ProductDao();
	
	private ProductDao() {
		System.out.println("싱글톤");
	}
	public static ProductDao getInstance() {
		return INSTANCE;
	}
	//상품
	public ArrayList<product_0630Dto> list(){
		ArrayList<product_0630Dto> lists=new ArrayList<product_0630Dto>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";
		
		try {
			conn = DbConnect.getConnection();
			query = "select * from product_0630";
			pstm = conn.prepareStatement(query);
			
			// retrun 1이면 성공
			rs = pstm.executeQuery(); // select
			
			while(rs.next()) {
				int custno=rs.getInt(1);
				int salenol=rs.getInt(2);
				int pcost=rs.getInt(3);
				int amount=rs.getInt(4);
				int price=rs.getInt(5);
				String pcode=rs.getString(6);
				String sdate=rs.getString(7);
				
				lists.add(new product_0630Dto(custno, salenol, pcost, amount, price, pcode, sdate));
			}
		}catch (Exception e) {
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
		
		return lists;
	}
	
	public int insertDo(int custno,int salenol,int pcost,int amount,int price,String pcode,String sdate) {
		int rs = 0;
		
		PreparedStatement pstm = null; //sql 처리
		String query = ""; // 실제 query
		Connection conn = null; // Driver , DB 연동
		
		try {
			conn = DbConnect.getConnection();
			query = "insert into product_0630 values(?,?,?,?,?,?,?)";
			
			pstm = conn.prepareStatement(query);
			
			pstm.setInt(1, custno);
			pstm.setInt(2, salenol);
			pstm.setInt(3, pcost);
			pstm.setInt(4, amount);
			pstm.setInt(5, price);
			pstm.setString(6, pcode);
			pstm.setString(7, sdate);
			
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
	public int updateDo(int custno,int salenol,int pcost,int amount,int price,String pcode,String sdate) {
		int rs=0;
		PreparedStatement pstm = null; //sql 처리
		String query = ""; // 실제 query
		Connection conn = null; // Driver , DB 연동
		
		try {
			conn = DbConnect.getConnection();
			query = "update product_0630 set sdate=?, salenol=?,pcost=?,amount=?,price=?,pcode=? where custno=?";
			
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, sdate);
			pstm.setInt(2, salenol);
			pstm.setInt(3, pcost);
			pstm.setInt(4, amount);
			pstm.setInt(5, price);
			pstm.setString(6, pcode);
			pstm.setInt(7, custno);
			
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
	public int deleteDo(int custno) {
		int rs=0;
		PreparedStatement pstm = null; //sql 처리
		String query = ""; // 실제 query
		Connection conn = null; // Driver , DB 연동
		
		try {
			conn = DbConnect.getConnection();
			query = "delete from product_0630 where custno=?";
			
			pstm = conn.prepareStatement(query);
			
			pstm.setInt(1, custno);
			
			
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
}
