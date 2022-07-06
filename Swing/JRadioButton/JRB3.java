import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JRB3{
    JFrame f;
    JRadioButton rb1;
    JRadioButton rb2;

    JRB3(){
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

        //Acording user print gender of user as label
        JButton b =new JButton("Click Here..");
        f.add(b);
        JLabel  l = new JLabel("Who is who..");
        f.add(l);
        b.addActionListener(ae->{
            if(rb1.isSelected())
                l.setText("Hello, Mr.");
            else
                l.setText("Hello, Miss.");
        });
    }

    public static void main(String[] args) {
        JRB3 obj  =  new  JRB3();

    }
}	