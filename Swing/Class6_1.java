import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionListener;


//checkbox with it;s eventHandler...
class Class6_1{
	public static void main(String[] args) {
		X obj = new X();
		
	}
}

class X extends JFrame{
	private JLabel l1,l2;
	private JButton b;
	private JCheckBox c1,c2,c3;
	private JRadioButton r1,r2;
	private JTextField t;

	X(){
		prerequistic();
		addlingTF();
		addingRB();
		addingCB();
		addingButton();
		addingLabel();
		
		//creating action for Button "Okay"
		b.addActionListener(ae-> //for button it's actionListener
		{
			String name="";
			//radion button
			if(r1.isSelected())
				name="Mr."+t.getText();
			else
				name="Miss "+t.getText();
			
			String hobbies="";
			//CheckBox
			if(c1.isSelected())
				hobbies+=c1.getText()+" ";

			if(c2.isSelected())
				hobbies+=c2.getText()+" ";

			if(c3.isSelected())
				hobbies+=c3.getText()+" ";

			l1.setText(name+" "+hobbies);

		});

	//
		c1.addItemListener(new ItemListener()
		{
			String label1=c1.getText();
			public void itemStateChanged(ItemEvent e){
				l2.setText(label1);
			}
		});

	}
	public void prerequistic(){
		setLayout(new FlowLayout());
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void addlingTF(){
		t=new JTextField(15);
		add(t);
	}

	public void addingCB(){
		c1=new JCheckBox("Gaming");
		c2=new JCheckBox("Dancing");
		c3=new JCheckBox("Singing");

		add(c1);add(c2);add(c3);
	}

	public void addingRB(){
		r1=new JRadioButton("Male");
		r2=new JRadioButton("Female");

		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);

		add(r1);add(r2);
	}

	public void addingButton(){
		b=new JButton("Okay");
		add(b);
	}

	public void addingLabel(){
		l1=new JLabel("");
		l2=new JLabel("Selected Items");
		add(l1);add(l2);
	}


}