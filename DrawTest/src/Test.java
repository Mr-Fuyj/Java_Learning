import javax.swing.JFrame;

public class Test {
	public static void main(String args[]){
		DrawPanel panel=new DrawPanel();
		JFrame application=new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);
		application.setSize(1000, 220);
		application.setVisible(true);
	}
}
