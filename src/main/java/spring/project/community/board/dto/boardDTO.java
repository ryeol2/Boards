package spring.project.community.board.dto;

public class boardDTO {
	private String cNum;
	private String cTitle;
	private String cContent;
	private String cNname;
	private int cHit;
	private int cUp;

	public boardDTO() {
		// TODO Auto-generated constructor stub
	}

	public boardDTO(String cNum, String cTitle, String cContent, String cNname, int cHit, int cUp) {
		super();
		this.cNum = cNum;
		this.cTitle = cTitle;
		this.cContent = cContent;
		this.cNname = cNname;
		this.cHit = cHit;
		this.cUp = cUp;
	}

	public String getcNum() {
		return cNum;
	}

	public void setcNum(String cNum) {
		this.cNum = cNum;
	}

	public String getcTitle() {
		return cTitle;
	}

	public void setcTitle(String cTitle) {
		this.cTitle = cTitle;
	}

	public String getcContent() {
		return cContent;
	}

	public void setcContent(String cContent) {
		this.cContent = cContent;
	}

	public String getcNname() {
		return cNname;
	}

	public void setcNname(String cNname) {
		this.cNname = cNname;
	}

	public int getcHit() {
		return cHit;
	}

	public void setcHit(int cHit) {
		this.cHit = cHit;
	}

	public int getcUp() {
		return cUp;
	}

	public void setcUp(int cUp) {
		this.cUp = cUp;
	}

}
