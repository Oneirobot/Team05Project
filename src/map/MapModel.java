package map;

public class MapModel
{
	private int incriment;
	//START_Y_TOP and START_Y_BOT relate to the starting point of player
	// view.  These values depend on "map"/image size and map component
	// frame size.
	private final int START_Y_TOP = 600, START_Y_BOT = 1000; 
	private int yt, yb;
	
	public MapModel(int inc)
	{
		incriment = inc;
		yt = START_Y_TOP;
		yb = START_Y_BOT;
	}
	
	public void move()
	{
		if(yt > 0)
		{
			yt -= incriment;
			yb -= incriment;
		}
	}
	
	public int getYT()
	{
		return yt;
	}
	
	public int getYB()
	{
		return yb;
	}
}
