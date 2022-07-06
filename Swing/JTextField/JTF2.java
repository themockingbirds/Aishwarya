import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JTF2 {
    JTextField t1,t2;
    JFrame f;
    JButton b;

    JTF2(){
        f=new JFrame("JTextField");
        f.setVisible(true);
        f.setSize(500,520);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());


        t1=new JTextField(20);
        t2=new JTextField(15);
        f.add(t1);
        f.add(t2);
        
        //sum of two number using input box.. when click button...
        b=new JButton("SUM");
        f.add(b);
        JLabel l =new JLabel();        
        f.add(l);            
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int result =0;
                int  num1=Integer.parseInt(t1.getText());
                int  num2=Integer.parseInt(t2.getText());
                result=num1+num2;
                l.setText(result+"");
            }
        });
    }

    public static void main(String[] args) {
        JTF2 obj  =  new  JTF2();

    }
}	