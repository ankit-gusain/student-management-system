package university.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JButton cancel, login;
    JLabel labelusername, password;
    JPasswordField textfeildpassword;
    JTextField textfeildusername;

    Login() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        //labelusername-------------------------------------------------
        labelusername = new JLabel("Username");
        add(labelusername);
        labelusername.setBounds(200, 50, 100, 25);

        //text feild username-------------------------------------------
        textfeildusername = new JTextField();
        textfeildusername.setBounds(300, 50, 150, 25);
        add(textfeildusername);

        //password------------------------------------------------------
        password = new JLabel("Password");
        password.setBounds(200, 90, 100, 25);
        add(password);

        //textfeild password--------------------------------------------
        textfeildpassword = new JPasswordField();
        textfeildpassword.setBounds(300, 90, 150, 25);
        add(textfeildpassword);

        //login Button---------------------------------------------------
        login = new JButton("Login");
        login.setBounds(220, 150, 100, 25);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        add(login);
        login.addActionListener(this);

        //cancel button-------------------------------------------------
        cancel = new JButton("Cancel");
        cancel.setBounds(330, 150, 100, 25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        add(cancel);
        cancel.addActionListener(this);

        //img----------------------------------------------------------
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(225, 125, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 200, 200);
        add(image);

        //------------------------------------------------------------
        setSize(550, 275);
        setLocation(350, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            String username = textfeildusername.getText();
            String password = textfeildpassword.getText();

            //CREATED QUERY
            String query = "select * from login where username='" + username + "' and password='" + password + "'";

            //EXECUTING QUERY
            try {
                //create object of conn class and call functions
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);

                if (rs.next()) // entered id and pass is correct
                {
                    setVisible(false);
                    new Project();
                } else {

                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                    setVisible(false);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == cancel) {
            setVisible(false);
        }
    }
}
