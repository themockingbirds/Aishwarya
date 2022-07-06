import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.*;

class JLbl3 {
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

		//setting Foreground and Background color--
		l1.setForeground(Color.red);
		l2.setBackground(Color.yellow);
		l2.setOpaque(true);

	}
}