package map;

import javax.imageio.*;
import javax.swing.*;
import java.awt.image.*;
import java.io.*;

public class MapView extends JFrame
{	
	private PlayerView pv;
	private MapModel model;
	private BufferedImage img = null;
	
	public MapView(MapModel mod)
	{
		super("Rowdy Combat Fighter");
		
		try
		{
			img = ImageIO.read(new File("testBG.jpg"));
		}
		catch(IOException e)
		{
			System.err.println("Could not open image file!");
			System.exit(-1);
		}
		
		model = mod;
		pv = new PlayerView(img, model);
		
		setContentPane(pv);
	}
}
