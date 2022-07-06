import javax.swing.*;
import java.awt.*;

class JBtn1{
	public static void main(String[] args) {
		JFrame f = new JFrame("Adding Button");
		f.setVisible(true);
		f.setSize(420,420);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());

		//adding Buttons..
		
		JButton b1= new JButton("Button1");
		JButton b2= new JButton();
		b2.setText("Button2");

		f.add(b1);
		f.add(b2);
	}
}