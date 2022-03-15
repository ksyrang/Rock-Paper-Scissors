package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/Main/main/LoginFXML.fxml"));
		Parent mainLoginForm = loader.load();
		MainController MainController = new MainController();
				
		MainController.setLoginCtrl(loader.getController());
		MainController.getLoginCtrl().setLoginForm(mainLoginForm);
		
		//controller.setLogOut(new LogOut());

		primaryStage.setTitle("LoginPage");
		primaryStage.setScene(new Scene(mainLoginForm));
		primaryStage.show();
		
		//test
	}

}
