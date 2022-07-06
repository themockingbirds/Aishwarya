//performing all mathematical operation using different button..
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.FlowLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Adding Radio Button
class Class5_2{
	public static void main(String[] args) {
		X obj = new X();
	}				
}

class X extends JFrame{
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1; //sum
    JButton b2; //sub
    JButton b3;	//mul
    JButton b4; //div
    JRadioButton r1,r2;

    X(){
    	
        prerequisite_setups();
        addingTextName();
        addingInputBox();
        addingRadioButton();
        addingButton();
        addingText();
        //b1.addActionListener(this); //1st way
        /*b1.addActionListener(new ActionListener() //2nd way
        { 
            public void actionPerformed(ActionEvent ae){
                String name="Welcome";
                if(r1.isSelected())
                    name+=" Mr. "+t1.getText();
                else
                    name+=" Miss "+t1.getText(); 
                l2.setText(name);
            }
        }
        );*/

        b1.addActionListener(ae -> //3rd way using Lambda Expression
        {
            String name="Welcome";
                if(r1.isSelected())
                    name+=" Mr. "+t1.getText();
                else
                    name+=" Miss "+t1.getText(); 
                l2.setText(name);
        });
    }

    public void prerequisite_setups(){
        setLayout(new FlowLayout());
        setSize(400,450); 
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

        public void addingTextName(){ 
        l1=new JLabel("Enter Name: ");
        add(l1);
    }

    public void addingText(){ 
        l2=new JLabel(".........");
        add(l2);
    }

    public void addingButton(){ 
        b1=new JButton("OKay!!"); //caption 
        add(b1);   
    }
    public void addingRadioButton(){ 
        r1=new JRadioButton("Male");
        r2=new JRadioButton("Female");

        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        add(r1);
        add(r2);
    }

    public void addingInputBox(){
        t1=new JTextField(20);
        
        add(t1);
    }

    //removed.. using direct implementation..
   /* @Override
    public void actionPerformed(ActionEvent ae){
    	String name="Welcome";
        if(r1.isSelected())
            name+=" Mr. "+t1.getText();
        else
            name+=" Miss "+t1.getText(); 
        l2.setText(name);

    }*/
}