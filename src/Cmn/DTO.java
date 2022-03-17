package Cmn;

public class DTO {
	String id;
	String name;
	String pw;
	String type;
	int win;
	int defeat;
	int rate;
	
	public DTO() {
		// TODO Auto-generated constructor stub
	}

	
	public DTO(String id, String name, String pw, String type, int win, int defeat, int rate) {
		super();
		this.id = id;
		this.name = name;
		this.pw = pw;
		this.type = type;
		this.win = win;
		this.defeat = defeat;
		this.rate = rate;
	}


	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getDefeat() {
		return defeat;
	}
	public void setDefeat(int defeat) {
		this.defeat = defeat;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	
	

}
