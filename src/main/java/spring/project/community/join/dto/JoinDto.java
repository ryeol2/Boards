package spring.project.community.join.dto;

public class JoinDto {
	private String cId;
	private String cName;
	private String cPwd;
	private String cNname;
	private String cEmail;

	public JoinDto() {
		// TODO Auto-generated constructor stub
	}

	public JoinDto(String cId, String cName, String cPwd, String cNname, String cEmail) {

		this.cId = cId;
		this.cName = cName;
		this.cPwd = cPwd;
		this.cNname = cNname;
		this.cEmail = cEmail;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
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

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

}
