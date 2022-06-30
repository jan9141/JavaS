package productDto;

public class member0630Dto {
	private int memberNo;
	private String userNmae;
	private String userPhone;
	private String addr;
	private String inDay;
	private String grade;
	private String city;
	
	public member0630Dto(int memberNo, String userNmae, String userPhone, String addr, String inDay, String grade,
			String city) {
		super();
		this.memberNo = memberNo;
		this.userNmae = userNmae;
		this.userPhone = userPhone;
		this.addr = addr;
		this.inDay = inDay;
		this.grade = grade;
		this.city = city;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getUserNmae() {
		return userNmae;
	}

	public void setUserNmae(String userNmae) {
		this.userNmae = userNmae;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getInDay() {
		return inDay;
	}

	public void setInDay(String inDay) {
		this.inDay = inDay;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
}
