import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
 
public class SwingingAround extends JPanel {
    private boolean DEBUG = false;
 
    public SwingingAround() {
        super(new GridLayout(1,0));
 
        String[] columnNames = {"Display Word"};
 
        Object[][] data = {
        {"dog"},
        {"cat"},
        {"black"},
        {"blue"},
        {"dog"},
        {"cat"},
        {"black"},
        {"blue"},
        {"dog"},
        {"cat"},
        {"black"},
        {"blue"},
        {"dog"},
        {"cat"},
        {"black"},
        {"blue"},
        {"dog"},
        {"cat"},
        {"black"},
        {"blue"},
     };
        
 
        final JTable table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(125, 350));
        table.setFillsViewportHeight(true);
 
        if (DEBUG) {
            table.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    printDebugData(table);
                }
            });
        }
 
        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);
 
        //Add the scroll pane to this panel.
        add(scrollPane);
    }
 
    private void printDebugData(JTable table) {
        int numRows = table.getRowCount();
        int numCols = table.getColumnCount();
        javax.swing.table.TableModel model = table.getModel();
 
        System.out.println("Value of data: ");
        for (int i=0; i < numRows; i++) {
            System.out.print("    row " + i + ":");
            for (int j=0; j < numCols; j++) {
                System.out.print("  " + model.getValueAt(i, j));
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }
 
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("WordTable");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        SwingingAround newWordTable = new SwingingAround();
        newWordTable.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newWordTable);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Create GUI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
////https://docs.oracle.com/javase/tutorial/uiswing/examples/components/SimpleTableDemoProject/src/components/SimpleTableDemo.java
//
////
////import java.awt.BorderLayout;
////
////import javax.swing.BoxLayout;
////import javax.swing.JFrame;
////import javax.swing.JPanel;
////import javax.swing.JScrollPane;
////import javax.swing.JTable;
////import javax.swing.JTextField;
////import javax.swing.JLabel;
////import java.awt.Dimension;
////
////
////public class SwingHelloWorld {
////	public static void main(String[] args) {
////		javax.swing.SwingUtilities.invokeLater(new Runnable() {
////			public void run() {
////				createAndShowGUI();
////				//Create new GUI window
////			}
////		});
////	}
////
////	private static void createAndShowGUI() {
////		// Create and set up the window.
////		JFrame frame = new JFrame("TextWorldSwing");
////		//'X' exit out of the window
////		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////		//'minimize/hide' tab window
////		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
////		frame.setLayout(new BorderLayout());
////		
////		//Size the frame
////		frame.setSize(500, 600);
////		frame.setVisible(true);
////		//centers the window in the enter
////		frame.setLocationRelativeTo(null);
////		//Grid Frame
////
////		frame.setBounds(100, 100, 300, 400);
////		
////		JPanel mainContainer = new JPanel();
////		mainContainer.setLayout(new BoxLayout(mainContainer, BoxLayout.Y_AXIS));
////		
////		frame.setContentPane(mainContainer);
////		
////		// Add stuff
////		JLabel label = new JLabel("Text Box");
////		mainContainer.add(label);
////		JTextField field = new JTextField();
////		
////		frame.getContentPane().add(field);
////		
////		// Display the window.
////		frame.pack();
////		frame.setVisible(true);
////	}
////
////	private static void add(JTextField textFieldUserName, String center) {
////		// TODO Auto-generated method stub
////		
////	}
////
////}