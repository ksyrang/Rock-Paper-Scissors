package Reg;

import Cmn.DAO;
import Cmn.DTO;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class RegService {
	
	private TextField IdText;
    private TextField PwText;
	private Text PwcDis;
	private TextField PwcText;
	private TextField NameText;
	private TextField EmailText;
	
	private boolean idCFlag = false;
	private boolean pwCFlag = false;
	
	private RegController RegCtrl;

	public void setRegCtrl(RegController regCtrl) {
		RegCtrl = regCtrl;
	}

	public void CancelProc() {
		Cmn.CmmnSvc.WindowClose(RegCtrl.getRegForm());
	}

	public void EnrollProc() {
		if(!idCFlag) {
			Cmn.CmmnSvc.Msg("아이디 중복검사를 해주세요.");
			return;
		}
		
		
	}

	public void IDCheckProc() {
		DAO dao = new DAO(RegCtrl.getCon());
		String enRollID = IdText.getText();
		DTO gettmpmem = dao.sltone(enRollID);
		if(gettmpmem != null) {
			Cmn.CmmnSvc.Msg("등록된 아이디 입니다.");
			idCFlag = false;
		}
		else {
			Cmn.CmmnSvc.Msg("등록 가능한 아이디 입니다.");
			idCFlag = true;
		}
	}

	public void PwcProc() {
		if(PwText.getText().isEmpty() && PwcText.getText().isEmpty()) {
			PwcDis.setText("입력해주세요.");
			PwcDis.setStyle("-fx-fill : black");
			pwCFlag = false;
		}else if(PwcText.getText().equals(PwText.getText())) {
			PwcDis.setText("일치");
			PwcDis.setStyle("-fx-fill : green");
			pwCFlag = false;
		}else {
			PwcDis.setText("불 일치");
			PwcDis.setStyle("-fx-fill : red");
			pwCFlag = false;
		}
	}
	
	public void setId(Parent regForm) {
		IdText = (TextField)regForm.lookup("#IdText");
		PwText = (TextField)regForm.lookup("#PwText");
		PwcDis = (Text)regForm.lookup("#PwcDis");
		PwcText = (TextField)regForm.lookup("#PwcText");
		NameText = (TextField)regForm.lookup("#NameText");
		EmailText = (TextField)regForm.lookup("#EmailText");
		
	}
	
	
}
