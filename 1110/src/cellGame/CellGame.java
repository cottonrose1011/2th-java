package cellGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CellGame {
	JFrame frame = new JFrame("Cell Game");
	int WIDTH = 1024, HEIGHT = 768;
	int x = 10, y = 10 , radius=10, speed = 1;
	
	ArrayList<Jewels> jewels = new ArrayList<>();
	
	public CellGame() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(WIDTH, HEIGHT);
		
		frame.getContentPane().add(new GamePanel());
		frame.addKeyListener(new GameKeyListener());
		
		
		frame.setVisible(true);
	}
	
	public void go() {
		
		for(int i=0; i<100; i++) {
			jewels.add(new Jewels());
		}
		
		while(true) {
			
			Iterator<Jewels> alba = jewels.iterator();
			while(alba.hasNext()) {
				Jewels jewel = alba.next();
				double distance = Math.sqrt((x - jewel.getX())*(x - jewel.getX())+(y - jewel.getY())*(y - jewel.getY()));
				if(distance < radius) {
					radius ++;
					speed++;
					alba.remove();
				}
			}
			
			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			frame.repaint(); //강제호출해서 keyPress로 x,y 값 변하게함
		}
		
	}
	
	class GamePanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			for(Jewels j: jewels) {
				g.setColor(j.getColor());
				g.fillRect(j.getX(), j.getY(), j.getWidth(), j.getWidth());
			}
			
			g.setColor(Color.GREEN); 
			g.fillOval(x, y, 2*radius, 2*radius);
			
		}
	}
	
	private class Jewels {

		int x=0, y=0, width = 0;
		Color color;
		
		public Jewels() {
			x = (int)(Math.random()*WIDTH);
			y = (int) (Math.random()*HEIGHT);
			color = new Color((int) (Math.random()*0XFFFFFF)); // color의 색을 랜덤하게 뽑아 객체 생성
			width = 4 + (int) (Math.random()*6);
			
		}
		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}

		public int getWidth() {
			return width;
		}

		public Color getColor() {
			return color;
		}
	}
	
	class GameKeyListener implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_UP:
				y--;
				break;
			case KeyEvent.VK_DOWN:
				y++;
				break;
			case KeyEvent.VK_LEFT:
				x--;
				break;
			case KeyEvent.VK_RIGHT:
				x++;
				break;
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
