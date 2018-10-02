package com.frontinterface;

import javax.swing.*;

public class Successful {
    public JPanel SMSG;
    public JLabel SucccessMsg;
    public static void main(String args[]) {
        JFrame frame=new JFrame("Successful");
        frame.setContentPane(new Successful().SMSG);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}