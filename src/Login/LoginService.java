package Login;

import Cmn.DAO;
import Cmn.DTO;

import java.io.IOException;


import Cmn.CmmnSvc;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class LoginService {
	
	private LoginController LoginCtrl;
	private DAO DAO;

	public void setLoginCtrl(LoginController loginCtrl) {
		LoginCtrl = loginCtrl;
		DAO = new DAO(LoginCtrl.getCon());
	}

	public DTO LoginCtrl() {
		TextField idText = (TextField) LoginCtrl.getLoginForm().lookup("#Id_in");
		PasswordField pwText = (PasswordField) LoginCtrl.getLoginForm().lookup("#Pw_In");
		DTO tmpMem = DAO.sltone(idText.getText());

		if(tmpMem != null) {
			if(tmpMem.getPw().equals(pwText.getText())) {
				CmmnSvc.Msg("환영합니다. "+tmpMem.getName()+"님");
				return tmpMem;
			}else {
				CmmnSvc.Msg("비밀번호 오류!");
			}
		}else {
			CmmnSvc.Msg("미등록 아이디 입니다.");
		}
		return null;
		
	}
	public void FindIDProc() {
			
	}
	public void FindPwProc() {
		
	}
	public void KJSProc() {
		
	}
	public void RegProc() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/Reg/RegFXML.fxml"));

		try {
			Parent regForm = loader.load();			
			LoginCtrl.setRegCtrl(loader.getController());
			LoginCtrl.getRegCtrl().setRegForm(regForm);
			LoginCtrl.getRegCtrl().setCon(LoginCtrl.getCon());
			LoginCtrl.getRegCtrl().setId();

			RadioButton FemaleRadio = (RadioButton)regForm.lookup("#FemaleRadio");
			RadioButton MaleRadio = (RadioButton)regForm.lookup("#MaleRadio");
			ToggleGroup group = new ToggleGroup();
			FemaleRadio.setToggleGroup(group);
			MaleRadio.setToggleGroup(group);
			MaleRadio.isSelected();
			
			Scene scene = new Scene(regForm);
			Stage primaryStage = new Stage();
			primaryStage.setTitle("MemberReg");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
