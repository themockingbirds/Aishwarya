import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

class JBtn4{
	JButton b;
	JFrame f;

	JBtn4(){
		f = new JFrame("Adding Button");
		f.setVisible(true);
		f.setSize(600,650);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());

		//adding Buttons..
		
		b= new JButton("Button1");
		f.add(b);
		
		b.addActionListener(ae->{
				JLabel l = new JLabel("Hi, I am Button1");
				f.add(l);
			}
		);

	}
	public static void main(String[] args) {
		JBtn4 obj = new JBtn4();
	}

	

}