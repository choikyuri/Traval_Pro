package reservation;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Basic.Macro;

public class TestReservation {

	private JFrame Place;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestReservation window = new TestReservation();
					window.Place.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestReservation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Place = new JFrame();
		Place.getContentPane().setBackground(Color.CYAN);
		Place.setTitle("asdf");
		Place.setForeground(Color.CYAN);
		Place.setResizable(false);
		Place.setBackground(Color.CYAN);
		Place.setBounds(Macro.g_X, Macro.g_Y, Macro.g_Width, Macro.g_Height);
		Place.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Place.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, Macro.g_Width, Macro.g_Height);
		panel.setForeground(Color.ORANGE);
		panel.setBackground(Color.ORANGE);
		Place.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Date");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(50, 130, 90, 40);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("HILTEN HOTEL");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		lblNewLabel.setBounds(50, 30, 300, 90);
		panel.add(lblNewLabel);
		
		JButton btnSecond = new JButton("plus");
		btnSecond.setBounds(330, 140, 30, 30);
		panel.add(btnSecond);
		
		JLabel lblBlahBlah = new JLabel("NUM");
		lblBlahBlah.setBounds(180, 130, 90, 40);
		panel.add(lblBlahBlah);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBack.setBounds(30, 650, 150, 70);
		panel.add(btnBack);
		
		JButton btnReserve = new JButton("payment");
		btnReserve.setBounds(400, 650, 150, 70);
		panel.add(btnReserve);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(290, 140, 30, 30);
		panel.add(textArea);
		
		JButton btnSecond_1 = new JButton("minus");
		btnSecond_1.setBounds(250, 140, 30, 30);
		panel.add(btnSecond_1);
	}
}
