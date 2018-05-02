package frontend;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class PlayingScene
{
	private Scene scene;
	private Group root;
	private Canvas canvas;
	
	public PlayingScene()
	{
		root = new Group();
		loadCanvas();
		scene = new Scene(root);
	}
	
	public void loadCanvas()
	{
		canvas = new Canvas(500, 800);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.BLACK);
		gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
		
		root.getChildren().add(canvas);
	}
	
	public void render()
	{
		
	}
	
	public Scene getScene()
	{
		return scene;
	}
}
