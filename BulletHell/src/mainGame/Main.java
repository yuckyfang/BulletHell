package mainGame;

import backend.GameManager;
import frontend.PlayingScene;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application
{
	private Stage window;
	
	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		window = primaryStage;
		window.setTitle("");
		
		GameManager game = new GameManager();
		
		window.setScene(game.getPlayingScene().getScene());
		window.show();
	}
}
