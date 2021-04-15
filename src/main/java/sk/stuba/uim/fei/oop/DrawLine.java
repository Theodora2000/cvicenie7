package sk.stuba.uim.fei.oop;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.Point;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawLine extends JPanel implements MouseListener, MouseMotionListener {
    Point sPoint = new Point(-1, -1);
    Point ePoint = new Point(-1, -1);
    Vector points = new Vector();K

    DrawLine(){

        init();
    }

    public void init() {
        Dimension d = getSize();

        setPreferredSize(new Dimension(200,200));
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseDragged(MouseEvent e) {
        e.consume();
        ePoint.x = e.getX();
        ePoint.y = e.getY();
        //    repaint();


    }

    public void mousePressed(MouseEvent e) {
        e.consume();
        sPoint.x = e.getX();
        sPoint.y = e.getY();
        points.addElement(new Point(sPoint));
    }

    public void mouseReleased(MouseEvent e) {
        e.consume();
        ePoint.x = e.getX();
        ePoint.y = e.getY();
        points.addElement(new Point(ePoint));
        repaint();

    }

    public void mouseMoved(MouseEvent e) { }

    public void mouseEntered(MouseEvent e) { }

    public void mouseExited(MouseEvent e) { }

    public void mouseClicked(MouseEvent e) {
        Point p = e.getPoint();
        System.out.println(p);
        for(int i = 0; i < points.size();i++)
        {
            Point p1=(Point)points.elementAt(i);

            if(p1.getX()==p.getX() && p1.getY()==p.getY())
            {
                System.out.println(points);
                System.out.println("clicked");
                points.remove(i);
                System.out.println(points);
                repaint();
            }

        }


    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Point p1, p2;
        /* Draw old lines.Every 2 points construct a line.*/
        for (int i=0; i < points.size()-1; i+=2) {
            p1 = (Point)points.elementAt(i);
            p2 = (Point)points.elementAt(i+1);
            g.drawLine(p1.x, p1.y, p2.x, p2.y);
        }
        /* Draw current line.*/
        g.drawLine(sPoint.x, sPoint.y, ePoint.x, ePoint.y);
    }

    public static void main(String arg[])
    {
        DrawLine line= new DrawLine();

        JFrame f= new JFrame();
        f.setSize(new Dimension(300,300));
        f.getContentPane().add(line);
        f.setVisible(true);
    }

}