package Reg;

import Cmn.DAO;
import Cmn.DTO;
import javafx.scene.Parent;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class RegService {
	
	private TextField IdText;
    private TextField PwText;
	private Text PwcDis;
	private TextField PwcText;
	private TextField NameText;
	private TextField EmailText;
	private RadioButton FemaleRadio;
	private RadioButton MaleRadio;
	
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
		if(IdText.getText().isEmpty()||PwText.getText().isEmpty()||PwcText.getText().isEmpty()||NameText.getText().isEmpty()) {
			Cmn.CmmnSvc.Msg("필수 입력사항을 확인 해주세요.");
			return;
		}
		if(!idCFlag) {
			Cmn.CmmnSvc.Msg("아이디 중복검사를 해주세요.");
			return;
		}
		if(!pwCFlag) {
			Cmn.CmmnSvc.Msg("비밀번호를 확인 해주세요.");
			return;
		}
		
		String gender = "남성";
		if(FemaleRadio.isSelected() && !MaleRadio.isSelected()) gender = "여성";
		else gender = "남성";
		
		DAO dao = new DAO(RegCtrl.getCon());
		DTO enRollMem = new DTO(IdText.getText(),PwText.getText(),NameText.getText(), gender, EmailText.getText(), 0, 0, 0);
		if(dao.IstMem(enRollMem) == 1) {
			Cmn.CmmnSvc.WindowClose(RegCtrl.getRegForm());
			Cmn.CmmnSvc.Msg("등록 완료");
		}else {
			Cmn.CmmnSvc.Msg("등록 이상 관리자에게 문의해주세요.");
		}
	}

	public void IDCheckProc() {
		String id = IdText.getText();
		if(id.isEmpty()) {
			Cmn.CmmnSvc.Msg("아이디를 입력해주세요.");
			return;
		}
		
		DAO dao = new DAO(RegCtrl.getCon());
		DTO gettmpmem = dao.sltone(IdText.getText());	
		if(gettmpmem.getId() != null) {
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
			pwCFlag = true;
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
		FemaleRadio = (RadioButton)regForm.lookup("#FemaleRadio");
		MaleRadio = (RadioButton)regForm.lookup("#MaleRadio");
		
	}

}
