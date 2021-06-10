import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator extends JFrame implements ActionListener{
    JTextField txf;
    JButton[] b = new JButton[20];
    char sqrt = 8730;
    int x=0,y=100,z=0;
    Calculator(){
        setLayout(null);
        setVisible(true);
        setBounds(500,300,420,650);
        setTitle("Calculator");

        Font f = new Font("Latin",Font.ITALIC,40);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent E){
                System.exit(0);
            }
        });
        txf = new JTextField();
        txf.setBounds(0,0,400,100);
        txf.setHorizontalAlignment(JTextField.RIGHT);
        txf.setFont(new Font("Code", Font.ITALIC, 40));
        add(txf);
        //buttons Creation
        for(int i=0; i<5; i++){
            for(int j=0; j<4; j++){
                b[z] = new JButton();
                b[z].setBounds(x,y,100,100);
                b[z].setFont(f);
                add(b[z]);
                z++;
                x=x+100;
            }
            x=0;
            y=y+100;
        }
        //seting value

            b[0].setLabel("B");
            b[1].setLabel("C");
            b[2].setLabel("1/x");
            b[3].setLabel(sqrt + "x");

            b[4].setLabel("7");
            b[5].setLabel("8");
            b[6].setLabel("9");
            b[7].setLabel("/");

            b[8].setLabel("4");
            b[9].setLabel("5");
            b[10].setLabel("6");
            b[11].setLabel("X");

            b[12].setLabel("1");
            b[13].setLabel("2");
            b[14].setLabel("3");
            b[15].setLabel("-");

            b[16].setLabel("0");
            b[17].setLabel(".");
            b[18].setLabel("=");
            b[19].setLabel("+");
    }
    public void actionPerformed(ActionEvent e){

    }
    public static void main(String args[]){
        Calculator f = new Calculator();
    }
    
}
