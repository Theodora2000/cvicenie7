package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class test extends JFrame
{
    private boolean clicked=false;
    public test()
    {
        super();
        setLayout(new BorderLayout());
        setSize(300,300);
        JPanel pnlButtons= new JPanel();
        pnlButtons.setLayout(new FlowLayout());

        JButton btnClose= new JButton("Close");
        JButton btnDraw = new JButton("Draw");
        JButton btnClick = new JButton("Clicked");
        pnlButtons.add(btnClose);
        pnlButtons.add(btnDraw);
        pnlButtons.add(btnClick);
        add(pnlButtons,BorderLayout.CENTER);
        btnClose.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        btnClick.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clicked=true;
            }
        });


        addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                String x;
                String y;
                x=String.valueOf(e.getX());
                y=String.valueOf(e.getY());
                if(clicked)
                {

                    test1 tt= new test1(x,y);
                    tt.setVisible(true);
                    clicked=false;
                }
            }

        });

        btnDraw.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Draw c = new Draw();
                c.setVisible(true);
            }
        });




    }

}
