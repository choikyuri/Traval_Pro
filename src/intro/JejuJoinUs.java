package intro;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import Basic.Macro;

public class JejuJoinUs extends JPanel{
	
	public JejuJoinUs() {
		setJPanel();
		setTitleLabel();
		setSubPabel();
		setBackButton();
		setNextButton();
		setBackground();
	}
	
	private void setJPanel() {
		setSize(Macro.g_Width, Macro.g_Height);
		setLayout(null);
	}

	
	private void setSubPabel() {
		JLabel idLabel = new JLabel("아이디 : ");
		JLabel passLabel = new JLabel("비밀번호 : ");
		JLabel passReLabel = new JLabel("비밀번호 재확인 : ");
		JLabel conditionLabel = new JLabel("특수문자,숫자,영문 포함 8자 이상");
		JLabel nameLabel = new JLabel("이름 : ");
		JLabel birthLabel = new JLabel("생년월일 : ");
		JLabel genderLabel = new JLabel("성별 : ");
		JLabel phoneLabel = new JLabel("핸드폰번호 : ");
		

		idTf = new JTextField(15);
		passTf = new JPasswordField(15);
		passReTf = new JPasswordField(15);
		nameTf = new JTextField(15);
		birthDC = new JDateChooser();
		phoneTf = new JTextField(11);

		manButton = new JRadioButton("남성");
		womanButton = new JRadioButton("여성");
        manButton.setBorderPainted(false);
        manButton.setContentAreaFilled(false);
        womanButton.setBorderPainted(false);
        womanButton.setContentAreaFilled(false);
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(manButton);
		genderGroup.add(womanButton);
		
		idLabel.setBounds(LableX, Y, 100, 20);
		passLabel.setBounds(LableX, Y+40, 100, 20);
		passReLabel.setBounds(LableX, Y+80, 100, 20);
		nameLabel.setBounds(LableX, Y+120, 100, 20);
		birthLabel.setBounds(LableX, Y+160, 100, 20);
		genderLabel.setBounds(LableX, Y+200, 100, 20);
		phoneLabel.setBounds(LableX, Y+240, 100, 20);
		
		idTf.setBounds(TextFieldX, Y, 100, 20);
		passTf.setBounds(TextFieldX, Y+40, 100, 20);
		passReTf.setBounds(TextFieldX, Y+80, 100, 20);
		nameTf.setBounds(TextFieldX, Y+120, 100, 20);
		birthDC.setBounds(TextFieldX, Y+160, 122, 20);
		manButton.setBounds(TextFieldX, Y+200, 100, 20 );
		womanButton.setBounds(TextFieldX+100, Y+200, 100, 20 );
		phoneTf.setBounds(TextFieldX, Y+240, 100, 20);
		
		conditionLabel.setBounds(TextFieldX+105, Y+40, 150, 20);
		conditionLabel.setFont(new Font("굴림", Font.ITALIC, 9));
		
		add(idLabel);
		add(passLabel);
		add(conditionLabel);
		add(passReLabel);
		add(nameLabel);
		add(birthLabel);
		add(genderLabel);
		add(phoneLabel);
		add(idTf);
		add(passTf);
		add(passReTf);
		add(nameTf);
		add(birthDC);
		add(phoneTf);
		add(manButton);
		add(womanButton);
	}
	
	private void setTitleLabel() {
		JLabel TitleLabel = new JLabel("Join Us!");
		TitleLabel.setBounds(165, 70, 300, 100);
		TitleLabel.setFont(new Font("굴림", Font.ITALIC, 60));
		add(TitleLabel);
	}

	private void setBackground() {
		ImageIcon imageicon=new ImageIcon("./src/character/background/BG_JejuJoinUs.jpg");
		JLabel label=new JLabel(imageicon);
		label.setBounds(Macro.g_X,Macro.g_Y,615, 790);
		label.setLocation(-15, 0);
		add(label);																				   
	}
	
	private void setBackButton() {
		imgDefault = new ImageIcon("./src/btnImage/back_icon.png");
		imgHovering = new ImageIcon("./src/btnImage/back_icon2.png");
		jButton = new JButton(imgDefault);
		jButton.setRolloverIcon(imgHovering);
		jButton.setSize(64, 64);
		jButton.setLocation(60, 670);
		jButton.setBorderPainted(false);
		jButton.setContentAreaFilled(false);
		jButton.setFocusPainted(false);
		
		add(jButton);
		
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JejuBase.getInstance(new JejuBegin());
			}
		});
	}
	
	private void setNextButton() {
		imgDefault = new ImageIcon("./src/btnImage/next_icon.png");
		imgHovering = new ImageIcon("./src/btnImage/next_icon2.png");
		jButton = new JButton(imgDefault);
		jButton.setRolloverIcon(imgHovering);
		jButton.setSize(64, 64);
		jButton.setLocation(470, 670);
		jButton.setBorderPainted(false);
		jButton.setContentAreaFilled(false);
		jButton.setFocusPainted(false);
		jButton.setVisible(true);
		
		add(jButton);
		
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = idTf.getText();
				String pass = new String(passTf.getPassword());
				String passRe = new String(passReTf.getPassword());
				String name = nameTf.getText();
				String birth = ((JTextField) birthDC.getDateEditor().getUiComponent()).getText();
				String phone = phoneTf.getText();
				
				Pattern passPattern = Pattern.compile("^(?=.*[a-zA-Z])(?=.*\\d)(?=.*\\W).{8,20}$"); //영문+특문+숫자 포함 8자 이상
				Matcher passMatcher = passPattern.matcher(pass);
				
				if (id.equals("") || pass.equals("") || passRe.equals("") || name.equals("") || birth.equals("") || phone.equals("")) {	
					JOptionPane.showMessageDialog(null, "모든 정보를 입력해주세요!");
				} else if (!pass.equals(passRe)) {
					JOptionPane.showMessageDialog(null, "비밀번호가 서로 맞지 않습니다", "비밀번호 오류", 1);
				} else if (!passMatcher.find()) {
					JOptionPane.showMessageDialog(null, "비밀번호는 영문+특수문자+숫자로 구성되어야 합니다", "비밀번호 오류", 1);
				} else {
					JOptionPane.showMessageDialog(null, "회원가입 완료!");
					JejuBase.getInstance(new JejuBegin());
				}
			}
		});
	}
	
	private JTextField idTf;
	private JPasswordField passTf;
	private JPasswordField passReTf;
	private JTextField nameTf;
	private JDateChooser birthDC;
	private JTextField phoneTf;
	private JRadioButton manButton;
	private JRadioButton womanButton;
	private JButton jButton = null;
	private ImageIcon imgDefault = null;
	private ImageIcon imgHovering = null;
	private int LableX = 160;
	private int TextFieldX = 310;
	private int Y = 250;
}
