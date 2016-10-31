package map;

import javax.swing.*;
import java.awt.*;

public class PlayerView extends JComponent
{
	private MapModel model;
	private Image image;
	
	public PlayerView(Image img, MapModel mod)
	{
		image = img;
		model = mod;
	}
	
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(image, 0, 0, 500, 400, 0, model.getYT(), 500, model.getYB(), Color.white, null);
	}
}
