package reservation;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

import character.JejuTypeSelection;
import intro.JejuBase;
import intro.JejuBegin;

public class PaymentFrame extends JFrame{
	
	private JFrame fr;
	private JLabel lbl_Info;
	private Button btn_next;

	public PaymentFrame() {
		JFrame();
		JLabel(); 
		Button();
	}
	
	public void JFrame() {
		fr = new JFrame("Reservation Complete");
		fr.setSize(220, 175);
		fr.setLocation(700, 200);
		fr.setVisible(true);
		fr.getContentPane().setLayout(null);
		
	}
	//Text로 최종 예약 확인 띄우기
	public void JLabel() {
		lbl_Info = new JLabel("");
		lbl_Info.setBounds(12, 10, 179, 76);
		fr.getContentPane().add(lbl_Info);
	}

	public void Button() {
		
		btn_next = new Button("Let's go traveling");
		btn_next.setBounds(35, 92, 130, 33);
		btn_next.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(false);
				fr.dispose();
				JejuBase.getInstance(new JejuTypeSelection());
			}
		});
		
		fr.getContentPane().add(btn_next);
		fr.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {

				setVisible(false);
				dispose();
			}
		});
	}
	
}
