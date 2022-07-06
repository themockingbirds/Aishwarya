import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Ading ActionListener interface and 
//it's method actionPerformed(ActionEvent ae){}
//it will responsible for any event like button pressed etc..

class Class2 {
    public static void main(String[] args) {
        X obj  =  new  X();
    }
}	

class X extends JFrame implements ActionListener{
    JLabel l;
    JTextField t1,t2;
    JButton b1;

    X(){
    	
        prerequisite_setups();
        addingInputBox();
        addingButton();
        addingText();
        b1.addActionListener(this);
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
        b1=new JButton("Ok"); //caption 
        add(b1);
        
    }

    public void addingInputBox(){
        t1=new JTextField(20);
        t2=new JTextField(20);
        add(t1);
        add(t2);

    }

    public void sum(){
       int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());
        int result =num1+num2;
        l.setText(result+" ");
    }

    @Override
    public void actionPerformed(ActionEvent ae){
        sum();
    }
}