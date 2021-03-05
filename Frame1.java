import java.awt.*;
import java.awt.event.*;
public class Frame1 extends Frame{
public static void main(String args[]){
Frame1 f= new Frame1();
f.addWindowListener(new class2());
f.setSize(3000,3000);
f.setVisible(true);
}
}

class class2 extends WindowAdapter{
public void windowClosing(WindowEvent e){
System.exit(0);
}
}
