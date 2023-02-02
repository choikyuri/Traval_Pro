package character;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Basic.Macro;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;

public class SelectionTest {

	private JFrame frmAsdf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectionTest window = new SelectionTest();
					window.frmAsdf.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SelectionTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAsdf = new JFrame();
		frmAsdf.getContentPane().setBackground(Color.CYAN);
		frmAsdf.setTitle("asdf");
		frmAsdf.setForeground(Color.CYAN);
		frmAsdf.setResizable(false);
		frmAsdf.setBackground(Color.CYAN);
		frmAsdf.setBounds(Macro.g_X, Macro.g_Y, Macro.g_Width, Macro.g_Height);
		frmAsdf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAsdf.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, Macro.g_Width, Macro.g_Height);
		panel.setForeground(Color.ORANGE);
		panel.setBackground(Color.ORANGE);
		frmAsdf.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Activity");
		btnNewButton.setBounds(0, 150, Macro.g_Width, 100);
		panel.add(btnNewButton);
		
		JButton btnHealing = new JButton("Healing");
		btnHealing.setBounds(0, 350, 600, 100);
		panel.add(btnHealing);
		
		JButton btnCafeTour = new JButton("Cafe Tour");
		btnCafeTour.setBounds(0, 550, 600, 100);
		panel.add(btnCafeTour);
	}
}
