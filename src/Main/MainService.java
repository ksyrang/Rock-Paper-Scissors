package Main;

import java.io.IOException;

import Cmn.DTO;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainService {
	private MainController MianCtrl;

	public MainController getMianCtrl() {
		return MianCtrl;
	}

	public void setMianCtrl(MainController mianCtrl) {
		MianCtrl = mianCtrl;
	}

	public void pageOpen(DTO mem) {
		
		if(mem.getType().equals("관리자")) {
			AdminpageOpen();
		}else {
			MempageOpen(mem);
		}
		
	}
	private void AdminpageOpen() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/Admin/AdminWelcome.fxml"));
		Parent AdminWelcomeForm;
		try {
			AdminWelcomeForm = loader.load();			
			MianCtrl.setAdminCtrl(loader.getController());
			MianCtrl.getAdminCtrl().setAdminWelcomeForm(AdminWelcomeForm);

			Scene scene = new Scene(AdminWelcomeForm);
			Stage primaryStage = new Stage();
			primaryStage.setTitle("Adminwelcome");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void MempageOpen(DTO mem) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/Admin/MemWelcome.fxml"));
		Parent MemWelcomeForm;
		try {
			MemWelcomeForm = loader.load();			
			MianCtrl.setMemCtrl(loader.getController());
			MianCtrl.getMemCtrl().setMemWelcomeForm(MemWelcomeForm);

			Scene scene = new Scene(MemWelcomeForm);
			Stage primaryStage = new Stage();
			primaryStage.setTitle("Adminwelcome");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
