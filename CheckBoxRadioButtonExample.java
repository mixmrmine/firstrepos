import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxRadioButtonExample extends JFrame implements ActionListener {
    // Declare checkboxes and radio buttons
    private JCheckBox checkbox1, checkbox2, checkbox3;
    private JRadioButton radio1, radio2, radio3;
    private ButtonGroup radioGroup;

    public CheckBoxRadioButtonExample() {
        // Set up the window
        setTitle("Checkbox and RadioButton Example");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the panel for the checkboxes
        JPanel checkboxPanel = new JPanel();
        checkboxPanel.setLayout(new GridLayout(3, 1));

        // Create the checkboxes and add them to the panel
        checkbox1 = new JCheckBox("Checkbox 1");
        checkbox1.addActionListener(this);
        checkboxPanel.add(checkbox1);

        checkbox2 = new JCheckBox("Checkbox 2");
        checkbox2.addActionListener(this);
        checkboxPanel.add(checkbox2);

        checkbox3 = new JCheckBox("Checkbox 3");
        checkbox3.addActionListener(this);
        checkboxPanel.add(checkbox3);

        // Create the panel for the radio buttons
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(3, 1));

        // Create the radio buttons and add them to the panel
        radio1 = new JRadioButton("Radio 1");
        radio1.addActionListener(this);
        radioPanel.add(radio1);

        radio2 = new JRadioButton("Radio 2");
        radio2.addActionListener(this);
        radioPanel.add(radio2);

        radio3 = new JRadioButton("Radio 3");
        radio3.addActionListener(this);
        radioPanel.add(radio3);

        // Add the radio buttons to a button group so that only one can be selected at a time
        radioGroup = new ButtonGroup();
        radioGroup.add(radio1);
        radioGroup.add(radio2);
        radioGroup.add(radio3);

        // Create the main panel and add the checkbox and radio button panels to it
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(1, 2));
        mainPanel.add(checkboxPanel);
        mainPanel.add(radioPanel);

        // Add the main panel to the window
        add(mainPanel);

        // Show the window
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Handle checkbox events
        if (e.getSource() == checkbox1) {
            System.out.println("Checkbox 1 is " + (checkbox1.isSelected() ? "checked" : "unchecked"));
        }
        if (e.getSource() == checkbox2) {
            System.out.println("Checkbox 2 is " + (checkbox2.isSelected() ? "checked" : "unchecked"));
        }
        if (e.getSource() == checkbox3) {
            System.out.println("Checkbox 3 is " + (checkbox3.isSelected() ? "checked" : "unchecked"));
        }

        // Handle radio button events
        if (e.getSource() == radio1) {
            System.out.println("Radio 1 is selected");
        }
        if (e.getSource() == radio2) {
            System.out.println("Radio 2 is selected");
        }
        if (e.getSource() == radio3) {
            System.out.println("Radio 3 is selected");
        }
    }

    public static void main(String[] args) {
        new CheckBoxRadioButtonExample();
    }
}
