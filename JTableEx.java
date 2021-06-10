import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class JTableEx extends JFrame{
    JTable table;
    String[][] data = {
        {"Tab01", "Aman", "45000", "Indore"},
        {"Tab02", "Anshuman", "52000", "Dhar"},
        {"Tab03", "Jatin", "60000", "Indore"},
        {"Tab04", "Pankaj", "40000", "Dewas"},
        {"Tab05", "Shivam", "35000", "Ujjain"}
    };
    String[] column = {"Emp. ID", "Name", "Salary", "City"};
    JTableEx(){
        setTitle("Table");
        setBounds(500,300,500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        table = new JTable(data, column);
        JScrollPane sp = new JScrollPane(table);
        add(sp);
        table.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent E){
                int index = table.getSelectedRow();
                System.out.println(table.getValueAt(index, 1) + " is Selected.");
            }
        });
        setVisible(true);
    }
    public static void main(String arg[]){
        JTableEx frame = new JTableEx();
    }
}