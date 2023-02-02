package character;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Basic.Macro;
import intro.JejuBase;
import intro.JejuBegin;
import reservation.JejuReservation;

public class OtherImages2 extends JFrame {
	
	public OtherImages2() {
		
		setting();
	}
	
	
	public void setting() {
		
		setSize(Width, Height);
	    setLocation(X, Y);
	    setVisible(true);
	    setLayout(null);
	    setResizable(false); // TODO 창 크기 고정
	}
	
	private String[] takeImage(String dirPath) {
		
		File dir = new File(dirPath);
		File files[] = dir.listFiles();
		String names[] = new String[files.length];
		
		for(int i = 0; i < files.length; i++) {
			names[i] = files[i].toString();
		}
		
		return names;
	}

	public void Details(String path, JejuReservation _reserve)
	{
	   	      
	      addWindowListener(new WindowAdapter() {
	          @Override
	          public void windowClosing(WindowEvent e) {
	             setVisible(false);
	             dispose();
	          }
	       });   
	    m_reserve = _reserve;
		String[] names = takeImage(path);
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
		
		add(pickLabel());
		add(reservationButton());
		add(cancelButton());
	}
	
	
	
	// Button [Y]
	private JButton reservationButton() {
		
		JButton reservationBtn = new JButton("Y");
	    reservationBtn.setBounds(400, Height-85, 60, 30);
	    reservationBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				m_reserve.Setting();
				JejuBase.getInstance(m_reserve);
			}
		});
	    
	    return reservationBtn;
	}
	// Button [N]
	private JButton cancelButton() {
		
		JButton cancelBtn = new JButton("N");
		cancelBtn.setBounds(465, Height-85, 60, 30);
		cancelBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	    
		return cancelBtn;
	}
	
	private JLabel pickLabel() {
		
		JLabel picklbl = new JLabel("근처 숙소를 예약하시겠어요?");
		picklbl.setFont(new Font("굴림", Font.BOLD, 20));
		picklbl.setSize(300, 60);
		picklbl.setLocation(100, 400);
		return picklbl;
	}
	
	
	
	// Frame Size
	private int Width = 600;
	private int Height = 500;
	// Frame Location
	private int X = Macro.g_X+587;
	private int Y = Macro.g_Y;
	// Reservation
	private JejuReservation m_reserve;
	
	
	// Button size and coord from OtherImage
	private int btnWidth = 200;
	private int btnHeight = 200;
	private int btnX = 0;
	private int btnY = 0;
	private int swit = 0;
	private int distanceY = 0;
	private ImageIcon Images[];
	private JButton imageButtons[];
}