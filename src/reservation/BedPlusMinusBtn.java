package reservation;

import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class BedPlusMinusBtn {
	// 인원 플러스 마이너스 버튼
	public JButton ppbtn(int num, TextArea j1) {
		JButton pplustbtn = new JButton();
		ImageIcon i = new ImageIcon("./src/resource/bedImage/up.png");
		ImageIcon i2 = new ImageIcon("./src/resource/bedImage/up2.png");
		pplustbtn = new JButton(i);
		pplustbtn.setRolloverIcon(i2);
		pplustbtn.setBorderPainted(false);
		pplustbtn.setContentAreaFilled(false);
		pplustbtn.setFocusPainted(false);
		if (num == 1) {

			pplustbtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((Bedbaguni.person + 1) >= 5) {
						JOptionPane.showMessageDialog(null, "최대인원은 4명까지 선택할수 있습니다.");
					} else {
						Bedbaguni.person +=1;
						j1.setText(String.valueOf(Bedbaguni.person));
					}
				}
			});
		}
		return pplustbtn;
	}// 여기까지 플러스

	// 인원 마이너스버튼
	public JButton mpbtn(int num, TextArea j1) {
		JButton mpbtn = new JButton();
		ImageIcon i = new ImageIcon("./src/resource/bedImage/down.png");
		ImageIcon i2 = new ImageIcon("./src/resource/bedImage/down2.png");
		mpbtn = new JButton(i);
		mpbtn.setRolloverIcon(i2);
		mpbtn.setBorderPainted(false);
		mpbtn.setContentAreaFilled(false);
		mpbtn.setFocusPainted(false);
		if (num == 1) {
			mpbtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((Bedbaguni.person - 1) <= 0) {
						JOptionPane.showMessageDialog(null, "최소 1명이상 선택해 주세요.");
					}else if((Bedbaguni.person -1)<Bedbaguni.count1 +
					Bedbaguni.count2+Bedbaguni.count3+Bedbaguni.count4) {
						JOptionPane.showMessageDialog(null, "인원수보다 수량이 많습니다. 수량을 먼저 줄여주세요.");
					} 
					else {
						Bedbaguni.person -= 1;
						j1.setText(String.valueOf(Bedbaguni.person));
					}

				}
			});
		}
		return mpbtn;
	}

	// 침대 플러스 마이스너스 버튼
	public JButton plusbtn(int num, TextArea j) {
		JButton plusbtn = new JButton();
		ImageIcon i = new ImageIcon("./src/resource/bedImage/up.png"); // 추가예정
		ImageIcon i2 = new ImageIcon("./src/resource/bedImage/up2.png"); // 추가예정
		plusbtn = new JButton(i);
		plusbtn.setRolloverIcon(i2); // 바뀌는거
		plusbtn.setBorderPainted(false);
		plusbtn.setContentAreaFilled(false);
		plusbtn.setFocusPainted(false);
		if (num == 1) {
			plusbtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((Bedbaguni.count1 + 1) > Bedbaguni.person||(Bedbaguni.person)<=Bedbaguni.count1 +
							Bedbaguni.count2+Bedbaguni.count3+Bedbaguni.count4) {
						JOptionPane.showMessageDialog(null, "최대인원수 만큼만 담을수 있습니다.");
					} else {
						Bedbaguni.count1 += 1;
						j.setText(String.valueOf(Bedbaguni.count1));
					}
				}

			});
		} else if (num == 2) {
			plusbtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((Bedbaguni.count2 + 1) > Bedbaguni.person ||(Bedbaguni.person)<=Bedbaguni.count1 +
							Bedbaguni.count2+Bedbaguni.count3+Bedbaguni.count4) {
						JOptionPane.showMessageDialog(null, "최대인원수 만큼만 담을수 있습니다.");
					} else {
						Bedbaguni.count2 += 1;
						j.setText(String.valueOf(Bedbaguni.count2));
					}
				}
			});
		} else if (num == 3) {
			plusbtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((Bedbaguni.count3 + 1) > Bedbaguni.person ||(Bedbaguni.person)<=Bedbaguni.count1 +
							Bedbaguni.count2+Bedbaguni.count3+Bedbaguni.count4) {
						JOptionPane.showMessageDialog(null, "최대인원수 만큼만 담을수 있습니다.");
					} else {
						Bedbaguni.count3 += 1;
						j.setText(String.valueOf(Bedbaguni.count3));
					}

				}
			});
		} else if (num == 4) {
			plusbtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((Bedbaguni.count4 + 1) > Bedbaguni.person ||(Bedbaguni.person)<=Bedbaguni.count1 +
							Bedbaguni.count2+Bedbaguni.count3+Bedbaguni.count4) {
						JOptionPane.showMessageDialog(null, "최대인원수 만큼만 담을수 있습니다.");
					} else {
						Bedbaguni.count4 += 1;
						j.setText(String.valueOf(Bedbaguni.count4));
					}
				}
			});
		}

		return plusbtn;

	}// 여기까지 plus

	public JButton minusbutton(int num, TextArea j) {
		JButton minusbtn = new JButton();
		ImageIcon i = new ImageIcon("./src/resource/bedImage/down.png");
		ImageIcon i2 = new ImageIcon("./src/resource/bedImage/down2.png");
		minusbtn = new JButton(i);
		minusbtn.setRolloverIcon(i2);
		
		minusbtn.setBorderPainted(false);
		minusbtn.setContentAreaFilled(false);
		minusbtn.setFocusPainted(false);
		if (num == 1) {
			minusbtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((Bedbaguni.count1 - 1) < 0) {
						JOptionPane.showMessageDialog(null, "최소 1개이상의 침대를 선택하십시오.");
					} else {
						Bedbaguni.count1 -=1;
						j.setText(String.valueOf(Bedbaguni.count1));
					}
				}
			});
		} else if (num == 2) {
			minusbtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((Bedbaguni.count2 - 1) < 0) {
						JOptionPane.showMessageDialog(null, "최소 1개이상의 침대를 선택하십시오.");
					} else {
						Bedbaguni.count2 -= 1;
						j.setText(String.valueOf(Bedbaguni.count2));
					}
				}
			});
		} else if (num == 3) {
			minusbtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((Bedbaguni.count3 - 1) < 0) {
						JOptionPane.showMessageDialog(null, "최소 1개이상의 침대를 선택하십시오.");
					} else {
						Bedbaguni.count3 -= 1;
						j.setText(String.valueOf(Bedbaguni.count3));
					}
				}
			});
		} else if (num == 4) {
			minusbtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((Bedbaguni.count4 - 1) < 0) {
						JOptionPane.showMessageDialog(null, "최소 1개이상의 침대를 선택하십시오.");
					} else {
						Bedbaguni.count4 -= 1;
						j.setText(String.valueOf(Bedbaguni.count4));
					}
				}
			});
		}

		return minusbtn;
	}

	public TextArea getCountArea() {
		Font f = new Font("monospaced", Font.BOLD, 22);
		TextArea j = new TextArea("", 0, 0, TextArea.SCROLLBARS_NONE);
		j.setEditable(false);
		j.setText("0");
		j.setFont(f);
		return j;
	}
	public TextArea getCountArea1() {
		Font f = new Font("monospaced", Font.BOLD, 22);
		TextArea j1 = new TextArea("", 0, 0, TextArea.SCROLLBARS_NONE);
		j1.setEditable(false);
		j1.setText("1");
		j1.setFont(f);
		return j1;
	}

}
