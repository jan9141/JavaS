package org.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import org.java.dbConnect.DbConnect;
import org.java.dto.MemberDto;

public class MemberDao {
	// 싱글톤 패턴(한번만 딱 생성하는 패턴)
	private static final MemberDao INSTANCE = new MemberDao();

	private MemberDao() {
	}

	public static MemberDao getInstance() {
		return INSTANCE;
	}

	// insert
	public int insertDo(String userId, String userPw, int userAge, String userName) {
		int rs = 0;
		// 회원가입 DB
		// 쿼리문
		PreparedStatement pstm=null; //SQL 
		Connection conn=null; // Connection
		String query="";
		
		try {
			conn=DbConnect.getConnection();
			query=" insert into member(userId,userPw,userAge,userName) "
					+ " values(?,?,?,?) ";
			System.out.println(query);
			System.out.println(userId+" "+userPw+" "+userAge+" "+userName);
			
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setInt(3, userAge);
			pstm.setString(4, userName);
			
			rs = pstm.executeUpdate(); //update,delete,insert 1(성공) 나머진(실패)
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(conn!=null) conn.close();
				if(pstm!=null) pstm.close();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {}
		}
		
		
//		String query="insert into member(userId,userPw,userAge,userName) values('m1','11',11,'s1')";
//		DbConnect.getConnection();
		return rs;
	}

	// select
	public ArrayList<MemberDto> list() {
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		// 쿼리문
		DbConnect.getConnection();
		return lists;
	}

	// update
	public int updateDo() {
		int rs = 0;
		// 회원수정 DB
		// 쿼리문
		DbConnect.getConnection();
		return rs;
	}

	// delete
	public int deleteDo() {
		int rs = 0;
		// 회원삭제 DB
		// 쿼리문
		DbConnect.getConnection();
		return rs;
	}
}
