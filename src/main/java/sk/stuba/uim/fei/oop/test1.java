package sk.stuba.uim.fei.oop;

import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;

import static javax.swing.BoxLayout.Y_AXIS;

public class test1 extends JFrame {


    public test1(String xx, String yy){
        super();
        Dimension dim= new Dimension(50,20);
        setLayout(new BorderLayout());
        setSize(300,300);
        JPanel xOsa = new JPanel();
        xOsa.setLayout(new FlowLayout());
        JLabel x = new JLabel("X: ");
        JTextField xText = new JTextField();
        xText.setPreferredSize(dim);
        xText.setText(xx);
        JPanel yOsa = new JPanel();
        yOsa.setLayout(new FlowLayout());
        JLabel y = new JLabel("Y: ");
        JTextField yText = new JTextField();
        yText.setPreferredSize(dim);
        xOsa.add(x);
        xOsa.add(xText);
        yOsa.add(y);
        yOsa.add(yText);
        yText.setText(yy);
        JPanel glavniPanel  = new JPanel();
        xOsa.setMaximumSize(new Dimension(100,20));
        yOsa.setMaximumSize(new Dimension(100,20));
        glavniPanel.setLayout(new BoxLayout(glavniPanel,BoxLayout.Y_AXIS));
        glavniPanel.add(xOsa);
        glavniPanel.add(yOsa);
        add(glavniPanel,BorderLayout.CENTER);



    }
}
