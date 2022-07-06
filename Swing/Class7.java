import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;


//MouseAdapter , MouseEvent...
class Class7{
	public static void main(String[] args) {
		X obj = new X();
		
	}
}

class X extends JFrame{
	
	X(){
		prerequistic();

		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				int x=e.getX();
				int y=e.getY();
				System.out.println("->"+x+","+y);
			}
		});
	
	}
	public void prerequistic(){
		setLayout(new FlowLayout());
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}