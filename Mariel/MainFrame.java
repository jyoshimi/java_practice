import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {

    /**
     * Construct the main frame
     */
	public MainFrame() {
		
	    super("Mariel's sample java program");
		setLayout(new BorderLayout());
		
		// Text area
		JTextArea textArea = new JTextArea();
        this.getContentPane().add(textArea, BorderLayout.CENTER);
		
		// Button
		JButton button = new JButton("Produce Text");
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(button);
		this.getContentPane().add(buttonPanel, BorderLayout.EAST);
		button.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("Hello\n");
			}
		});
	}

}
