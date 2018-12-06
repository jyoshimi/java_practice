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
        JButton push = new JButton("Push");
        push.addActionListener(new ActionListener() {      
            @Override
            public void actionPerformed(ActionEvent arg0) {
                textArea.append("Push");
            }
        });
        JButton my = new JButton("My");
        my.addActionListener(new ActionListener() {      
            @Override
            public void actionPerformed(ActionEvent arg0) {
                textArea.append("My");
            }
        });
        JButton buttons = new JButton("Buttons");
        my.addActionListener(new ActionListener() {      
            @Override
            public void actionPerformed(ActionEvent arg0) {
                textArea.append("Buttons");
            }
        });
        JButton i = new JButton("I");
        push.addActionListener(new ActionListener() {      
            @Override
            public void actionPerformed(ActionEvent arg0) {
                textArea.append("I");
            }
        });
        JButton dare = new JButton("Dare");
        my.addActionListener(new ActionListener() {      
            @Override
            public void actionPerformed(ActionEvent arg0) {
                textArea.append("Dare");
            }
        });
        JButton you = new JButton("You");
        my.addActionListener(new ActionListener() {      
            @Override
            public void actionPerformed(ActionEvent arg0) {
                textArea.append("You");
            }
        });
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.add(push);
        buttonPanel.add(my);
        buttonPanel.add(buttons);
        buttonPanel.add(i);
        buttonPanel.add(dare);
        buttonPanel.add(you);
        this.getContentPane().add(buttonPanel, BorderLayout.EAST);
		
	
	}

}
