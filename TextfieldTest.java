import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;

public class TextfieldTest implements ActionListener{
    JFrame jf;
    JTextField tf1=new JTextField();
    JTextField tf2=new JTextField();
    JLabel jl=new JLabel();
    JButton jb=new JButton();
    TextfieldTest(){
        jf=new JFrame("Textfield Test");
        jb.setText("Display");
        jl.setText("Enter Name in this textfield");
        jb.addActionListener(this);
        tf1.setBounds(40, 40, 200, 150);
        tf2.setBounds(270, 40, 200, 150);
        jl.setBounds(40, 220, 200, 40);
        jb.setBounds(200,290,110,40);
        jf.setSize(530,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(jb);jf.add(jl);jf.add(tf1);jf.add(tf2);
        jf.setLayout(new BorderLayout());
        jf.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        Object source=e.getSource();
        if (source==jb){
            String s=tf1.getText();
            tf2.setText(s);
            tf1.setText(null);
        }
    }
    public static void main(String[] args) {
        new TextfieldTest();
    }
}
