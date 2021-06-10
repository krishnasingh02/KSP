import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
class JSliderAndJToogle{
    
    public static void main(String args[]){
        JFrame frame;
        JSlider slider;
        JToggleButton tbtn;
        JLabel L1,L2,L3,L4;
        Font f = new Font("Gotham", Font.PLAIN, 20);

        frame = new JFrame("JFrame, JSlider and JToggleButton");//create frame with title
        frame.setBounds(300,300,500,500);//setlocation and size of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close frame
        frame.setLayout(null);

        L1 = new JLabel("Get Notification from APP: ");
        L1.setBounds(80,50,250,50);
        L1.setFont(f);
        frame.add(L1);
        tbtn = new JToggleButton("ON");//create toggle button
        tbtn.setBounds(340,50,80,50);
        tbtn.setFont(f);
        frame.add(tbtn);//add toggle button to frame.

        L2 = new JLabel("Rate the APP from 1 to 5.");
        L2.setHorizontalAlignment(JLabel.CENTER);
        L2.setBounds(80,150,300,50);
        L2.setFont(f);
        frame.add(L2);
        slider = new JSlider(1,5,5);//create slider
        slider.setBounds(140,210,200,50);
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setFont(f);
        
        frame.add(slider);//add slider to frame.

        L3 = new JLabel("Notification is ON.");
        L3.setForeground(Color.green);
        L3.setBounds(80,280,300,50);
        L3.setHorizontalAlignment(JLabel.CENTER);
        L3.setFont(f);
        frame.add(L3);

        L4 = new JLabel("");
        L4.setBounds(35,340,400,50);
        L4.setHorizontalAlignment(JLabel.CENTER);
        L4.setFont(f);
        frame.add(L4);

/*listeners */
        slider.addChangeListener(new ChangeListener(){
            public void stateChanged(ChangeEvent e){
                L4.setText("Thanks For rating. You give " + slider.getValue() + " rating points.");
            }
        });
        tbtn.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                if(tbtn.isSelected()){
                    tbtn.setText("OFF");
                    L3.setText("Notification is OFF.");
                    L3.setForeground(Color.red);
                }
                else{
                    tbtn.setText("ON");
                    L3.setText("Notification is ON.");
                    L3.setForeground(Color.green);
                }
            }
        });
        frame.setVisible(true);//make frame visible
    }
}