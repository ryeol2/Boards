package spring.project.community.login.dto;

public class LoginDTO {
	private String cId;
	private String cPwd;
	private String cNname;
	
	public LoginDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getcPwd() {
		return cPwd;
	}

	public void setcPwd(String cPwd) {
		this.cPwd = cPwd;
	}

	public String getcNname() {
		return cNname;
	}

	public void setcNname(String cNname) {
		this.cNname = cNname;
	}
	
	

}
