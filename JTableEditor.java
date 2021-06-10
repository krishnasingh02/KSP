import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
class JTableEditor extends JFrame implements MouseListener, ActionListener{
    JPanel p1,p2;
    JTable table;
    JLabel L1,L2;
    JTextField percent;
    JButton btn;
    String[][] data = {
        {"Std01", "Ajay", "60", "std01@clg.com"},
        {"Std02", "Amar", "92", "std02@clg.com"},
        {"Std03", "Himanshu", "78", "std03@clg.com"},
        {"Std04", "Mahendra", "100", "std04@clg.com"},
        {"Std05", "Naman", "86", "std05@clg.com"},
        {"Std06", "Rajat", "63", "std06@clg.com"},
        {"Std07", "Shivam", "72", "std07@clg.com"},
        {"Std08", "Vinay", "51", "std08@clg.com"}
    };
    int index,perc;
    String[] column = {"Student ID", "Name", "Attendance(%)", "Mail ID"};
    DefaultTableModel tm = new DefaultTableModel(data, column);
    JTableEditor(){
        setTitle("Table");
        setVisible(true);
        setLayout(new GridLayout(3,1));
        setBounds(500,300,500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);        
        
        table = new JTable(tm);
        table.addMouseListener(this);
        p1 = new JPanel();
        JScrollPane jsp = new JScrollPane(table);
        p1.add(jsp);
        add(p1);
        L1 = new JLabel();
        L1.setHorizontalAlignment(JLabel.CENTER);
        L1.setFont(new Font("Gotham", Font.PLAIN, 20));
        add(L1);
        p2 = new JPanel();
        L2 = new JLabel("Change Percentage: ");
        p2.add(L2);
        percent = new JTextField(5);
        p2.add(percent);
        btn = new JButton("Update");
        btn.addActionListener(this);
        p2.add(btn);
        add(p2);
        validate();
    }
    public static void main(String args[]){
        new JTableEditor();
    }
    public void mouseClicked(MouseEvent e) {
        index = table.getSelectedRow();
        percent.setText("" + tm.getValueAt(index, 2));
        try{perc = Integer.parseInt("" +tm.getValueAt(index, 2));}
        catch(Exception exception){
            JOptionPane.showMessageDialog(this,"Invalid Percentage passed...","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        L2.setText("Change Percentage of " + tm.getValueAt(index, 1) + ": ");
        Eligiblility();
    }
    public void Eligiblility(){
        if(perc>75){
            L1.setText(tm.getValueAt(index, 1) + " is Eligible for Entering in Exam.");
            L1.setForeground(Color.green);
        }
        else{
            L1.setText(tm.getValueAt(index, 1) + " is  not Eligible for Entering in Exam.");
            L1.setForeground(Color.red);
        }
    }
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public void actionPerformed(ActionEvent e) {
        index = table.getSelectedRow();
        
        try{perc = Integer.parseInt("" +tm.getValueAt(index, 2));}
        catch(Exception exception){
            JOptionPane.showMessageDialog(this,"Invalid Percentage passed...","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
        if(percent.getText().isEmpty() || perc>100){
            JOptionPane.showMessageDialog(this,"Invalid Percentage passed...","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else{tm.setValueAt(percent.getText(),index,2);}
        Eligiblility();
    }
}