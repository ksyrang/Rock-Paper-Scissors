package Game;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class GameCotroller implements Initializable {
	
	private GameService GameSvc;
	private Parent GameForm;
	
	public GameCotroller() {
		GameSvc = new GameService();
		GameSvc.setGameCtrl(this);
	}
		
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}


	public GameService getGameSvc() {
		return GameSvc;
	}


	public void setGameSvc(GameService gameSvc) {
		GameSvc = gameSvc;
	}


	public Parent getGameForm() {
		return GameForm;
	}


	public void setGameForm(Parent gameForm) {
		GameForm = gameForm;
	}
	

}
