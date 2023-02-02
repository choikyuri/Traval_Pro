package intro;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Basic.Macro;
import character.JejuTypeSelection;


public class JejuBegin extends JPanel{
	
	public JejuBegin() {
		setLayout(null);
		setSize(Macro.g_Width, Macro.g_Height);

		
		JLabel lblID = new JLabel("ID");
		lblID.setBounds(440, 180, 50, 20);
		lblID.setFont(new Font("굴림", Font.BOLD, 12));
		
		JTextField tfID = new JTextField(null, 10);
		tfID.setBounds(440, 200, 120, 20);

		JLabel lblPass = new JLabel("PassWord");
		lblPass.setBounds(440, 220, 70, 20);
		lblPass.setFont(new Font("굴림", Font.BOLD, 12));
		
		JPasswordField tfPass = new JPasswordField(null, 10);
		tfPass.setBounds(440, 240, 120, 20);
		
		JButton logBtn = new JButton("Log In");
		logBtn.setBounds(490, 270, 70, 20);
		logBtn.setFont(new Font("굴림", Font.BOLD , 10));
		
		logBtn.setContentAreaFilled(false);
		logBtn.setFocusPainted(false);							 
		JButton joinBtn = new JButton("Sign Up!");
		joinBtn.setBackground(new Color(255, 140, 0)); // RGB색상
		joinBtn.setBounds(440, 320, 120, 40);
		joinBtn.setFont(new Font("굴림", Font.CENTER_BASELINE, 13));
		
		joinBtn.setContentAreaFilled(false);
		joinBtn.setFocusPainted(false);							  
//		JButton closeBtn = new JButton("종료하기");
//		closeBtn.setBackground(new Color(255, 140, 0)); // RGB색상
//		closeBtn.setSize(150, 70);
//		closeBtn.setLocation((int)joinBtn.getLocation().getX()+250, 
//				(int)joinBtn.getLocation().getY());
//		closeBtn.setFont(new Font("굴림", Font.BOLD, 20));

		
		add(lblID);
		add(tfID);
		add(lblPass);
		add(tfPass);
		add(logBtn);
		add(joinBtn);
//		add(closeBtn);
		
		ImageIcon hjeju = new ImageIcon("./src/Hello_jeju.jpg"); // 그림 불러오기
		JLabel lblHJeju = new JLabel(hjeju); // 그림 붙이기
		lblHJeju.setSize(Macro.g_Width, Macro.g_Height);
		lblHJeju.setLocation(-15, 0);
		add(lblHJeju);
		
		logBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				String id = "soldesk";
				String pass = "12345";

				if (id.equals(tfID.getText()) && pass.equals(tfPass.getText())) {

					JOptionPane.showMessageDialog(null, "혼저옵서예~!");
					JejuBase.getInstance(new JejuTypeSelection());
				} else {

					JOptionPane.showMessageDialog(null, "다시 좀 해줍써~!");

				}

			}

		});
		
		joinBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JejuBase.getInstance(new JejuJoinUs());
			}
		});
	}

}
