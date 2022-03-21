package Main;

import java.io.IOException;

import Cmn.CmmnSvc;
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
		if(mem == null) return;
		if(mem.getId().equals("admin999")) {
			AdminpageOpen();
		}else {
			MempageOpen();
		}
		
	}
	private void AdminpageOpen() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/Admin/AdminWelcome.fxml"));
		try {
			Parent AdminForm = loader.load();			
			MianCtrl.setAdminCtrl(loader.getController());
			MianCtrl.getAdminCtrl().setAdminForm(AdminForm);
			MianCtrl.getAdminCtrl().setCon(MianCtrl.getCon());

			Scene scene = new Scene(AdminForm);
			Stage primaryStage = new Stage();
			primaryStage.setTitle("Adminwelcome");
			primaryStage.setScene(scene);
			primaryStage.show();
			
			CmmnSvc.WindowClose(MianCtrl.getLoginCtrl().getLoginForm());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void MempageOpen() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/Mem/MemWelcome.fxml"));

		try {
			Parent MemForm = loader.load();			
			MianCtrl.setMemCtrl(loader.getController());
			MianCtrl.getMemCtrl().setMemWelcomeForm(MemForm);
			MianCtrl.getMemCtrl().setCon(MianCtrl.getCon());

			Scene scene = new Scene(MemForm);
			Stage primaryStage = new Stage();
			primaryStage.setTitle("Adminwelcome");
			primaryStage.setScene(scene);
			primaryStage.show();
			
			CmmnSvc.WindowClose(MianCtrl.getLoginCtrl().getLoginForm());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
