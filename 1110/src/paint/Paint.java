package paint;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Paint {
	int x = 100;
	int y = 100;

	public void go() {
		JFrame frame = new JFrame("그림 그리기");
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new MyPanel());
		
		frame.setVisible(true);
		
		int step = 2;
		while (true) {
			if (x > (600 - 50)) {
				step = -2;
			} else if (x < 0) {
				step = 2;
			}
			
			x += step;
//			y += 2;
			
			frame.repaint();
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			g.setColor(Color.blue);
			g.fillOval(x, y, 50, 50);
		}
	}
}
