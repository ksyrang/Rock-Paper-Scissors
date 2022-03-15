package Login;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class LoginController implements Initializable {
	
	LoginController LoginCtrl;
	Parent LoginForm;
	LoginService LoginSvc;
	
	public LoginController() {
		LoginSvc = new LoginService();
		LoginSvc.setLoginCtrl(this);
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	
	public LoginController getLoginCtrl() {
		return LoginCtrl;
	}
	public void setLoginCtrl(LoginController loginCtrl) {
		LoginCtrl = loginCtrl;
	}
	public Parent getLoginForm() {
		return LoginForm;
	}
	public void setLoginForm(Parent loginForm) {
		LoginForm = loginForm;
	}
	
	

}
