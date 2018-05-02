package backend;

import frontend.PlayingScene;

public class GameManager 
{
	private PlayingScene display;
	
	public GameManager()
	{
		display = new PlayingScene();
	}
	
	public void tick()
	{
		
	}
	
	public PlayingScene getPlayingScene()
	{
		return display;
	}
}
