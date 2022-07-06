import javax.swing.*;
import java.awt.*;

class JLbl2 {
	public static void main(String[] args) {
		JFrame f = new JFrame("Lable");
		f.setVisible(true);
		f.setSize(420,420);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());

		//adding labels---

		JLabel l1= new JLabel("Hello JAVA");
		JLabel l2= new  JLabel();
		JLabel l3= new  JLabel("Running....");
		l2.setText("I am a GUI Program");

		f.add(l1);
		f.add(l2);
		f.add(l3);

		//setting Font--
		l1.setFont(new Font("Helvetica",Font.BOLD,18));
		l3.setFont(new Font("Times",Font.BOLD,24));
	}
}