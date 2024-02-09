import javax.swing.*;
import java.awt.event.*;

public class SwingPractise{
    JFrame f;
    SwingPractise(){
        f=new JFrame("Sample");
        JButton b=new JButton();
        JTextField tf=new JTextField();
        tf.setText("Button not clicked yet");
        b.setText("Click");
        tf.setBounds(130,50,150,100);
        b.setBounds(160, 170, 70, 50);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tf.setText("Button Clicked");
            }
        });
        f.add(b);
        f.add(tf);
        f.setLayout(null);
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public static void main(String args[]){
        new SwingPractise();
    }
}
