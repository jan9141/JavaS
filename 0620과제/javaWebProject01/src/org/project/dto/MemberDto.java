package org.project.dto;

public class MemberDto {
	private String userId;
	private String userPw;
	private String userPhone;
	private int userAge;
	
	
	public MemberDto() {
		System.out.println("기본생성자");
	}
	
	public MemberDto(String userId, String userPw, String userPhone, int userAge) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userPhone = userPhone;
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
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
}
