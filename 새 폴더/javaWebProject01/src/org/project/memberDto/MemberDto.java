package org.project.memberDto;

public class MemberDto {
	private String userId;
	private String userPw;
	private int userAge;
	private String userPhone;

	public MemberDto() {
		// TODO Auto-generated constructor stub
		System.out.println("�⺻������");
	}

	public MemberDto(String userId, String userPw, int userAge, String userPhone) {
		// TODO Auto-generated constructor stub
		System.out.println("�ٸ�������2");
		this.userId = userId;
		this.userPw = userPw;
		this.userAge = userAge;
		this.userPhone = userPhone;
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

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
}
