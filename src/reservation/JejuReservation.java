package reservation;


import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Basic.Macro;
import character.JejuTypeSelection;
import intro.JejuBase;


public class JejuReservation extends JPanel{
	
	public JejuReservation() {
				
	}
	
	public void Setting()
	{
		setLayout(null);
		setSize(Macro.g_Width, Macro.g_Height);
		setVisible(true);
		setBackground(Color.white);
		ImageIcon i = new ImageIcon("./src/btnImage/back_icon.png");
		ImageIcon i2 = new ImageIcon("./src/btnImage/back_icon2.png");
		backBtn = new JButton(i);
		backBtn.setRolloverIcon(i2);
		backBtn.setSize(64, 64);
		backBtn.setLocation(60, 670);
		backBtn.setBorderPainted(false);
		backBtn.setContentAreaFilled(false);
		backBtn.setFocusPainted(false);
		
		// For FrameDate
		m_date = new JejuDateFrame();
		
		add(backBtn);
		
		backBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JejuBase.getInstance(new JejuTypeSelection());
			}
		});
		
		
		hotelName();
		date();
		Bed();
		SetReserveBtn();
		HotelPicture();
		HotelAddress();
		HotelNumber();
		//HotelBackground();		
		//BG_jejuReservation();
	}
	public void BG_jejuReservation() {
			//포스터 이미지
			ImageIcon JejuMainIcon=new ImageIcon("./src/character/background/005.png"); //그림불러오기
			JLabel JejuMainLabel=new JLabel(JejuMainIcon); //그림 붙이기
			JejuMainLabel.setBounds(Macro.g_X,Macro.g_Y,615, 790);
			JejuMainLabel.setLocation(-15, 0);
			add(JejuMainLabel);
		}					
	
	private void hotelName()
	{
		JLabel hotelLabel = new JLabel(m_hotelName);
		hotelLabel.setFont(new Font("Serif", Font.BOLD, 40));
		hotelLabel.setBounds(hotelNameCoordX, hotelNameCoordY, hotelNameWidth, hotelNameHeight);
		add(hotelLabel);
	}
	
	
	private void date()
	{
		JLabel dateSelect = new JLabel("날짜 예약");
		dateSelect.setBounds(middleCoordX + 60, middleCoordY, 100, 60);
		add(dateSelect);														 
		ImageIcon i = new ImageIcon("./src/btnImage/Calendar-icon.png");
		ImageIcon i2 = new ImageIcon("./src/btnImage/Calendar-icon2.png");
		JButton dateButton = new JButton(i);
		dateButton.setRolloverIcon(i2);
		dateButton.setBorderPainted(false);
		dateButton.setContentAreaFilled(false);
		dateButton.setFocusPainted(false);
		dateButton.setBounds(middleCoordX, middleCoordY, 60, 60);
		add(dateButton);
		JejuReservation me = this;
		dateButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				m_date.Initialize(new GetSet_CheckDate(), me);
			}
		});
		
	}
	
	
	private void Bed()
	{
		JLabel dateSelect = new JLabel("객실 선택");
		dateSelect.setBounds(middleCoordX + 320, middleCoordY, 100, 60);
		add(dateSelect);										  
		
		ImageIcon i = new ImageIcon("./src/btnImage/Household-Bed-icon.png");
		ImageIcon i2 = new ImageIcon("./src/btnImage/Household-Bed-icon2.png");
		JButton Bedbtn = new JButton(i);
		Bedbtn.setRolloverIcon(i2);
		Bedbtn.setBorderPainted(false);
		Bedbtn.setContentAreaFilled(false);
		Bedbtn.setFocusPainted(false);
		Bedbtn.setBounds(middleCoordX + 250, middleCoordY - 5, 64, 64);
		JejuReservation reserve = this;
		Bedbase bb = new Bedbase();
		bb.setParent(reserve);
		Bedbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JejuBase.getInstance(bb);
			}
		});
		add(Bedbtn);
	}
	
	public void HotelBackNum(String pic) {
		BG_pic = pic;
	}
	
	//BackGround Color 
	public void HotelBackground() {
		//포스터 이미지
		ImageIcon JejuMainIcon=new ImageIcon(BG_pic); //그림불러오기
		JLabel JejuMainLabel=new JLabel(JejuMainIcon); //그림 붙이기
		JejuMainLabel.setBounds(Macro.g_X,Macro.g_Y,615, 790);
		JejuMainLabel.setLocation(-15, 0);
		add(JejuMainLabel);
	}
		public void HotelsPicNum(String pic)
	 {
		hotelpic = pic;
	 }

	public void HotelPicture()	
	{
		img = new ImageIcon(hotelpic);
		Macro.customization(img, 520, 200);
		JButton addLabel = new JButton(img);
		HotelpicRec = new Rectangle(30, 200, 520, 200);
		addLabel.setBounds(HotelpicRec);
		add(addLabel);
	}														  
	
	
	private void HotelAddress()
	{
		JLabel addLabel = new JLabel
				(
					"<html>"
				    + "Address <br/>"
					+ m_hotelAdr
					+ "<html>"
				);
		
		HoteladrRec = new Rectangle(30, 400, 200, 50);
		addLabel.setBounds(HoteladrRec);
		add(addLabel);
	}
	
	private void HotelNumber()
	{
		JLabel addLabel = new JLabel
				(
					"<html>"
				    + "Number <br/>"
					+ m_hotelNum
					+ "<html>"
				);
		HotelNumRec = new Rectangle(30, 450, 100, 50);
		addLabel.setBounds(HotelNumRec);
		add(addLabel);
	}
	
	private void SetReserveBtn()
	{
		ImageIcon i3 = new ImageIcon("./src/btnImage/next_icon.png");
		ImageIcon i4 = new ImageIcon("./src/btnImage/next_icon2.png");
		reserveBtn = new JButton(i3);
		reserveBtn.setRolloverIcon(i4);
		reserveBtn.setSize(64, 64);
		reserveBtn.setLocation(470, 670);
		reserveBtn.setBorderPainted(false);
		reserveBtn.setContentAreaFilled(false);
		reserveBtn.setFocusPainted(false);
		reserveBtn.setVisible(true);
		
		add(reserveBtn);
		
		JejuReservation me = this;
		reserveBtn.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(m_date.GetTotalDate().equals(""))
			{
				JOptionPane.showMessageDialog(null, "날짜를 입력해주세요");
				
			}
			else if((Bedbaguni.count1 + Bedbaguni.count2 + Bedbaguni.count3 + Bedbaguni.count4) <= 0)
			{
				JOptionPane.showMessageDialog(null, "객실을 선택해주세요");
			}
			else
			{
				Payment pay = new Payment();
				pay.setReserve(me);
				pay.Setting();
				
				JejuBase.getInstance(pay);
			}
			
		}
	});
		
	}
	
	public void HotelDate()
	{
			hotelDate = new TextArea("", 0, 0, TextArea.SCROLLBARS_NONE);      
		 	HotelNumRec = new Rectangle(30, 500, 500, 50);    
		 	hotelDate.setBounds(HotelNumRec);
		 	//hotelDate.setEnabled(false);
		 	hotelDate.setBackground(new Color(255,255,153));
		 	hotelDate.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
		 	hotelDate.isVisible();
		 	hotelDate.setText("Date \n" + m_date.GetTotalDate());
		 	add(hotelDate);
	 }
	
	public void HotelRoom()
	{
		    hotelRoom = new TextArea("", 0, 0, TextArea.SCROLLBARS_NONE);      
		 	HotelNumRec = new Rectangle(30, 550, 500, 50);    
		 	hotelRoom.setBounds(HotelNumRec);
		 	//hotelRoom.setEnabled(false);
		 	hotelRoom.setBackground(new Color(255,255,153));
		 	hotelRoom.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
		 	hotelRoom.setText("Room : " + roomType() +"\r\n"
		 				   + "인원수 : " + Bedbaguni.person);
		 	add(hotelRoom);
	 }
	
	public void SetType()
	{
		if(Bedbaguni.count1 > 0)
		{
			single = "싱글 " + Bedbaguni.count1 + "개 ";
		}
		else 
			single = "";
		
		if(Bedbaguni.count2 > 0)
		{
			two = "더블 "+ Bedbaguni.count2 + "개 ";
		}
		else 
			two = "";
		
		if(Bedbaguni.count3 > 0)
		{
			queen = "퀸 "+ Bedbaguni.count3 + "개 ";
		}
		else 
			queen = "";
		
		if(Bedbaguni.count4 > 0)
		{
			king = "킹 "+ Bedbaguni.count4 + " 개";
		}
		else 
			king = "";
		
	}
	
	public String roomType()
	{
		return single + " " + two + " " + queen + " " + king;
	}
	
	 public void HotelsInfo(String _name, String _address, String _number)
	 {
		 m_hotelName = _name;
		 m_hotelAdr  = _address;
		 m_hotelNum  = _number;
	 }
	 
	 public String getHotelName() 	 { return m_hotelName; }
	 public String getHotelAddress() { return m_hotelAdr;  }
	 public String getHotelNum() 	 { return m_hotelNum;  }
	 public ImageIcon getHotelImg()  { return img; 		   }
	
	//=========BASIC VARIABLE========= 
	private JButton backBtn = null;
	private JButton reserveBtn = null;
	private int miniSizeX = 150;
	private int miniSizeY = 70;
	private int minicoordY = 650;
	private int minicoordX = 30;
	private int miniDistanceX = 370;
	
	// hottel label variable
	private int hotelNameCoordX = 50;
	private int hotelNameCoordY = 30;
	private int hotelNameWidth = 300;
	private int hotelNameHeight = 90;
	
	// hottel picture and address number
	private Rectangle HotelpicRec;
	private Rectangle HoteladrRec;
	private Rectangle HotelNumRec;
	
	// date and num variable
	private int middleCoordX = 50;
	private int middleCoordY = 130;
	private int middleWidth = 90;
	private int middleHeight = 40;
	
	// hotelInfo variable
	private String m_hotelName;
	private String m_hotelAdr;
	private String m_hotelNum;
	//추가------------------------
	// Hotel Pictures variable
	private String hotelpic;
	private ImageIcon img;
	//추가------------------------					   
	// ===================== Calendar Part =====================
	public JejuDateFrame m_date;
	
	public TextArea hotelDate;
	public TextArea hotelRoom;
	
	private String BG_pic;																	
	// ===================== Bed Part ===================== 
	public Bedbase 	  m_bed;
	public static String single = "";
	public static String two = "";
	public static String queen = "";
	public static String king = "";
	
}
