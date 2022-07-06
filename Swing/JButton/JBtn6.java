import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

class JBtn6 implements ActionListener{
	JButton b;
	JFrame f;

	JBtn6(){
		f = new JFrame("Adding Button");
		f.setVisible(true);
		f.setSize(600,650);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());

		//adding Buttons..
		
		b= new JButton("Button1");
		b.addActionListener(this);

		//setting icon
		ImageIcon i = new ImageIcon("logo.png");
		b.setIcon(i);

		//set font
		b.setFont(new Font("Times",Font.BOLD,24));
		//set forgroud and background color
		b.setBackground(Color.yellow);
		b.setForeground(Color.red);

		//set Bevel Border
		Border bd = BorderFactory.createBevelBorder(BevelBorder.RAISED);
		b.setBorder(bd);

		//setShortCut Key
		b.setMnemonic('b');

		//setTooltip
		b.setToolTipText("I am Button 1..");

		f.add(b);

	}
	public static void main(String[] args) {
		JBtn6 obj = new JBtn6();
	}

	public void actionPerformed(ActionEvent ae){
		JLabel l = new JLabel("Hi, I am Button1");
		f.add(l);
	}


}