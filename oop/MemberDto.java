package org.java.oop;

import java.util.Date;

public class MemberDto {
	
	
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private String userAddr;
	private String userPhone;
	private Date day;
	
	// getters, setters
	// 라이브러리 Lombok(spring setters,getters 등)
	
	public void setUserId(String userId) {
		this.userId=userId;
	}
	public String getUserId() {
		return this.userId;
	}
	public void setUserPw(String userPw) {
		this.userPw=userPw;
	}
	public String getUserPw() {
		return this.userPw;
	}
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public String getUserName() {
		return this.userName;
	}
	public void setUserAge(int userAge) {
		this.userAge=userAge;
	}
	public int getUserAge() {
		return this.userAge;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr=userAddr;
	}
	public String getUserAddr() {
		return this.userAddr;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone=userPhone;
	}
	public String getUserPhone() {
		return this.userPhone;
	}
	public void setDay(Date day) {
		this.day=day;
	}
	public Date getDay() {
		return this.day;
	}
	
//	@Override
//	public String toString() {
//		
//	}
	@Override
    public String toString() {
        return "회원아이디='" + userId + '\'' +
                ", 비밀번호='" + userPw + '\'' +
                ", 이름=" + userName;
    }
}
