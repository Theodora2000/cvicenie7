package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;

public class Draw extends JFrame {
public Draw(){
        super();
        setLayout(new BorderLayout());
        setSize(300,300);

        add(new MyCanvas(),BorderLayout.CENTER);


    }
}
