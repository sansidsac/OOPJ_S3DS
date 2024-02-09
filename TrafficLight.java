import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class TrafficLight implements ActionListener {
    JFrame jf;
    JRadioButton rb=new JRadioButton();
    JRadioButton yb=new JRadioButton();
    JRadioButton gb=new JRadioButton();
    ButtonGroup bg=new ButtonGroup();
    Color RED=Color.RED;
    Color YELLOW=Color.YELLOW;
    Color GREEN=Color.GREEN;
    JPanel jp=new JPanel();
    TrafficLight(){
        jf=new JFrame("Traffic Light Simulator");
        rb.setText("RED");
        yb.setText("YELLOW");
        gb.setText("GREEN");
        rb.addActionListener(this);
        yb.addActionListener(this);
        gb.addActionListener(this);
        rb.setBounds(0, 0, 100, 60);
        yb.setBounds(0,60,100,60);
        gb.setBounds(0,120,100,60);
        jp.setBounds(100,0,300,240);
        bg.add(rb);bg.add(yb);bg.add(gb);
        jf.add(rb);jf.add(yb);jf.add(gb);jf.add(jp);
        jf.setSize(400,240);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        Object source=e.getSource();
        if (source==rb){
            jp.setBackground(RED);
        }
        else if(source==yb){
            jp.setBackground(YELLOW);
        }
        else if(source==gb){
            jp.setBackground(GREEN);
        }
    }
    public static void main(String[] args) {
        new TrafficLight();
    }

}
