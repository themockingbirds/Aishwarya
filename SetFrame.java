import javax.swing.*;
import java.awt.*;

class SetFrame extends JFrame{
	SetFrame(){
		Container c = getContentPane();
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(400,200,300,180);
		setTitle("Frame -> x:"+getX()+"; y:"+getY()+"; w:"+
			getWidth()+"; H:"+getHeight());
		setResizable(false);
		c.setBackground(Color.cyan);
		setVisible(true);
	}
	public static void main(String[] args) {
		SetFrame obj = new SetFrame();

	}
}
