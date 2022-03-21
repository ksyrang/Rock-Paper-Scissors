package Admin;

import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class AdminController implements Initializable {
	
	private AdminService AdminSvc;
	private Parent AdminForm;
	private Connection con;

	public AdminController() {
		AdminSvc = new AdminService();
		AdminSvc.setAdminCtrl(this);
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

	public  void MemMgtProc() {

    }

	public void StatisticProc() {

    }
	
	
	public void setAdminForm(Parent adminForm) {
		this.AdminForm = adminForm;
	}

	
	
	public Parent getAdminForm() {
		return AdminForm;
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
	
	
	

}
