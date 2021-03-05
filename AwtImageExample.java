import java.awt.*;
import java.awt.event.*;

public class AwtImageExample extends Frame{
  Image img;
  public static void main(String[] args){
  AwtImageExample ai = new AwtImageExample();
  }

  public AwtImageExample(){
  super("Image Frame");
  MediaTracker mt = new MediaTracker(this);
  img = Toolkit.getDefaultToolkit().getImage("asuka.jpg");
  mt.addImage(img,0);
  setSize(1280,700);
  setVisible(true);
  addWindowListener(new WindowAdapter(){
  public void windowClosing(WindowEvent we){
  dispose();
  }
  });
  }
  public void update(Graphics g){
  paint(g);
  }
  
  public void paint(Graphics g){
  if(img != null)
  g.drawImage(img, 0, 0, this);
  else
  g.clearRect(0, 0, getSize().width, getSize().height);
  }
}