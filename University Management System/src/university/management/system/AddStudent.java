package university.management.system;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class AddStudent extends JFrame {

    JLabel nameLabel, fnameLabel, enumlabel, enorllednum, address;
    JTextField nameTextField, fnameTextField;

    Random rand = new Random();
    long first4 = Math.abs((rand.nextLong() % 9000L) + 1000L);

    AddStudent() {
        setSize(800, 700);
        setLocation(235, 0);
        getContentPane().setBackground(Color.WHITE);

        setLayout(null);

        //heading --------------------------------------------------------------
        JLabel heading = new JLabel("NEW STUDENT DETAILS ");
        heading.setBounds(275, 25, 300, 18);
        heading.setFont(new Font("Raleway", Font.BOLD, 20));
        add(heading);

        //horizontal line-------------------------------------------------------
        JSeparator horizontalLine = new JSeparator(SwingConstants.HORIZONTAL);
        horizontalLine.setBounds(150, 60, 500, 2);
        horizontalLine.setBackground(Color.BLACK);
        add(horizontalLine);

        //Name label -----------------------------------------------------------
        nameLabel = new JLabel("Name ");
        nameLabel.setBounds(50, 100, 100, 20);
        nameLabel.setFont(new Font(" SansSerif", Font.BOLD, 14));
        add(nameLabel);

        //Name label -----------------------------------------------------------
        nameTextField = new JTextField(" ");
        nameTextField.setBounds(180, 101, 150, 22);
        nameTextField.setFont(new Font("SansSerif", Font.PLAIN, 14));
        add(nameTextField);

        //======================================================================
        //Rollno label ---------------------------------------------------------
        enumlabel = new JLabel("Enrollment No. ");
        enumlabel.setBounds(440, 100, 150, 20);
        enumlabel.setFont(new Font("SansSerif", Font.BOLD, 14));
        add(enumlabel);
        //Name label -----------------------------------------------------------
        enorllednum = new JLabel("CLG2024 " + first4);
        enorllednum.setBounds(570, 99, 150, 22);
        enorllednum.setFont(new Font("SansSerif", Font.PLAIN, 14));
        add(enorllednum);

        //======================================================================
        //Father's Name label --------------------------------------------------
        fnameLabel = new JLabel("Father's Name ");
        fnameLabel.setBounds(50, 135, 150, 20);
        fnameLabel.setFont(new Font("SansSerif", Font.BOLD, 14));
        add(fnameLabel);

        //Father Name label -----------------------------------------------------------
        fnameTextField = new JTextField(" ");
        fnameTextField.setBounds(180, 135, 150, 22);
        fnameTextField.setFont(new Font("SansSerif", Font.PLAIN, 14));
        add(fnameTextField);

        ////////////////////////////////////////////////////////////////////////
        //////////////////////////ADD calender//////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        //======================================================================
        //Address---------------------------------------------------------
        address = new JLabel("Address ");
        address.setBounds(440, 100, 150, 20);
        address.setFont(new Font("SansSerif", Font.BOLD, 14));
        add(address);
        
    

    }

    public static void main(String[] args) {
        new AddStudent();
    }

}
