package reservation;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import intro.JejuBase;

public class JejuDateFrame extends JFrame{
	
	private JFrame fr;
	private JDateChooser dateChooser_checkIn;
	private JDateChooser dateChooser_checkOut;
	private JLabel label_checkIn;
	private JLabel label_checkOut;
	private JButton btn_dateCheck;
	private JButton btn_next;
	private JTextField textField_totalDate;
	private JLabel label_totalDate;
	
	//JDateChooser의 String and int 포맷용
	private String date1;
	private String date2;
	private SimpleDateFormat dfIn;
	private SimpleDateFormat dfOut;
	
public JejuDateFrame() {
		
	}
	
	public JejuDateFrame(GetSet_CheckDate g) {
		
	}
	
	public void Initialize(GetSet_CheckDate g, JejuReservation _reserve)
	{
		JFrame();
		JLabel();
		Calendar();
		TextField();
		Button(g);
		reserve = _reserve;
	}
	
	public void JFrame() {
		fr = new JFrame("Check In & out Date Check");
		fr.setSize(480, 170);
		fr.setLocation(700, 200);
		fr.setVisible(true);
		fr.getContentPane().setLayout(null);
	}
	public void JLabel() {
		label_checkIn = new JLabel("Check In");
		label_checkIn.setBounds(12, 10, 57, 15);
		fr.getContentPane().add(label_checkIn);
		
		label_checkOut = new JLabel("Check Out");
		label_checkOut.setBounds(183, 10, 87, 15);
		fr.getContentPane().add(label_checkOut);

		label_totalDate = new JLabel("Total Date");
		label_totalDate.setBounds(12, 73, 57, 15);
		fr.getContentPane().add(label_totalDate);
		
	}
	public void Calendar() {
		dateChooser_checkIn = new JDateChooser();
		dateChooser_checkIn.setBounds(12, 28, 133, 21);
		fr.getContentPane().add(dateChooser_checkIn);
		
		dateChooser_checkOut = new JDateChooser();
		dateChooser_checkOut.setBounds(183, 28, 133, 21);
		fr.getContentPane().add(dateChooser_checkOut);
	
	}
	public void Button(GetSet_CheckDate g) {
		btn_dateCheck = new JButton("Date Check");
		btn_dateCheck.setBounds(345, 28, 107, 23);
		btn_dateCheck.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				date1 = ((JTextField)dateChooser_checkIn.getDateEditor().getUiComponent()).getText();
				date2 = ((JTextField)dateChooser_checkOut.getDateEditor().getUiComponent()).getText();
				dfIn = new SimpleDateFormat("yyyyMMdd");
				dfOut = new SimpleDateFormat("yyyyMMdd");
				int checkIn = Integer.valueOf(dfIn.format(dateChooser_checkIn.getDate()));
				int checkOut = Integer.valueOf(dfOut.format(dateChooser_checkOut.getDate()));
				if(checkIn > checkOut || checkIn == checkOut) {
		               JOptionPane.showMessageDialog(null, "Check Out날짜가 Check In 보다 같거나 빠릅니다. 다시 입력하세요");
		            
				} else { 
					g.setCheckInDate(date1);
					g.setCheckOutDate(date2);
					days = checkOut - checkIn;
					textField_totalDate.setText("Check In : "+date1+" ~  Check out : "+date2);
				}
			}
		});
		fr.getContentPane().add(btn_dateCheck);
		
		
		btn_next = new JButton("Next");
		btn_next.setBounds(345, 89, 107, 23);
		btn_next.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	
				if(textField_totalDate.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Total Date를 입력해주세요");
				}  else {
					fr.setVisible(false);
				    fr.dispose();
				    if(reserve.hotelDate != null)
				    {
				    	reserve.hotelDate.setText("Date \n" + GetTotalDate());
				    }
				    else
				    	reserve.HotelDate();
				    JejuBase.getInstance(reserve);
				}
			}
		});
		fr.getContentPane().add(btn_next);
		
		
		fr.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				dispose();
			}
			
		});
		
		
	}
	public void TextField() {
		textField_totalDate = new JTextField();
		textField_totalDate.setBounds(12, 90, 304, 21);
		fr.getContentPane().add(textField_totalDate);
		textField_totalDate.setColumns(10);
		textField_totalDate.setEnabled(false); //택스트에 함부로 글자입력 못쓰도록 함
	}
	
	public String getCheckIn() 	 { return date1; }
	public String getCheckOut()  { return date2; }
	public int    getTotalDateInt() { return days;	 }
	public String GetTotalDate() 
	{ 
		if(textField_totalDate == null)
		{
			return "";
		}
		return textField_totalDate.getText(); 
	}
	
	private JejuReservation reserve;
	private int days;
}
