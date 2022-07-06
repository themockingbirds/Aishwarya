import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JCB1 {
    JFrame f;
    JCheckBox cb1,cb3,cb4;
    JCheckBox cb2;

    JCB1(){
        f=new JFrame("JTextField");
        f.setVisible(true);
        f.setSize(500,520);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        cb1=new JCheckBox("Math");
        cb2=new JCheckBox();
        cb2.setText("Physichs");
        cb3=new JCheckBox("Hindi");
        cb4=new JCheckBox("English");

        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(cb4);
    }

    public static void main(String[] args) {
        JCB1 obj  =  new  JCB1();

    }
}	