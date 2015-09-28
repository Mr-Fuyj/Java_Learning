
import javax.swing.JOptionPane;
public class DialogTest {
	public static void main(String args[]){
	String name=JOptionPane.showInputDialog("hi,shabi,what's your name?");
	String message=String.format("hi,%s!",name);
	JOptionPane.showMessageDialog(null,message);
	}
	
}
