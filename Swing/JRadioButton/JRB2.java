import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JRB2{
    JFrame f;
    JRadioButton rb1;
    JRadioButton rb2;

    JRB2(){
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

        //Adding them into ButtonGroup
        ButtonGroup gen  = new ButtonGroup();
        gen.add(rb1);
        gen.add(rb2);

    }

    public static void main(String[] args) {
        JRB2 obj  =  new  JRB2();

    }
}	