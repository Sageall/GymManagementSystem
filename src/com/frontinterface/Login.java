package com.frontinterface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Login extends JFrame{
    private javax.swing.JTextField Username;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JTextField Password;
    private javax.swing.JPanel MainPanel;

    public Login() {
        LoginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String un=Username.getText();
                String pass=Password.getText();
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", un, pass);
                    Successful su=new Successful();
                    dispose();
                    //JOptionPane optionPane = new JOptionPane("Successful");
                    //JDialog dialog = optionPane.createDialog("Welcome.");
                    //dialog.setAlwaysOnTop(true);
                    //dialog.setVisible(true);
                } catch (ClassNotFoundException ex) {
                    JOptionPane optionPane = new JOptionPane("ErrorMsg", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Failure");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                } catch (SQLException ex) {
                    JOptionPane optionPane = new JOptionPane("ErrorMsg", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Failure");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                }
            }
        });
        ExitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String args[]) {
        JFrame lframe=new JFrame("Login");
        lframe.setContentPane(new Login().MainPanel);
        lframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lframe.pack();
        lframe.setVisible(true);
    }
}
