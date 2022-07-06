//performing all mathematical operation using different button..
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Class4{
	public static void main(String[] args) {
		X obj = new X();
	}				
}

class X extends JFrame implements ActionListener{
    JLabel l;
    JTextField t1,t2;
    JButton b1; //sum
    JButton b2; //sub
    JButton b3;	//mul
    JButton b4; //div

    X(){
    	
        prerequisite_setups();
        addingInputBox();
        addingButton();
        addingText();
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    public void prerequisite_setups(){
        setLayout(new FlowLayout());
        setSize(400,450); 
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addingText(){ 
        l=new JLabel("RESULT");
        add(l);
    }

    public void addingButton(){ 
        b1=new JButton("Summation"); //caption 
        b2=new JButton("Subtract"); //caption 
        b3=new JButton("Multiply"); //caption 
        b4=new JButton("Divide"); //caption 

        add(b1);
        add(b2);
        add(b3);
        add(b4);   
    }

    public void addingInputBox(){
        t1=new JTextField(20);
        t2=new JTextField(20);
        add(t1);
        add(t2);

    }

    @Override
    public void actionPerformed(ActionEvent ae){
    	int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());

        double result=0;

    	if(ae.getSource()==b1)
        	result =num1+num2;
        else if(ae.getSource()==b2)
        	result =num1-num2;
        else if(ae.getSource()==b3)
        	result =num1*num2;
        else if(ae.getSource()==b4)
        	result =num1/num2;
        
        l.setText(result+" ");

    }
}