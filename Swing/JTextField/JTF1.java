import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;

class JTF1 {
    JTextField t1,t2;
    JFrame f;

    JTF1(){
        f=new JFrame("JTextField");
        f.setVisible(true);
        f.setSize(500,520);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        t1=new JTextField(20);
        t2=new JTextField(15);
        f.add(t1);
        f.add(t2);

    }

    public static void main(String[] args) {
        JTF1 obj  =  new  JTF1();

    }
}	