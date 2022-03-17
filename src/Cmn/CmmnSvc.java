package Cmn;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class CmmnSvc {
	
	public static void Msg(String content) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("알림");
		alert.setContentText(content);
		alert.show();
	}

}
