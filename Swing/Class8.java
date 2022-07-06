//calling one frame from another...

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Class8{
	public static void main(String[] args) {
		Xyz obj = new Xyz();		
	}

}

class Xyz extends JFrame{
	Xyz(){
		//prerequistic->
		setLayout(new FlowLayout());
		setSize(1400,1000);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton b=new JButton("Call..");
		add(b);

		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				new X();
				dispose(); //it will close the caller form.
			}
		});
	}
}