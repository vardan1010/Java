package exam;

import java.awt.*;
import javax.swing.*;

public class Smily extends Canvas {
	
	public void paint(Graphics g) {
		setBackground(Color.WHITE);

		g.setColor(Color.BLACK);
		g.drawOval(20, 30, 200, 200);
		g.setColor(Color.YELLOW);
		g.fillOval(23,33,197,197);
		g.setColor(Color.BLACK);
		g.drawOval(55, 100, 20, 20);
		g.setColor(Color.yellow);
		g.fillOval(58, 103, 17, 17);
		g.setColor(Color.BLACK);
		g.drawOval(155, 100, 20, 20);
		g.setColor(Color.YELLOW);
		g.fillOval(158, 103, 17, 17);
		g.setColor(Color.BLACK);
		g.drawArc(65, 150, 103, 30, 180, 360);
		g.setColor(Color.WHITE);
		g.fillArc(68,153,100,27,180,360);

	}
	public static void main(String[] args) {
		Smily exam=new Smily();
		
		JFrame frame=new JFrame("Smily");
		frame.add(exam);
		frame.setSize(400,500);
		frame.setVisible(true);
		frame.setLayout(null);
		
	}
	
}
