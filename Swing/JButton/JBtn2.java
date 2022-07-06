import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JBtn2 implements ActionListener{
	JButton b1, b2;
	JFrame f;

	JBtn2(){
		f = new JFrame("Adding Button");
		f.setVisible(true);
		f.setSize(600,650);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());

		//adding Buttons..
		
		b1= new JButton("Button1");
		b2= new JButton();
		b2.setText("Button2");

		f.add(b1);
		f.add(b2);

		b1.addActionListener(this);

	}
	public static void main(String[] args) {
		JBtn2 obj = new JBtn2();
	}

	public void actionPerformed(ActionEvent ae){
		JLabel l = new JLabel("Hi, I am Button1");
		f.add(l);
	}
}