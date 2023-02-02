package character;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Basic.Macro;
import intro.JejuBase;
import reservation.JejuReservation;

public class OtherImages extends JFrame{
	
	public OtherImages() 
	{
		  setSize(wSize, hSize);
	      setLocation(xCoord, yCoord);
	      setVisible(true);
	      setLayout(null);
	      setBackground(Color.black);
	      SetBottomButton();
	}
	
	private String[] takeImageCnt(String path)
	{
		File dir = new File(path);
		File files[] = dir.listFiles();
		String names[] = new String[files.length];
		//System.out.println("파일 경로 test" + files[0].toString());
		
		for(int i = 0; i < files.length; i++)
		{
			names[i] = files[i].toString();
		}
		
		return names;
	}
	
	public void Details(String path)
	{
	   	      
	      addWindowListener(new WindowAdapter() {
	          @Override
	          public void windowClosing(WindowEvent e) {
	             setVisible(false);
	             dispose();
	          }
	       });   
		String[] names = takeImageCnt(path);
		Images = new ImageIcon[names.length];
		
		for(int i = 0; i < names.length; i++)
		{
			Images[i] = new ImageIcon(names[i]);
			Macro.customization(Images[i], btnWidth, btnHeight);
		}
		
		imageButtons = new JButton[names.length];
		for(int i = 0; i < names.length; i++)
		{
			imageButtons[i] = new JButton(Images[i]);
			
			if(i == 3)
			{
				distanceY += 200;
				swit = 0;
			}
			imageButtons[i].setBounds(btnX + (btnWidth * swit), (btnY + distanceY), btnWidth, btnHeight);
			swit++;
			
			add(imageButtons[i]);
		}
	}
	
	private void SetBottomButton()
	{
		backBtn = new JButton("Back");
		backBtn.setBounds(bbcoordX, bbcoordY, bbsizeX, bbsizeY);
		add(backBtn);
		
		bookingBtn = new JButton("Booking Hotel");
		bookingBtn.setBounds(380, bbcoordY, bbsizeX, bbsizeY);
		add(bookingBtn);
		
		
		bookingBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				JejuBase.getInstance(new JejuReservation());
			}
		});
	}
	

	private ImageIcon Images[];
	private JButton imageButtons[];
	// Frame size and coord
	private int wSize = 600;
	private int hSize = 500;	
	private int xCoord = 1250;
	private int yCoord = 200;
	
	// Button size and coord
	private int btnWidth = 200;
	private int btnHeight = 200;
	private int btnX = 0;
	private int btnY = 0;
	private int swit = 0;
	private int distanceY = 0;
	// back and booking button
	private JButton backBtn = null;
	private JButton bookingBtn = null;
	private int bbsizeX = 200;
	private int bbsizeY = 50;
	private int bbcoordX = 20;
	private int bbcoordY = 410;
	
	
}
