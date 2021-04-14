package sk.stuba.uim.fei.oop;

import java.awt.*;

public class MyCanvas extends Canvas {

    public void paint(Graphics g){
        g.drawPolyline(new int[]{20,40,50,30,10,20}, new int[] {10,10,30,50,30,10},6);
    }

}
