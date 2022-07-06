import javax.swing.*;
import java.awt.*;

class Img2 {
	public static void main(String[] args) {
		JFrame f = new JFrame("Adding Images");
		f.setVisible(true);
		f.setSize(420,420);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//f.setLayout(new FlowLayout()); 
		//- removing this for now jsut to applying custome layout

		//adding labels---

		JLabel l1= new JLabel();
		f.add(l1);

		//adding images
		ImageIcon ic = new ImageIcon("logo.png");
		l1.setIcon(ic);

		//some method that help to customize text and image...
		//add both text and image at same lable..
		l1.setText("java..");
		l1.setHorizontalTextPosition(JLabel.CENTER);
		l1.setVerticalTextPosition(JLabel.TOP);
		l1.setIconTextGap(-96);
		l1.setVerticalAlignment(JLabel.CENTER);
		l1.setHorizontalAlignment(JLabel.CENTER);
		//l1.setBounds(0,0,550,550);
		l1.setBackground(Color.yellow);
		l1.setOpaque(true);

		//f.setLayout(null);
		f.pack();


	}
}