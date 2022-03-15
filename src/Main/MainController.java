package Main;

import Login.LoginController;
import javafx.scene.Parent;

public class MainController {
	
	LoginController LoginCtrl;
	
	public LoginController getLoginCtrl() {
		return LoginCtrl;
	}

	public void setLoginCtrl(LoginController loginCtrl) {
		LoginCtrl = loginCtrl;
	}
	
	

}
