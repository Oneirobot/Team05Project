package map;

import javax.swing.*;

public class Map
{
	public static void main(String args[])
	{
		MapModel model = new MapModel(2); //MapModel takes an int param, adjusts the rate of "map movement"
		MapView view = new MapView(model);
		MapController mc = new MapController(view, model);
		
		Timer time = new Timer(25, mc);
		time.start();
		
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setSize(500, 400);
		view.setResizable(false);
		view.setVisible(true);
	}
}
