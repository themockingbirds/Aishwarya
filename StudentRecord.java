import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class StudentRecord extends JFrame{

	private Container c;
	private JLabel fname,lname;
	private  JTextField tname,troll,tage, tmn;
	private JButton submit,reset;
	private JCheckBox tc;
	private JRadioButton male,female;

	StudentRecord(){
		c=getContentPane();
		c.setLayout(null);
		setTitle("Student Registration Form");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100,100,800,650);
		setResizable(false);

		fname = new JLabel("First Name ");
		fname.setSize(100,40);
		fname.setLocation(100,20);
		fname.setBackground(Color.red);
		fname.setOpaque(true);
		c.add(fname);
		
		lname = new JLabel("Last Name");
		lname.setSize(100,40);
		lname.setLocation(201,20);
		lname.setBackground(Color.cyan);
		lname.setOpaque(true);
		c.add(lname);

		setVisible(true);
	}
	public static void main(String[] args) {
		StudentRecord sr = new StudentRecord();
	}
}