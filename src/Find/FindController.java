package Find;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;

public class FindController implements Initializable{
	
	private FindService FindSvc;
	
	public FindController() {
		FindSvc = new FindService();
		FindSvc.setFindCtrl(this);
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
