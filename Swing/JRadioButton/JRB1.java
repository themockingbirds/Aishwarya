import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JRB1 {
    JFrame f;
    JRadioButton rb1;
    JRadioButton ta2;

    JRB1(){
        f=new JFrame("JTextField");
        f.setVisible(true);
        f.setSize(500,520);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        rb1=new JRadioButton("Male");
        rb2=new JRadioButton();
        rb2.setText("Female");
        f.add(rb1);
        f.add(rb2);
    }

    public static void main(String[] args) {
        JRB1 obj  =  new  JRB1();

    }
}	