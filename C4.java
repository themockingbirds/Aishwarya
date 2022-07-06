import javax.swing.*;
import java. awt.*;
class C4 {
	public static void main (String[] args){
		JFrame frame;
		frame=new JFrame ("Hello Java") ;
		frame.setVisible(true);
		frame. setSize(420,420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon ico =new ImageIcon("logo.png");
		frame.setIconImage(ico.getImage());
	}
}