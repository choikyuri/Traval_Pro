package reservation;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.Document;

import Basic.Macro;
import intro.JejuBase;

public class Bedbase extends JPanel {

	public Bedbase() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		setSize(600, 800);
		setLocation(0, 0);
		setVisible(true);
		BPMB();// 플러스마이너스 버튼구현
		infobtn();// 정보 , 뒤로가기버튼 오류)뒤로갓다 들어오면 텍스트필드값이 추가로됨
		BedSize();
		Backgorund();	   
		
	}
	private void Backgorund() {
		//포스터 이미지
		ImageIcon JejuMainIcon=new ImageIcon("./src/character/background/003.png"); //그림불러오기
		JLabel JejuMainLabel=new JLabel(JejuMainIcon); //그림 붙이기
		JejuMainLabel.setBounds(Macro.g_X,Macro.g_Y,615, 790);
		JejuMainLabel.setLocation(-15, 0);
		add(JejuMainLabel);
	}

	private void infobtn() { // 인원수 침대 누르는 상단바 /미구현
		JLabel btnperson = new JLabel("인원수 선택");
		JLabel btnbed = new JLabel("침대 선택");
		// 인원버튼 설정
		btnperson.setBounds(80, 20, 100, 30);
		btnperson.setFont(new Font("굴림", Font.BOLD, 15));
		btnperson.setBackground(new Color(255, 255, 255));
		// 침대
		btnbed.setBounds(500, 40, 100, 20);
		btnbed.setFont(new Font("굴림", Font.BOLD, 15));
		btnbed.setBackground(new Color(255, 255, 255));
		add(btnperson);
		add(btnbed);

	}

	// 인원 선택
	private void BPMB() {
		BedPlusMinusBtn BPMB = new BedPlusMinusBtn(); // 버튼
		Font f = new Font("monospaced", Font.BOLD, 20);
		pmBtntextPerson = BPMB.getCountArea1();
		pmBtntextPerson.setSize(20, 30);
		pmBtntextPerson.setLocation(40, 20);// 511
		pmBtntextPerson.setFont(f);
		pmBtntextPerson.setFocusable(false);

		JButton plusCount = BPMB.ppbtn(1, pmBtntextPerson);
		plusCount.setSize(20, 20);
		plusCount.setLocation(60, 15);// 530

		JButton minusCount = BPMB.mpbtn(1, pmBtntextPerson);
		minusCount.setSize(20, 20);
		minusCount.setLocation(60, 35);// 490
		add(minusCount);
		add(plusCount);
		add(pmBtntextPerson);
		
	}

	private void setting() {
		setLayout(null);
		setSize(Macro.g_Width, Macro.g_Height);
		setBackground(Color.white);
	}

	// 침대 이미지 불러오기
	private void BedSize() {
		// 메뉴
		ImageIcon menu1 = new ImageIcon("./src/resource/bedImage/single.jpg");
		Macro.customization(menu1, 120, 120);
		
		JLabel lblmenu1 = new JLabel(menu1);
		lblmenu1.setSize(120, 120);// 이미지 사이즈
		lblmenu1.setLocation(40, 75);// 이미지 위치
		add(lblmenu1);
		JLabel single = new JLabel("Single Size");
		single.setBounds(40, 50, 100, 30);
		single.setFont(new Font("굴림", Font.BOLD, 15));
		single.setBackground(new Color(255, 255, 255));
		add(single);

		JLabel SingleBed = new JLabel("Single");
		SingleBed.setBounds(510, 70, 100, 30);
		SingleBed.setFont(new Font("굴림", Font.BOLD, 12));
		SingleBed.setBackground(new Color(255, 255, 255));
		add(SingleBed);

		// 메뉴 관련 텍스트
		BedCollect.single();
		TextArea story1 = new TextArea(BedCollect.Bedinformation + "", 4, TextArea.SCROLLBARS_BOTH);
		story1.setEditable(false);
		story1.setSize(330, 120);
		story1.setLocation((int) lblmenu1.getLocation().getX() + 120, (int) lblmenu1.getLocation().getY());
		story1.setBackground(new Color(255, 255, 255));
		story1.setFont(new Font("굴림", Font.BOLD, 13));
		story1.setFocusable(false);
		add(story1);

		// 몇개를 담을것인지
		BedPlusMinusBtn BPMB = new BedPlusMinusBtn();
		Font f = new Font("monospaced", Font.BOLD, 20);
		pmBtnSingle = BPMB.getCountArea();
		pmBtnSingle.setSize(20, 30);
		pmBtnSingle.setLocation(530, 111);

		JButton plusCount = BPMB.plusbtn(1, pmBtnSingle);
		plusCount.setSize(20, 20);
		plusCount.setLocation(511, 105);

		JButton minusCount = BPMB.minusbutton(1, pmBtnSingle);
		minusCount.setSize(20, 20);
		minusCount.setLocation(511, 130);

		add(pmBtnSingle);
		add(plusCount);
		add(minusCount);
		//////////////////////////////////////// 투베드

		// 메뉴
		ImageIcon menu2 = new ImageIcon("./src/resource/bedImage/two.jpg");
		Macro.customization(menu2, 120, 120);
		JLabel lblmenu2 = new JLabel(menu2);
		lblmenu2.setSize(120, 120);// 이미지 사이즈
		lblmenu2.setLocation(40, 225);// 이미지 위치
		add(lblmenu2);
		
		// 라벨추가
		JLabel TwoBed = new JLabel("Two Size");
		TwoBed.setBounds(40, 200, 100, 30);
		TwoBed.setFont(new Font("굴림", Font.BOLD, 15));
		TwoBed.setBackground(new Color(255, 255, 255));
		add(TwoBed);
		
		JLabel TwoBB = new JLabel(" Two");
		TwoBB.setBounds(510, 220, 100, 30);
		TwoBB.setFont(new Font("굴림", Font.BOLD, 12));
		TwoBB.setBackground(new Color(255, 255, 255));
		add(TwoBB);
		
		// 메뉴 관련 텍스트
		BedCollect.two();
		TextArea story2 = new TextArea(BedCollect.Bedinformation + "", 4, TextArea.SCROLLBARS_BOTH);
		story2.setEditable(false);
		story2.setSize(330, 120);
		story2.setLocation((int) lblmenu2.getLocation().getX() + 120, (int) lblmenu2.getLocation().getY());
		story2.setBackground(new Color(255, 255, 255));
		story2.setFont(new Font("monospaced", Font.BOLD, 13));
		story2.setFocusable(false);
		add(story2);
		
		// 몇개를 담을것인지
		pmBtnTwo = BPMB.getCountArea();
		pmBtnTwo.setSize(20, 30);
		pmBtnTwo.setLocation(530, 266);

		JButton plusCount1 = BPMB.plusbtn(2, pmBtnTwo);
		plusCount1.setSize(20, 20);
		plusCount1.setLocation(511, 260);

		JButton minusCount1 = BPMB.minusbutton(2, pmBtnTwo);
		minusCount1.setSize(20, 20);
		minusCount1.setLocation(511, 285);

		add(pmBtnTwo);
		add(plusCount1);
		add(minusCount1);

		//////////////////////////////////////// 퀸사이즈

		// 메뉴
		ImageIcon menu3 = new ImageIcon("./src/resource/bedImage/queen.jpg");
		
		Macro.customization(menu3, 120, 120);
		JLabel lblmenu3 = new JLabel(menu3);
		lblmenu3.setSize(120, 120);// 이미지 사이즈
		lblmenu3.setLocation(40, 375);// 이미지 위치
		add(lblmenu3);

		// 라벨추가
		JLabel Queen = new JLabel("Queen Size");
		Queen.setBounds(40, 355, 100, 30);
		Queen.setFont(new Font("굴림", Font.BOLD, 15));
		Queen.setBackground(new Color(255, 255, 255));
		add(Queen);

		JLabel QueenBed = new JLabel("Queen");
		QueenBed.setBounds(510, 375, 100, 30);
		QueenBed.setFont(new Font("굴림", Font.BOLD, 12));
		QueenBed.setBackground(new Color(255, 255, 255));
		add(QueenBed);

		// 메뉴 관련 텍스트
		BedCollect.Queen();
		TextArea story3 = new TextArea(BedCollect.Bedinformation + "", 4, TextArea.SCROLLBARS_BOTH);
		story3.setEditable(false);
		story3.setSize(330, 120);
		story3.setLocation((int) lblmenu3.getLocation().getX() + 120, (int) lblmenu3.getLocation().getY());
		story3.setBackground(new Color(255, 255, 255));
		story3.setFont(new Font("monospaced", Font.BOLD, 13));
		story3.setFocusable(false);
		add(story3);

		// 몇개를 담을것인지
		pmBtnQ = BPMB.getCountArea();
		pmBtnQ.setSize(20, 30);
		pmBtnQ.setLocation(530, 421);

		JButton plusCount2 = BPMB.plusbtn(3, pmBtnQ);
		plusCount2.setSize(20, 20);
		plusCount2.setLocation(511, 415);

		JButton minusCount2 = BPMB.minusbutton(3, pmBtnQ);
		minusCount2.setSize(20, 20);
		minusCount2.setLocation(511, 440);

		add(pmBtnQ);
		add(plusCount2);
		add(minusCount2);

		//////////////////////////////////////// 킹사이즈

		// 메뉴
		ImageIcon menu4 = new ImageIcon("./src/resource/bedImage/king.jpg");
		Macro.customization(menu4, 120, 120);
		JLabel lblmenu4 = new JLabel(menu4);
		lblmenu4.setSize(120, 120);// 이미지 사이즈
		lblmenu4.setLocation(40, 525);// 이미지 위치
		add(lblmenu4);
		// 라벨추가
		JLabel King = new JLabel("King Size");
		King.setBounds(40, 505, 100, 30);
		King.setFont(new Font("굴림", Font.BOLD, 15));
		King.setBackground(new Color(255, 255, 255));
		add(King);

		JLabel KingBed = new JLabel(" King");
		KingBed.setBounds(510, 525, 100, 30);
		KingBed.setFont(new Font("굴림", Font.BOLD, 12));
		KingBed.setBackground(new Color(255, 255, 255));
		add(KingBed);

		// 메뉴 관련 텍스트
		BedCollect.king();
		TextArea story4 = new TextArea(BedCollect.Bedinformation + "", 4, TextArea.SCROLLBARS_BOTH);
		story4.setEditable(false);
		story4.setSize(330, 120);
		story4.setLocation((int) lblmenu4.getLocation().getX() + 120, (int) lblmenu4.getLocation().getY());
		story4.setBackground(new Color(255, 255, 255));
		story4.setFont(new Font("monospaced", Font.BOLD, 13));
		story4.setFocusable(false);
		add(story4);

		// 몇개를 담을것인지
		pmBtnK = BPMB.getCountArea();
		pmBtnK.setSize(20, 30);
		pmBtnK.setLocation(530, 576);

		JButton plusCount3 = BPMB.plusbtn(4, pmBtnK);
		plusCount3.setSize(20, 20);
		plusCount3.setLocation(511, 570);

		JButton minusCount3 = BPMB.minusbutton(4, pmBtnK);
		minusCount3.setSize(20, 20);
		minusCount3.setLocation(511, 595);

		add(pmBtnK);
		add(plusCount3);
		add(minusCount3);

		ImageIcon i = new ImageIcon("./src/btnImage/back_icon.png");
		ImageIcon i2 = new ImageIcon("./src/btnImage/back_icon2.png");
		backBtn = new JButton(i);
		backBtn.setRolloverIcon(i2);
		backBtn.setSize(64, 64);
		backBtn.setLocation(60, 670);
		backBtn.setBorderPainted(false);
		backBtn.setContentAreaFilled(false);
		backBtn.setFocusPainted(false);

		ImageIcon i3 = new ImageIcon("./src/btnImage/next_icon.png");
		ImageIcon i4 = new ImageIcon("./src/btnImage/next_icon2.png");
		reserveBtn = new JButton(i3);
		reserveBtn.setRolloverIcon(i4);
		reserveBtn.setSize(64, 64);
		reserveBtn.setLocation(470, 670);
		reserveBtn.setBorderPainted(false);
		reserveBtn.setContentAreaFilled(false);
		reserveBtn.setFocusPainted(false);
		add(backBtn);
		add(reserveBtn);
		
		backBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JejuBase.getInstance(m_parent);
				pmBtnSingle.setText("0");
				pmBtnTwo.setText("0");
				pmBtnQ.setText("0");
				pmBtnK.setText("0");
				pmBtntextPerson.setText("1");
				Bedbaguni.resetcount();
			}
		});
		reserveBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				m_parent.SetType();
				if(m_parent.hotelRoom != null)
				{
					m_parent.hotelRoom.setText("Room : " + m_parent.roomType() +"\r\n"
			 				   + "인원수 : " + Bedbaguni.person);
				}
				else
					m_parent.HotelRoom();
				JejuBase.getInstance(m_parent);
			}
		});
	}

//	private void BedTwo() {
//		// 메뉴
//		ImageIcon menu1 = new ImageIcon("./src/resource/bedImage/two.jpg");
//		JLabel lblmenu1 = new JLabel(menu1);
//		lblmenu1.setSize(120, 120);// 이미지 사이즈
//		lblmenu1.setLocation(40, 225);// 이미지 위치
//		add(lblmenu1);
//
//		// 라벨추가
//		JLabel single = new JLabel("Two Size");
//		single.setBounds(40, 200, 100, 30);
//		single.setFont(new Font("굴림", Font.BOLD, 15));
//		single.setBackground(new Color(255, 255, 255));
//		add(single);
//
//		JLabel SingleBed = new JLabel(" Two");
//		SingleBed.setBounds(510, 220, 100, 30);
//		SingleBed.setFont(new Font("굴림", Font.BOLD, 12));
//		SingleBed.setBackground(new Color(255, 255, 255));
//		add(SingleBed);
//
//		// 메뉴 관련 텍스트
//		BedCollect.two();
//		TextArea story1 = new TextArea(BedCollect.Bedinformation + "", 4, TextArea.SCROLLBARS_BOTH);
//		story1.setEditable(false);
//		story1.setSize(330, 120);
//		story1.setLocation((int) lblmenu1.getLocation().getX() + 120, (int) lblmenu1.getLocation().getY());
//		story1.setBackground(new Color(255, 255, 255));
//		story1.setFont(new Font("monospaced", Font.BOLD, 13));
//		story1.setFocusable(false);
//		add(story1);
//
//		// 몇개를 담을것인지
//		BedPlusMinusBtn BPMB = new BedPlusMinusBtn();
//		Font f = new Font("monospaced", Font.BOLD, 20);
//		TextArea j = BPMB.getCountArea();
//		j.setSize(20, 30);
//		j.setLocation(530, 266);
//
//		JButton plusCount = BPMB.plusbtn(2, j);
//		plusCount.setSize(20, 20);
//		plusCount.setLocation(511, 260);
//
//		JButton minusCount = BPMB.minusbutton(2, j);
//		minusCount.setSize(20, 20);
//		minusCount.setLocation(511, 285);
//
//		add(j);
//		add(plusCount);
//		add(minusCount);
//
//	}
//
//	private void BedQueen() {
//		// 메뉴
//		ImageIcon menu1 = new ImageIcon("./src/resource/bedImage/queen.jpg");
//		JLabel lblmenu1 = new JLabel(menu1);
//		lblmenu1.setSize(120, 120);// 이미지 사이즈
//		lblmenu1.setLocation(40, 375);// 이미지 위치
//		add(lblmenu1);
//
//		// 라벨추가
//		JLabel single = new JLabel("Queen Size");
//		single.setBounds(40, 355, 100, 30);
//		single.setFont(new Font("굴림", Font.BOLD, 15));
//		single.setBackground(new Color(255, 255, 255));
//		add(single);
//
//		JLabel SingleBed = new JLabel("Queen");
//		SingleBed.setBounds(510, 375, 100, 30);
//		SingleBed.setFont(new Font("굴림", Font.BOLD, 12));
//		SingleBed.setBackground(new Color(255, 255, 255));
//		add(SingleBed);
//
//		// 메뉴 관련 텍스트
//		BedCollect.Queen();
//		TextArea story1 = new TextArea(BedCollect.Bedinformation + "", 4, TextArea.SCROLLBARS_BOTH);
//		story1.setEditable(false);
//		story1.setSize(330, 120);
//		story1.setLocation((int) lblmenu1.getLocation().getX() + 120, (int) lblmenu1.getLocation().getY());
//		story1.setBackground(new Color(255, 255, 255));
//		story1.setFont(new Font("monospaced", Font.BOLD, 13));
//		story1.setFocusable(false);
//		add(story1);
//
//		// 몇개를 담을것인지
//		BedPlusMinusBtn BPMB = new BedPlusMinusBtn();
//		Font f = new Font("monospaced", Font.BOLD, 20);
//		TextArea j = BPMB.getCountArea();
//		j.setSize(20, 30);
//		j.setLocation(530, 421);
//
//		JButton plusCount = BPMB.plusbtn(3, j);
//		plusCount.setSize(20, 20);
//		plusCount.setLocation(511, 415);
//
//		JButton minusCount = BPMB.minusbutton(3, j);
//		minusCount.setSize(20, 20);
//		minusCount.setLocation(511, 440);
//
//		add(j);
//		add(plusCount);
//		add(minusCount);
//
//	}
//
//	private void BedKing() {
//		// 메뉴
//		ImageIcon menu1 = new ImageIcon("./src/resource/bedImage/king.jpg");
//		JLabel lblmenu1 = new JLabel(menu1);
//		lblmenu1.setSize(120, 120);// 이미지 사이즈
//		lblmenu1.setLocation(40, 525);// 이미지 위치
//		add(lblmenu1);
//		// 라벨추가
//		JLabel single = new JLabel("King Size");
//		single.setBounds(40, 505, 100, 30);
//		single.setFont(new Font("굴림", Font.BOLD, 15));
//		single.setBackground(new Color(255, 255, 255));
//		add(single);
//
//		JLabel SingleBed = new JLabel(" King");
//		SingleBed.setBounds(510, 525, 100, 30);
//		SingleBed.setFont(new Font("굴림", Font.BOLD, 12));
//		SingleBed.setBackground(new Color(255, 255, 255));
//		add(SingleBed);
//
//		// 메뉴 관련 텍스트
//		BedCollect.king();
//		TextArea story1 = new TextArea(BedCollect.Bedinformation + "", 4, TextArea.SCROLLBARS_BOTH);
//		story1.setEditable(false);
//		story1.setSize(330, 120);
//		story1.setLocation((int) lblmenu1.getLocation().getX() + 120, (int) lblmenu1.getLocation().getY());
//		story1.setBackground(new Color(255, 255, 255));
//		story1.setFont(new Font("monospaced", Font.BOLD, 13));
//		story1.setFocusable(false);
//		add(story1);
//
//		// 몇개를 담을것인지
//		BedPlusMinusBtn BPMB = new BedPlusMinusBtn();
//		Font f = new Font("monospaced", Font.BOLD, 20);
//		TextArea j = BPMB.getCountArea();
//		j.setSize(20, 30);
//		j.setLocation(530, 576);
//
//		JButton plusCount = BPMB.plusbtn(4, j);
//		plusCount.setSize(20, 20);
//		plusCount.setLocation(511, 570);
//
//		JButton minusCount = BPMB.minusbutton(4, j);
//		minusCount.setSize(20, 20);
//		minusCount.setLocation(511, 595);
//
//		add(j);
//		add(plusCount);
//		add(minusCount);
//
//	}
	
	public void setParent(JejuReservation _parent)
	{
		m_parent = _parent;
	}
	
	// =========BASIC VARIABLE========= 추후 매크로로 옮길예정
	private JButton backBtn = null;
	private JButton reserveBtn = null;
	private int miniSizeX = 150;
	private int miniSizeY = 70;
	private int minicoordY = 650;
	private int minicoordX = 30;
	private int miniDistanceX = 370;

	// bed count's textarea
	public TextArea pmBtnSingle;
	public TextArea pmBtnTwo;
	public TextArea pmBtnQ;
	public TextArea pmBtnK;
	public TextArea pmBtntextPerson;
	// control person's num variable
	private JejuReservation m_parent;
	// ===================== Calendar Part =====================

}
