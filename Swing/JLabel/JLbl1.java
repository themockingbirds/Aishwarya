import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

class JLbl1 {
	public static void main(String[] args) {
		JFrame f = new JFrame("Lable");
		f.setVisible(true);
		f.setSize(420,420);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());

		//adding labels---

		JLabel l1= new JLabel("Hello JAVA");
		JLabel l2= new  JLabel();
		l2.setText("I am a GUI Program");

		f.add(l1);
		f.add(l2);
	}
}