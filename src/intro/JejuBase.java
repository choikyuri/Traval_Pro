package intro;

import Basic.Macro;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class JejuBase extends JFrame{
	
	private static JejuBase instance;
	
	private JejuBase(JPanel e) {
		
		
		setTitle("제주 어때?");
		setLayout(null);
		setBounds(Macro.g_X,
				  Macro.g_Y,
				  Macro.g_Width, Macro.g_Height);
		
		add(e);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // TODO 창 크기 고정
	}
	
	public static JejuBase getInstance(JPanel e) {
		if(instance == null)
		{
			instance = new JejuBase(e);
		}
		instance.getContentPane().removeAll();
		instance.getContentPane().add(e);
		
		instance.revalidate();
		instance.repaint();
		
		return instance;
	}
	

}
