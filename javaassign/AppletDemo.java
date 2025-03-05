import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class AppletDemo extends Applet{
    public void init(){
        setBackground(Color.red);
        setForeground(Color.white);
    }
    public void paint(Graphics g){
        g.drawString("Applet Demo Program", 50, 50);
        g.drawString("This is a simple applet Program", 50, 70);
        g.drawString("---- END ----", 50, 90);
    }
}