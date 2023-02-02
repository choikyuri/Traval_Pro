package character;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Basic.Macro;
import intro.JejuBase;
import reservation.JejureservationInfo;

public class JejuTypeSelection extends JPanel {
	
	public JejuTypeSelection() {
		
		setting();
		Activity();
		Healing();
		DalcomDesert();
		Intro(); 
		reservationbtn();
	}// constructor
	
	   
	private void Intro() {
		//포스터 이미지
		ImageIcon JejuMainIcon=new ImageIcon("./src/character/background/BG_JejuTypeSelcetion.png"); //그림불러오기
		JLabel JejuMainLabel=new JLabel(JejuMainIcon); //그림 붙이기
		JejuMainLabel.setBounds(Macro.g_X,Macro.g_Y,615, 790);
		JejuMainLabel.setLocation(-15, 0);
		add(JejuMainLabel);
	}				   
	//info btn
	private void reservationbtn() {
		ImageIcon bookingInfo = new ImageIcon("./src/character/common_banner/Mypage.png");
		Macro.customization(bookingInfo, 150, 120);
		JButton reservationInfo = new JButton("예약정보");
		reservationInfo.setBounds(480,40,50,50);
		add(reservationInfo);
		reservationInfo.setBorderPainted(false);
		reservationInfo.setContentAreaFilled(false);
		reservationInfo.setFocusPainted(false);
		reservationInfo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new JejureservationInfo();
			}
		});
	}	   
	private void setting()
	{
		setLayout(null);
		setSize(Macro.g_Width, Macro.g_Height);
		setBackground(Color.white);
	}
	
	private void Activity()
	{
		
		ImageIcon select1 = new ImageIcon("./src/resource/banner/Activity.jpg");
		
		Macro.customization(select1, 520, 180);		
		JButton btnselect1 = new JButton(select1);
		
		btnselect1.setBounds(coordX, coordY,520, 180);
		add(btnselect1);
		
		btnselect1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jejuPlace = new JejuPlace();
				jejuPlace.Activity();
				jejuPlace.BG_Activity();			
				JejuBase.getInstance(jejuPlace);
			}});
		
	}
	
	
	private void Healing()
	{
		ImageIcon healingImg = new ImageIcon("./src/resource/banner/Healing.jpg");
		
	    Macro.customization(healingImg, 520, 180);
		JButton healingBtn = new JButton(healingImg);
	    healingBtn.setBounds(coordX, coordY + distanceY, 520, 180);		
		add(healingBtn);
		healingBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jejuPlace = new JejuPlace();
				jejuPlace.HealingTour();
				jejuPlace.BG_HealingTour();												
				JejuBase.getInstance(jejuPlace);
			}
		});
	}
	
	private void DalcomDesert()
	{		
		ImageIcon cafeImg = new ImageIcon("./src/resource/banner/Cafe_Tour.jpg");
	    Macro.customization(cafeImg, 520, 180);
		
		JButton desertBtn = new JButton(cafeImg);
		desertBtn.setBounds(coordX, coordY + (distanceY * 2), 520, 180);
		
		
		add(desertBtn);
		desertBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jejuPlace = new JejuPlace();
				jejuPlace.CafeTour();
				jejuPlace.BG_CafeTour();												
				JejuBase.getInstance(jejuPlace);
			}
		});
	}
	



	
	// ==========================================
	
	
	// Activity variable
	private int sizeY = 194;
	private int coordX = 30;
	private int coordY = 150;
	private int distanceY = 200;
	// Healing variable
	// Healing variable
	private JejuPlace jejuPlace;
	// Desert variable

	
	
	
	
}// constructor





