import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
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
		
		// Button Panel
        JButton produceTextButton = new JButton("Produce Text");
        produceTextButton.addActionListener(new ActionListener() {      
            @Override
            public void actionPerformed(ActionEvent arg0) {
                textArea.append("Hello\n");
            }
        });
        JButton anotherButton = new JButton("Another button");
        anotherButton.addActionListener(new ActionListener() {      
            @Override
            public void actionPerformed(ActionEvent arg0) {
                textArea.append("Hello again another\n");
            }
        });
	
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.add(produceTextButton);
        buttonPanel.add(anotherButton);
        this.getContentPane().add(buttonPanel, BorderLayout.EAST);
		
	
	}

}
