package Reg;

import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class RegController implements Initializable {
	
	private Parent RegForm;
	private RegService RegSvc;
	private Connection con;
	
	
	public RegController() {
		RegSvc = new RegService();
		RegSvc.setRegCtrl(this);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	public void CancelProc() {
	
	}
	
	public void EnrollProc() {
	
	}
	
	public void IDCheckProc() {
	
	}
	
	public void LogoutProc() {
	
	}
	
	
	public Parent getRegForm() {
		return RegForm;
	}

	public void setRegForm(Parent regForm) {
		RegForm = regForm;
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
	
	
}
