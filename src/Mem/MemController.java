package Mem;

import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class MemController implements Initializable{
	
	private MemSerivce MemSvc;
	private Parent MemWelcomeForm;
	private Connection con;
	
	public MemController() {
		MemSvc = new MemSerivce();
		MemSvc.setMemCtrl(this);
	}
	
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

	public void GameMgtProc() {
	
	}
	
	public void GraphProc() {
	
	}

	public void LogoutProc() {
	
	}
	
	public void MemMgtProc() {
	
	}
	
	public void StatisticProc() {
	
	}

	
	
	public MemSerivce getMemSvc() {
		return MemSvc;
	}




	public void setMemSvc(MemSerivce memSvc) {
		MemSvc = memSvc;
	}




	public Parent getMemWelcomeForm() {
		return MemWelcomeForm;
	}

	public void setMemWelcomeForm(Parent memWelcomeForm) {
		MemWelcomeForm = memWelcomeForm;
	}




	public Connection getCon() {
		return con;
	}




	public void setCon(Connection con) {
		this.con = con;
	}
	
	

}
