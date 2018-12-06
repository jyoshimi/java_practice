import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SwingPractice {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
			JFrame frame = new MainFrame();
			frame.setSize(500, 500);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			}
		});
		
	}

}
