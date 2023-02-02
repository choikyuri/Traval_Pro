package Basic;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;

public class Macro{
	
	static final Toolkit toolkit = Toolkit.getDefaultToolkit();
	
	public static final int g_Width = 600;
	public static final int g_Height = 800;
	
	public static final int g_X = ((int)toolkit.getScreenSize().getWidth())/2-300;
	public static final int g_Y = ((int)toolkit.getScreenSize().getHeight())/2-400;
	
	public static final void customization(ImageIcon img, int width, int height)
	{
		Image setImg = img.getImage();
		Image changeImg = setImg.getScaledInstance(width, height, setImg.SCALE_SMOOTH);
		
		img.setImage(changeImg);
		//return img;
	}
	
}
