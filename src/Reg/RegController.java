package Reg;

import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class RegController implements Initializable {
	
	@FXML
    private TextField IdText;
    @FXML
    private Button IDCheckBtn;
    @FXML
    private TextField PwText;
    @FXML
    private Text PwcDis;
    @FXML
    private TextField PwcText;
    @FXML
    private TextField NameText;
    @FXML
    private TextField EmailText;
    @FXML
    private Button CancelBtn;
    @FXML
    private Button EnrollBtn;

	private Parent RegForm;
	private RegService RegSvc;
	private Connection con;
	
	
	public RegController() {
		RegSvc = new RegService();
		RegSvc.setRegCtrl(this);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		PwcText.textProperty().addListener((attribute, before, after)->{//람다식
			RegSvc.PwcProc();
		});
		PwText.textProperty().addListener((attribute, before, after)->{//람다식
			RegSvc.PwcProc();
		});
		
	}
	
	public void CancelProc() {
		RegSvc.CancelProc();
    }
	public void EnrollProc() {
		RegSvc.EnrollProc();
    }
	public void IDCheckProc() {
		RegSvc.IDCheckProc();
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
	
	public void setId(){
		RegSvc.setId(RegForm);
	}
}
