//ProgressBar...
//for Progress bar. we need Timer too..  because it progress according to time..


import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.Timer;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Class9{
	public static void main(String[] args) {
		Xy obj = new Xy();		
	}
}

class Xy extends JFrame implements ActionListener{
	JProgressBar p;
	JButton b;
	int i=0;
	Xy(){
		//prerequistic->
		setLayout(new FlowLayout());
		setSize(1400,1000);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//button:-
		addingButton();
		addingProgressBar();
		Timer t = new Timer(250,this);
		//action listener for Button...
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				//new X();
				t.start();//start the timer.
			}
		});
	}

	public void addingProgressBar(){
		p=new JProgressBar(0,20);
		add(p);
	}

	public void addingButton(){
		b=new JButton("Add New Frame");
		add(b);
	}

	public void actionPerformed(ActionEvent ae){
		if(i==20){
			new X();
			dispose();
		}
		i++;
		p.setValue(i);
	}
}