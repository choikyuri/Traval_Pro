package character;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Basic.Hotels;
import Basic.Macro;
import intro.JejuBase;
import reservation.JejuReservation;

public class JejuPlace extends JPanel{ 
	
	public JejuPlace()
	{
		Setting();
	}
	
	private void Setting()
	{
		setLayout(null);
		setSize(Macro.g_Width, Macro.g_Height);
		setVisible(true);
		
		
		ImageIcon i = new ImageIcon("./src/btnImage/back_icon.png");
		ImageIcon i2 = new ImageIcon("./src/btnImage/back_icon2.png");
		backBtn = new JButton(i);
		backBtn.setRolloverIcon(i2);
		backBtn.setSize(64, 64);
		backBtn.setLocation(60, 670);
		backBtn.setBorderPainted(false);
		backBtn.setContentAreaFilled(false);
		backBtn.setFocusPainted(false);
		

		add(backBtn);
	
		
		backBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				JejuBase.getInstance(new JejuTypeSelection());
			}
		});
	}
	
	private void gridFrame(String button1, String label1, String button2, String label2)
	{
		ImageIcon Img = new ImageIcon(button1);
		Macro.customization(Img, BigSizeX, BigSizeY);
		
		ImageIcon Img2 = new ImageIcon(button2);
		Macro.customization(Img2, BigSizeX, BigSizeY);
		
		// first Button
		firstBtn = new JButton(Img);
		firstBtn.setBounds(BigcoordX, BigcoordY, BigSizeX, BigSizeY);
		
		// first Label
		firstLabel = new JLabel(label1);
		firstLabel.setBounds(BigcoordX + BigDistanceX, BigcoordY, BigSizeX, BigSizeY);
		firstLabel.setFont(new Font("Couruer New", Font.BOLD , 13));
		// second Button
		secondBtn = new JButton(Img2);
		secondBtn.setBounds(BigcoordX, BigcoordY + BigDistanceY, BigSizeX, BigSizeY);
		// second Label
		secondLabel = new JLabel(label2);
		secondLabel.setBounds(BigcoordX + BigDistanceX, BigcoordY + BigDistanceY, BigSizeX, BigSizeY);
		secondLabel.setFont(new Font("Couruer New", Font.BOLD , 13));
		
		add(firstBtn);
		add(firstLabel);
		add(secondBtn);
		add(secondLabel);
	}
	
	public void CafeTour()
	{
		String btn1Img = "./src/character/common_banner/osulloc.jpg";
		String label1 =  
				  "<html>"
				+ "◎ 오설록 ◎<br/><br/>"
				+ "[리뷰점수] 3.9 ★★★☆☆<br/>"
				+ "[영업시간] 매일 09:00 ~ 18:00<br/>"
				+ "[전화번호] 064-794-5312<br/>"
				+ "[해시태그]<br/>"
				+ "#달콤한 #녹차밭 #아모레퍼시픽 #티스톤 #카페 #녹차라떼<br/> "
				+ "#자연경관 #걷기좋은 #단풍명소 #흐림<br/>"
				+ "</html>";
		
		String btn2Img = "./src/character/common_banner/hueilot.jpg";
		String label2 =  
				  "<html>"
				+ "◎ 휴일로 ◎<br/><br/>"
				+ "[리뷰점수] 4.1 ★★★★☆<br/>"
				+ "[영업시간] 매일 09:00 ~ 20:30(last order 20:00)<br/>"
				+ "[전화번호] 010-6835-4965<br/>"
				+ "[해시태그]<br/>"
				+ "#무료주차 #한라산 #말차무스 #핫플 #분위기 #서귀포<br/> "
				+ "#카페투어 #cafe interior #한라산<br/>"
				+ "</html>";

		gridFrame(btn1Img, label1, btn2Img, label2);
		
		
		firstBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				OtherImages2 otherImages = new OtherImages2();
				JejuReservation reserve = new JejuReservation();
				reserve.HotelsPicNum(heaBeach);							   
				reserve.HotelBackNum(selection_bg1);						
				reserve.HotelsInfo(osullocHotels[0], osullocHotels[1], osullocHotels[2]);
				otherImages.Details(osulloc, reserve);
			}
		});
		
		secondBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				OtherImages2 otherImages = new OtherImages2();
				JejuReservation reserve = new JejuReservation();
				reserve.HotelsPicNum(lotteCity);								
				reserve.HotelBackNum(selection_bg2);						
				reserve.HotelsInfo(hueilotHotels[0],hueilotHotels[1], hueilotHotels[2]);
				otherImages.Details(hueilot, reserve);
				
			}
		});
	}
	
	public void Activity()
	{
			String btn1Img = "./src/character/common_banner/seawalk.jpg";
			String label1 =  
					  "<html>"
					+ "◎ 씨워크 ◎<br/><br/>"
					+ "[리뷰점수] 4.0 ★★★★☆<br/>"
					+ "[영업시간] 매일 09:00 ~ 18:00<br/>"
					+ "[전화번호] 064-723-1551<br/>"
					+ "[해시태그]<br/>"
					+ "#씨워킹 #투명카약 #스노클링 #여름 #해양레저 <br/> "
					+ "#우주인헬멧 #바다 #제주액티비티 <br/>"
					+ "</html>";
			
			String btn2Img = "./src/character/common_banner/surfing.jpg";
			String label2 = 
					  "<html>"
					+ "◎ 서핑 ◎<br/><br/>"
					+ "[리뷰점수] 5.0 ★★★★★<br/>"
					+ "[영업시간] 매일 09:00 ~ 18:00<br/>"
					+ "[전화번호] 010-4757-3364<br/>"
					+ "[해시태그]<br/>"
					+ "#제주입문서핑 #운좋으면돌고래만남 <br/> "
					+ "#파도의짜릿함 #장비렌탈 #서퍼들의천국<br/>"
					+ "</html>";
			

			gridFrame(btn1Img, label1, btn2Img, label2);
			
			
			firstBtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					OtherImages2 otherImages = new OtherImages2();
					JejuReservation reserve = new JejuReservation();
					reserve.HotelsPicNum(jejuBuyoung);				   
					reserve.HotelBackNum(selection_bg3);					 
					reserve.HotelsInfo(seawalkHotels[0],seawalkHotels[1], seawalkHotels[2]);
					otherImages.Details(seawalk, reserve);
		}
			});
			
			secondBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					
					OtherImages2 otherImages = new OtherImages2();
					JejuReservation reserve = new JejuReservation();
					reserve.HotelsPicNum(hiddenCliff);				   
					reserve.HotelBackNum(selection_bg4);					 
					reserve.HotelsInfo(surfingHotels[0],surfingHotels[1], surfingHotels[2]);
					otherImages.Details(surfing, reserve);
				}
			});
		}//Activity 
	
	public void HealingTour()
	{
		String btn1Img = "./src/character/common_banner/bijarim.jpg";
		String label1 =  
				  "<html>"
				+ "◎ 비자림 ◎<br/><br/>"
				+ "[리뷰점수] 5.0 ★★★★★<br/>"
				+ "[영업시간] 매일 09:00 ~ 18:00<br/>"
				+ "[전화번호] 064-710-7912<br/>"
				+ "[해시태그]<br/>"
				+ "#걷기 #등산 #아이 #여름 #힐링 #수국<br/> "
				+ "#자연경관 #걷기좋은 #단풍명소 #흐림<br/>"
				+ "</html>";
		String btn2Img = "./src/character/common_banner/norimae.jpg";

		
		String label2 = 
				  "<html>"
				+ "◎ 노리매 ◎<br/><br/>"
				+ "[리뷰점수] 4.0 ★★★★☆<br/>"
				+ "[영업시간] 매일 09:00 ~ 18:00<br/>"
				+ "[전화번호] 064-792-8211<br/>"
				+ "[해시태그]<br/>"
				+ "#걷기좋은 #나들이 #핑크뮬리명소 #자연경관<br/> "
				+ "#커플 #봄 #포토스팟 #매화 #테마공원<br/>"
				+ "</html>";

		gridFrame(btn1Img, label1, btn2Img, label2);
		
		firstBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				OtherImages2 otherImages = new OtherImages2();
				JejuReservation reserve = new JejuReservation();
				reserve.HotelsPicNum(grandHayat);					 
				reserve.HotelBackNum(selection_bg5);						
				reserve.HotelsInfo(bijarimHotels[0],bijarimHotels[1], bijarimHotels[2]);
				otherImages.Details(bijarim, reserve);
			}
		});
		
		secondBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				OtherImages2 otherImages = new OtherImages2();
				JejuReservation reserve = new JejuReservation();
				reserve.HotelsPicNum(jejuShinra);					 
				reserve.HotelBackNum(selection_bg6);						
				reserve.HotelsInfo(norimaeHotels[0],norimaeHotels[1], norimaeHotels[2]);
				otherImages.Details(norimae, reserve);
			}
		});
	}//HealingTour
	
	
	
	public void BG_CafeTour() {
		//포스터 이미지
		ImageIcon JejuMainIcon=new ImageIcon("./src/character/background/BG_CafeTour.png"); //그림불러오기
		JLabel JejuMainLabel=new JLabel(JejuMainIcon); //그림 붙이기
		JejuMainLabel.setBounds(Macro.g_X,Macro.g_Y,615, 790);
		JejuMainLabel.setLocation(-15, 0);
		add(JejuMainLabel);
	}
	//BackGround
	public void BG_Activity() {
		//포스터 이미지
		ImageIcon JejuMainIcon=new ImageIcon("./src/character/background/BG_Activity.png"); //그림불러오기
		JLabel JejuMainLabel=new JLabel(JejuMainIcon); //그림 붙이기
		JejuMainLabel.setBounds(Macro.g_X,Macro.g_Y,615, 790);
		JejuMainLabel.setLocation(-15, 0);
		add(JejuMainLabel);
	}
	//BackGround
	public void BG_HealingTour() {
//	    //포스터 이미지
		ImageIcon JejuMainIcon =new ImageIcon("./src/character/background/BG_HealingTour.png"); //그림불러오기
		JLabel JejuMainLabel=new JLabel(JejuMainIcon); //그림 붙이기
		JejuMainLabel.setBounds(Macro.g_X,Macro.g_Y,615, 790);
		JejuMainLabel.setLocation(-15, 0);
		add(JejuMainLabel);
	}
	// ==========================================
	private JButton firstBtn = null;
	private JButton secondBtn = null;
	private JButton backBtn = null;
	private JLabel firstLabel = null;
	private JLabel secondLabel = null;

	// backBtn, reserveBtn size and coord
	private int miniSizeX = 150;
	private int miniSizeY = 70;
	private int minicoordY = 650;
	private int minicoordX = 30;
	
	// firstBtn, secondBtn, Labels size and coord
	private int BigSizeX = 250;
	private int BigSizeY = 180;
	private int BigcoordX = 30;
	private int BigcoordY = 150;
	private int BigDistanceX = 270;
	private int BigDistanceY = 200;
	
	
	// Activity variable
	private String seawalk = "./src/character/resource_activity/seawalk";
	private String seawalkHotels[] = {"Hyatt","제주 서귀포시 중문관광로 222","064-731-5500"};
	private String surfing = "./src/character/resource_activity/surfing";	
	private String surfingHotels[] = {"Hilton","제주 서귀포시 중문관광로 154-17","0507-1312-8866"};
	// Healing variable
	private String norimae = "./src/character/resource_healing/norimae";
	private String norimaeHotels[] = {"Maison Glad Jeju","제주 서귀포시 중문관광로72번길 75","064-735-5114"};
	private String bijarim = "./src/character/resource_healing/bijarim";
	private String bijarimHotels[] = {"Shilla Stay Jeju","제주 제주시 노연로 12","064-907-1234"};
	// Desert variable
	private String osulloc = "./src/character/resource_desert/osulloc";
	private String osullocHotels[] = {"The Shilla Seoul","제주 서귀포시 표선면 민속해안로 537","064-780-8100"};
	private String hueilot = "./src/character/resource_desert/hueilot";
	private String hueilotHotels[] = {"Lotte Hotel","제주 제주시 도령로 83","064-730-1000"};
	//예약창 호텔 사진 정보 variable
	private String jejuBuyoung = "./src/character/resourece_hotel/resourece_jejuBuyoung/jejuBuyoung0.jpg";
	private String hiddenCliff = "./src/character/resourece_hotel/resourece_hiddenCliff/hiddenCliff0.jpg";
	private String grandHayat = "./src/character/resourece_hotel/resourece_grandHayat/grandHayat0.jpg";
	private String jejuShinra = "./src/character/resourece_hotel/resourece_jejuShinra/jejuShinra0.jpg";
	private String heaBeach = "./src/character/resourece_hotel/resourece_heaBeach/heaBeach0.jpg";
	private String lotteCity = "./src/character/resourece_hotel/resourece_rotteCity/rotteCity0.jpg";
	
																									   
	private String selection_bg1 = "./src/character/background/BG_jejuReservation01.png";
	private String selection_bg2 = "./src/character/background/BG_jejuReservation02.png";
	private String selection_bg3 = "./src/character/background/BG_jejuReservation03.png";
	private String selection_bg4 = "./src/character/background/BG_jejuReservation04.png";
	private String selection_bg5 = "./src/character/background/BG_jejuReservation05.png";
	private String selection_bg6 = "./src/character/background/BG_jejuReservation06.png";							
}
