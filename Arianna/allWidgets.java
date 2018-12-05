import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class allWidgets {
    public void widgets() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu, submenu;
        JRadioButtonMenuItem jrb = new JRadioButtonMenuItem("A radio Button");
        menu = new JMenu("Menu A");
        submenu = new JMenu("Menu B");
        JMenuItem menuItem = new JMenuItem("Other option");
        JMenuItem subA = new JMenuItem("subA");
        JMenuItem subB = new JMenuItem("subB");
        menuBar.add(menu);
        menu.add(submenu);
        submenu.add(subA);
        submenu.add(subB);
        menu.add(jrb);
        menu.add(menuItem);

        DefaultListModel data = new DefaultListModel();
        data.addElement("flower");
        data.addElement("pencil");
        data.addElement("queue");
        data.addElement("hat");
        data.addElement("words");
        data.addElement("extra");
        data.addElement("lily");
        data.addElement("daisy");
        data.addElement("daffodil");
        data.addElement("happy");
        data.addElement("soft");
        JList list = new JList(data);
        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        list.setVisibleRowCount(-1);
        JScrollPane listScroller = new JScrollPane(list);
        listScroller.setPreferredSize(new Dimension(250, 80));
        list.setBorder(BorderFactory.createTitledBorder("words"));

        JPanel panel = new JPanel();
        JLabel optionLabel = new JLabel("Select an Option:");
        JLabel label2 = new JLabel("Select Job Status:");

        JCheckBox student = new JCheckBox("student");
        JCheckBox unemployed = new JCheckBox("unemployed");
        JCheckBox working = new JCheckBox("working");

        JTextField text = new JTextField("Please Enter Name:");
        JRadioButton optionA = new JRadioButton("Option A");
        JRadioButton optionB = new JRadioButton("Option B");
        JRadioButton optionC = new JRadioButton("Option C");

        // Select Button
        JButton select = new JButton("Select");
        select.setBounds(10, 20, 10, 20);
        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = JOptionPane.showInputDialog("Testing...");
                optionLabel.setText(result);
            }
        });

        // Combo box
        String[] dropdown = { "Please Select a color", "red", "yellow", "blue",
                "green", "orange", };
        JComboBox drop = new JComboBox(dropdown);
        panel.setBorder(BorderFactory.createEtchedBorder());

        panel.add(menuBar);
        panel.add(text);
        panel.add(drop);
        panel.add(label2);
        panel.add(student);
        panel.add(unemployed);
        panel.add(working);
        panel.add(optionLabel);
        panel.add(optionA);
        panel.add(optionB);
        panel.add(optionC);
        panel.add(list);
        panel.add(select);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        allWidgets w = new allWidgets();
        w.widgets();
    }
}
