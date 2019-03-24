import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.apache.logging.log4j.*;

public class MyPanel extends JPanel
                        implements ActionListener
{
    private static Logger logger = LogManager.getLogger(MyPanel.class);

    private JLabel lblFirstName;
    private JLabel lblLastName;
    private JLabel lblFullName;
    private JButton btnSubmit;
    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JTextField txtFullName;

    public MyPanel(){
        logger.debug("INSIDE MYPANEL CONSTRUCTOR");
        //default layout for a panel is flowlayout
        //configure the widgets
        lblFirstName = new JLabel("First Name:");
        lblLastName = new JLabel("Last Name:");
        lblFullName = new JLabel( "Full Name:" );
        btnSubmit = new JButton("Submit");
        txtFirstName = new JTextField(40);
        txtLastName = new JTextField(40);
        txtFullName = new JTextField(50);

        btnSubmit.addActionListener(this);
        btnSubmit.setActionCommand("submit");

        add(lblFirstName);
        add(txtFirstName);
        add(lblLastName);
        add(txtLastName);
        add(btnSubmit);
        add(lblFullName);
        add(txtFullName);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        logger.debug("INSIDE  PANEL actionPerformed");
        /*String x = txtFirstName.toString();
        String y = txtLastName.toString();*/

        String x = txtFirstName.getText();
        String y = txtLastName.getText();
        /*String text = textField.getText();
        textArea.append(text + newline);
        textField.selectAll();*/
        txtFullName.setText(x + " " + y);
    }
}


