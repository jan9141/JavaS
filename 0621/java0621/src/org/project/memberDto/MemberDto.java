package org.project.memberDto;

public class MemberDto {
	private String userId;
	private String userPw;
	private String userPhone;
	private int age;
	
	public MemberDto(String userId, String userPw, String userPhone, int age) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userPhone = userPhone;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
