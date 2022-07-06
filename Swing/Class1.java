import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
//Adding TextComponent
//Adding InputBox or  TextField
//Adding Button
class Class1 {
    public static void main(String[] args) {
        X obj  =  new  X();

    }
}	

class X extends JFrame{
    X(){
    	
        prerequisite_setups();
        JLabel l1=new JLabel("Hello I am a String.");
        add(l1);
        addingInputBox();
        addingButton();
        addingText();
        

    }

    public void prerequisite_setups(){
        setLayout(new GridLayout());
        setSize(400,450); 
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void addingText(){ 
        JLabel l1=new JLabel("Hello I am a String1.");
        JLabel l2=new JLabel("Hello I am a String2.");
        add(l1);
        add(l2);
    }

    public void addingButton(){ 
        JButton b1=new JButton("Ok"); //caption 
        add(b1);
    }

    public void addingInputBox(){
        JTextField t1=new JTextField(20);
        JTextField t2=new JTextField(20);
        add(t1);
        add(t2);

    }
}