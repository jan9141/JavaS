package org.java.DBMemberDTO;

public class DBMemberDTO {
	private String userId;
	private String userPw;
	private int userAge;
	
	
	
	public DBMemberDTO(String userId, String userPw, int userAge) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userAge = userAge;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	
}
