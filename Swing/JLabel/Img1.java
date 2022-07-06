import javax.swing.*;
import java.awt.*;

class JLbl1 {
	public static void main(String[] args) {
		JFrame f = new JFrame("Adding Images");
		f.setVisible(true);
		f.setSize(420,420);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());

		JLabel l1= new JLabel();
		f.add(l1);
		
		//adding images
		ImageIcon ic = new ImageIcon("logo.png");
		l1.setIcon(ic);
	}
}