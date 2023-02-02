package reservation;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

import Basic.Hotels;
import Basic.Macro;
import intro.JejuBase;

public class Payment extends JPanel { 
   JLabel img;
   JButton btn_back = null;
   JButton btn_payment = null;
   TextArea text_info;
   JejuReservation m_reserve;
   public Payment() {
      
   }
   
   public void HotelBackground() {
      //포스터 이미지
      ImageIcon JejuMainIcon=new ImageIcon("./src/character/background/BG_jejuReservation03.png"); //그림불러오기
      JLabel JejuMainLabel=new JLabel(JejuMainIcon); //그림 붙이기
      JejuMainLabel.setBounds(Macro.g_X,Macro.g_Y,615, 790);
      JejuMainLabel.setLocation(-15, 0);
      add(JejuMainLabel);
   }   
   
   public void setReserve(JejuReservation _reserve)
   {
      m_reserve = _reserve;
      hotelImg  = _reserve.getHotelImg();
   }
   
   public void Info() {
      text_info = new TextArea(
            "\t\t  ◎ Check In : " + m_reserve.m_date.getCheckIn() + "\n\n" + 
            "\t\t  ◎ Check Out : " + m_reserve.m_date.getCheckOut()+ "\n\n" +
            "\t\t  ◎ Hotel Name : " + m_reserve.getHotelName() +"\n\n" + 
            "\t\t  ◎ How Many People : " +Bedbaguni.person+"\n\n" +
            "\t\t  ◎ Room Type : " + m_reserve.roomType() + "\n\n" +
            "\t\t  ◎Total price: "+ total_price() +"원"          
            , 0, 0,TextArea.SCROLLBARS_NONE);
      text_info.setFont(new Font("Adobe 고딕 Std B", Font.BOLD | Font.ITALIC, 20));
      text_info.setBackground(Color.white);
      text_info.setBounds(30, 310, 520, 270);
      add(text_info);

   }
   
   private void booking()
   {
      Hotels hotel = Hotels.getInstance();
      //void Basic.Hotels.finalConfirm(String _name, String _address, String _number, String _date, String _roomType, int _personCnt)
      hotel.finalConfirm(m_reserve.getHotelName(), m_reserve.getHotelAddress(), m_reserve.getHotelNum(), 
                     m_reserve.m_date.GetTotalDate(), m_reserve.roomType(), Bedbaguni.person, total_price(),
                     true);
   }
   
   public void ImgLabel() {
      img = new JLabel(hotelImg);
      img.setBounds(30, 70, 520, 200);
      add(img);
   }
   
   private void bottomPanel() { 
      JPanel bottomPanel = new JPanel();
      bottomPanel.setBorder(new TitledBorder(null, "결제 방법 선택", TitledBorder.LEADING, TitledBorder.TOP, null, null));
      bottomPanel.setSize(520, 70);
      bottomPanel.setLocation(30, 600);
      bottomPanel.setBackground(Color.white);
      payment1 = new JRadioButton("신용카드");
      payment2 = new JRadioButton("계좌이체");
      payment3 = new JRadioButton("현장결제");
      // suppress borders
      payment1.setBorderPainted(false);
      payment2.setBorderPainted(false);
      payment3.setBorderPainted(false);
      // suppress button press decoration
      payment1.setContentAreaFilled(false);
      payment2.setContentAreaFilled(false);
      payment3.setContentAreaFilled(false);
      ButtonGroup buttonGroup = new ButtonGroup();
      buttonGroup.add(payment1);
      buttonGroup.add(payment2);
      buttonGroup.add(payment3);
      bottomPanel.add(payment1);
      bottomPanel.add(payment2);
      bottomPanel.add(payment3);
      add(bottomPanel);
   }
   public void  Btn() {
      
      
      ImageIcon i = new ImageIcon("./src/btnImage/back_icon.png");
      ImageIcon i2 = new ImageIcon("./src/btnImage/back_icon2.png");
      btn_back= new JButton(i);
      btn_back.setRolloverIcon(i2);
      btn_back.setSize(64, 64);
      btn_back.setLocation(60, 670);
      btn_back.setBorderPainted(false);
      btn_back.setContentAreaFilled(false);
      btn_back.setFocusPainted(false);
      add(btn_back);
      btn_back.addActionListener(new ActionListener() {   
         @Override
         public void actionPerformed(ActionEvent e) {
            JejuBase.getInstance(m_reserve);
         }
      });
      
      ImageIcon i3 = new ImageIcon("./src/btnImage/buyBtn.png");
      ImageIcon i4 = new ImageIcon("./src/btnImage/buyBtn2.png");
      btn_payment = new JButton(i3);
      btn_payment.setRolloverIcon(i4);
      btn_payment.setSize(64, 64);
      btn_payment.setLocation(470, 670);
      btn_payment.setBorderPainted(false);
      btn_payment.setContentAreaFilled(false);
      btn_payment.setFocusPainted(false);
      add(btn_payment);
      btn_payment.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            if (payment1.isSelected() || payment2.isSelected() || payment3.isSelected()) {
               booking();
               Bedbaguni.resetcount();
               new PaymentFrame();
            }
            else {
               JOptionPane.showMessageDialog(null, "결제 방법을 선택해주세요.");
            }
         }
      });
      
      
      setVisible(true);
   }
   
   private int total_price()
   {
      int roomTotal = (BedCollect.single().get(0).price*Bedbaguni.count1+
            BedCollect.two().get(0).price*Bedbaguni.count2+
            BedCollect.Queen().get(0).price*Bedbaguni.count3+
            BedCollect.king().get(0).price*Bedbaguni.count4);
      int total = roomTotal * m_reserve.m_date.getTotalDateInt();
      return total;
   }

   
   public void Setting() {
      setSize(Macro.g_Width, Macro.g_Height);
      setLayout(null);
      ImgLabel();
      Info();
      Btn();
      bottomPanel();
      HotelBackground();
   }

   private ImageIcon hotelImg;
   private JRadioButton payment1;
   private JRadioButton payment2;
   private JRadioButton payment3;
}