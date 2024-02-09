import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SwingCalculator implements ActionListener{
    JFrame jf;
    JPanel jp=new JPanel();
    JTextField tf=new JTextField();
    JButton[] b=new JButton[10];
    JButton addb,subb,divb,mulb,equb,clrb;
    int fnum=0,snum=0,res=0;
    int op=0;
    SwingCalculator(){
        jf=new JFrame("Calculator");
        for(int i=0;i<=9;i++){
            b[i]=new JButton(String.valueOf(i));
            b[i].addActionListener(this);
        }
        addb=new JButton("+");
        subb=new JButton("-");
        divb=new JButton("/");
        mulb=new JButton("*");
        equb=new JButton("=");
        clrb=new JButton("C");
        addb.addActionListener(this);
        subb.addActionListener(this);
        divb.addActionListener(this);
        mulb.addActionListener(this);
        equb.addActionListener(this);
        clrb.addActionListener(this);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jp.setLayout(new GridLayout(4, 4));
        jp.add(b[9]);jp.add(b[8]);jp.add(b[7]);jp.add(addb);
        jp.add(b[6]);jp.add(b[5]);jp.add(b[4]);jp.add(subb);
        jp.add(b[3]);jp.add(b[2]);jp.add(b[1]);jp.add(mulb);
        jp.add(clrb);jp.add(b[0]);jp.add(equb);jp.add(divb);
        tf.setBounds(0,0,400,200);
        jp.setBounds(0,200,400,400);
        jf.add(tf);jf.add(jp);
        jf.setSize(420,640);
        jf.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        Object s=e.getSource();
        for(int i=0;i<=9;i++){
            if(s==b[i]){
                tf.setText(tf.getText()+i);
            }
        }
        if(s==addb || s==subb || s==mulb || s==divb){
            fnum=Integer.parseInt(tf.getText());
            tf.setText(null);
        }
        if(s==addb)
            op=1;
        else if(s==subb)
            op=2;
        else if(s==divb)
            op=3;
        else if(s==mulb)
            op=4;

        if(s==equb){
            snum=Integer.parseInt(tf.getText());
            if(op==1){
                res=fnum+snum;
                tf.setText(String.valueOf(res));
            }
            else if(op==2){
                res=fnum+snum;
                tf.setText(String.valueOf(res));
            }
            else if(op==3){
                res=fnum/snum;
                tf.setText(String.valueOf(res));
            }
            else if(op==4){
                res=fnum*snum;
                tf.setText(String.valueOf(res));
            }
        }
        if(s==clrb){
            tf.setText(null);
            op=res=fnum=snum=0;
        }
    }
    public static void main(String[] args) {
        new SwingCalculator();
    }
}
