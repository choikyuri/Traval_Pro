package character;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Basic.Macro;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestPlace {

	private JFrame Place;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestPlace window = new TestPlace();
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
	public TestPlace() {
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
		
		JButton btnNewButton = new JButton("first");
		btnNewButton.setBounds(30, 150, 250, 180);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("어쩌구 저쩌구");
		lblNewLabel.setBounds(300, 150, 250, 180);
		panel.add(lblNewLabel);
		
		JButton btnSecond = new JButton("second");
		btnSecond.setBounds(30, 380, 250, 180);
		panel.add(btnSecond);
		
		JLabel lblBlahBlah = new JLabel("blah blah");
		lblBlahBlah.setBounds(300, 380, 250, 180);
		panel.add(lblBlahBlah);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBack.setBounds(30, 650, 150, 70);
		panel.add(btnBack);
		
		JButton btnReserve = new JButton("reserve");
		btnReserve.setBounds(400, 650, 150, 70);
		panel.add(btnReserve);
	}
}
