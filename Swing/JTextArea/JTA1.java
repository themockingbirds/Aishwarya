import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JTA1 {
    JFrame f;
    JTextArea ta1;
    JTextArea ta2;
    JTextArea ta3;

    JTA1(){
        f=new JFrame("JTextArea");

        ta1=new JTextArea();
        ta2=new JTextArea("Hello There...");
        ta3=new JTextArea(10,10);

        f.add(ta1);
        f.add(ta2);
        f.add(ta3);

        f.setVisible(true);
        f.setSize(500,520);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        JTA1 obj  =  new  JTA1();

    }
}	