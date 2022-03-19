package Mem;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class MemController implements Initializable{
	
	private Parent MemWelcomeForm;
	private MemSerivce MemSvc;
	
	public MemController() {
		MemSvc = new MemSerivce();
		MemSvc.setMemCtrl(this);
	}
	
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
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
	
	

}
