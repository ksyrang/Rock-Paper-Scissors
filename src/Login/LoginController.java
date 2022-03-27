package Login;

import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;

import Cmn.DTO;
import Main.MainController;
import Reg.RegController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class LoginController implements Initializable {
	
//	@FXML private TableView<?> standingTable;
//    @FXML private TableColumn<?, ?> T_C_Id;
//    @FXML private TableColumn<?, ?> T_C_Name;
//    @FXML private TableColumn<?, ?> T_C_Wrate;
//    @FXML private TableColumn<?, ?> T_C_Win;
//    @FXML private TableColumn<?, ?> T_C_WDefeat;
    @FXML private TextField Id_in;
    @FXML private PasswordField Pw_In;
    @FXML private Button LgnBtn;
    @FXML private Button RegBtn;
    @FXML private Text KJS;
	
	
    MainController MainCtrl;
	LoginController LoginCtrl;
	RegController RegCtrl;
	Parent LoginForm;
	LoginService LoginSvc;
	Connection con;
	
	public LoginController() {
		LoginSvc = new LoginService();
		LoginSvc.setLoginCtrl(this);
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	public void LoginProc() {
		MainCtrl.pageOpen(LoginSvc.LoginCtrl());
    }    
	
	public void FindIDProc() {
		LoginSvc.FindIDProc();
    }

	public void FindPwProc() {
    	LoginSvc.FindPwProc();
    }

	public void KJSProc() {
    	LoginSvc.KJSProc();
    }

	public void RegProc() {
    	LoginSvc.RegProc();
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

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public MainController getMainCtrl() {
		return MainCtrl;
	}

	public void setMainCtrl(MainController mainCtrl) {
		MainCtrl = mainCtrl;
	}

	public RegController getRegCtrl() {
		return RegCtrl;
	}

	public void setRegCtrl(RegController regCtrl) {
		RegCtrl = regCtrl;
	}
	
	
}
