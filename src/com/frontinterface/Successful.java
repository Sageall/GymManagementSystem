package com.frontinterface;

import javax.swing.*;
import java.awt.*;

public class Successful extends JFrame {
    public JPanel SMSG;
    public JLabel SucccessMsg;

    public Successful(){
        JFrame sucframe=new JFrame("Successful");
        sucframe.setContentPane(new Successful().SMSG);
        sucframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sucframe.setVisible(true);
    }
}