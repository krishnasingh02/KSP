import java.awt.*;
import java.awt.event.*;
class ListOfItem extends Frame{
    ListOfItem(){
        setLayout(null);
        setVisible(true);
        setBounds(500,300,600,600);
        setTitle("List of Item");
        //window closing
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent E){
                System.exit(0);
            }
        });
    }
    public static void main(String Args[]){
        ListOfItem frame = new ListOfItem();
    }
}