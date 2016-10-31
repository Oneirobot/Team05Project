package map;

import java.awt.event.*;

public class MapController implements ActionListener
{
	private MapView view;
	private MapModel model;
	
	public MapController(MapView v, MapModel m)
	{
		view = v;
		model = m;
	}
	
	public void actionPerformed(ActionEvent event)
	{
		model.move();
		view.repaint();
	}
}
