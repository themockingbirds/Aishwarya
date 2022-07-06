import javax.swing.JFrame;
import java.awt.FlowLayout;
//creating simple frame
class Class0 {
    public static void main(String[] args) {
        X obj  =  new  X();

    }
}	
class X extends JFrame{
    X(){
    	//if we don't mention these methods Frame/Window will not be visible 
    	//and default values will be applicable
        setLayout(new FlowLayout());  //by default follow cardLayout
        setSize(400,450); //by default w=0,h=0
        setVisible(true);  //bydefault false
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//by defualt no action performed
    }

}