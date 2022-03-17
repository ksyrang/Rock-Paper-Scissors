package Main;

import java.sql.Connection;

import Admin.AdminController;
import Cmn.DTO;
import Login.LoginController;
import Mem.MemController;


public class MainController {
	
	private LoginController LoginCtrl;
	private MainService Mainsvc;
	private Connection con;
	private DTO Mem;
	
	private AdminController AdminCtrl;
	private MemController MemCtrl;
		
	public MainController() {
		Mainsvc = new MainService();
		Mainsvc.setMianCtrl(this);
	}
	public LoginController getLoginCtrl() {
		return LoginCtrl;
	}

	public void setLoginCtrl(LoginController loginCtrl) {
		LoginCtrl = loginCtrl;
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public DTO getMem() {
		return Mem;
	}

	public void setMem(DTO mem) {
		Mem = mem;
	}
	
	public void pageOpen(DTO Mem) {
		Mainsvc.pageOpen(Mem);
		
	}
	public AdminController getAdminCtrl() {
		return AdminCtrl;
	}
	public void setAdminCtrl(AdminController adminCtrl) {
		AdminCtrl = adminCtrl;
	}
	public MemController getMemCtrl() {
		return MemCtrl;
	}
	public void setMemCtrl(MemController memCtrl) {
		MemCtrl = memCtrl;
	}
	

}
