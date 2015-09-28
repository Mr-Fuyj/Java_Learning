
import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawPanel extends JPanel {
	public void paintComponent(Graphics graphics){
		super.paintComponent(graphics);
		int width=getWidth();
		int height=getHeight();
		
		graphics.drawLine(0, 0, width, height);
	}
}
