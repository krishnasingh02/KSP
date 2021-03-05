import java.awt.*;
import java.awt.event.*;
public class SmileEmoji extends Frame{

public void paint(Graphics g){
g.setColor(Color.green);
g.fillRect(0,280,1000,280);
g.setColor(Color.yellow);
g.fillRect(600,110,140,180);

g.setColor(Color.blue);
g.fillRect(620,120,10,30);
g.fillRect(650,120,10,30);
g.fillRect(680,120,10,30);
g.fillRect(710,120,10,30);
g.fillRect(620,170,10,30);
g.fillRect(650,170,10,30);
g.fillRect(680,170,10,30);
g.fillRect(710,170,10,30);

g.setColor(Color.black);
g.fillRect(440,200,20,120);
Graphics2D g2=(Graphics2D) g;
g2.setStroke(new BasicStroke(10));
g.drawLine(450,300,500,400);
g.drawLine(450,300,400,400);
g.drawLine(450,200,400,270);
g.drawLine(450,200,500,270);
g2.setStroke(new BasicStroke(2));
g.fillOval(400,100,100,100);
g.setColor(Color.white);
g.drawOval(420,120,10,10);
g.drawOval(470,120,10,10);
g.setColor(Color.red);
g.drawArc(430, 150, 40, 40, -25, -130);
addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we){
System.exit(0);}});
}


public static void main(String args[]){
SmileEmoji f=new SmileEmoji();
f.setSize(1000,500);
f.setVisible(true);

}
}