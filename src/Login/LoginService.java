package Login;

import Cmn.DAO;
import Cmn.DTO;
import Cmn.CmmnSvc;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
		
	}

	
}
