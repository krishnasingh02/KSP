import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ShowAllFont extends Frame{
public static void main(String args[]){
ShowAllFont sf=new ShowAllFont();
sf.setSize(800,600);
sf.setVisible(true);
}

String msg = "f";
String FontList[];

public ShowAllFont(){
addWindowListener(
new WindowAdapter(){
public void windowClosing(WindowEvent we){
System.exit(0);}});

GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
FontList = ge.getAvailableFontFamilyNames();
for(int i = 0; i < FontList.length; i++)
msg += FontList[i] + "  ";
}
public void paint(Graphics g) {
g.drawString(msg, 40, 160);
}



}