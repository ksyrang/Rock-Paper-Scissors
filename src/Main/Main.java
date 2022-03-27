package Main;

import java.sql.Connection;
import java.sql.DriverManager;

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
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/Main/LoginFXML.fxml"));
		Parent LoginForm = loader.load();
		
		MainController MainController = new MainController();
		
		MainController.setCon(cmnt_DB());
		MainController.setLoginCtrl(loader.getController());
		MainController.getLoginCtrl().setLoginForm(LoginForm);
		MainController.getLoginCtrl().setCon(cmnt_DB());
		MainController.getLoginCtrl().setMainCtrl(MainController);
		
		//controller.setLogOut(new LogOut());//로그 아웃때 반드시 con.close 하기!

		primaryStage.setTitle("LoginPage");
		primaryStage.setScene(new Scene(LoginForm));
		primaryStage.show();
	}

	
	private Connection cmnt_DB() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "rspgame";
		String password = "oracle1";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			return DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}	
}


