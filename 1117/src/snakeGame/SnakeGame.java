package snakeGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SnakeGame {
	JFrame jFrame = new JFrame("Snake Game");
	int WIDTH=64, HEIGHT=48, SCALE = 10, SPEED = 50;
	int x=20, y=10;
	int xStep=1, yStep=0;
	
	Madi food = new Madi(0, 0);
	
	ArrayList<Madi> snake = new ArrayList<>();
	
	public SnakeGame() {
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(WIDTH*SCALE, HEIGHT*SCALE);
		jFrame.getContentPane().add(new GamePanel());
		
		
		snake.add(new Madi(x, y));
		snake.add(new Madi(x -1, y));
		snake.add(new Madi(x -2, y));
		snake.add(new Madi(x -3, y));
		
		food = new Madi((int)(Math.random()*WIDTH), (int)(Math.random()*HEIGHT));
		
		jFrame.addKeyListener(new GameListener());
		
		
		jFrame.setVisible(true);
	}
	
	
	public void go() {
		while(true) {
			x+=xStep;
			y+=yStep;
			
			if((x== food.getX())&&(y==food.getY())) {
				Madi newMadi = new Madi(0,0);
				snake.add(newMadi);
				food = new Madi((int)(Math.random()*WIDTH), (int)(Math.random()*HEIGHT));
				
			}
			
			for(int i= snake.size()-1; i > 0; i--) {
				snake.get(i).setX(snake.get(i-1).getX());
				snake.get(i).setY(snake.get(i-1).getY());
			}
			
			
			snake.get(0).setX(x);
			snake.get(0).setY(y);
			
			try {
				Thread.sleep(SPEED);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			jFrame.repaint();
		}
	}
	
	class GamePanel extends JPanel {
		public void paintComponent(Graphics g) {
			g.setColor(Color.RED);
			for(Madi madi: snake) {
				g.fillRect(madi.getX()*SCALE, madi.getY()*SCALE, SCALE, SCALE);
			}
			
			g.setColor(Color.WHITE);
			for(Madi madi: snake) {
				g.drawRect(madi.getX()*SCALE, madi.getY()*SCALE, SCALE, SCALE);
			}
			
			g.setColor(Color.BLUE);
			g.fillRect(food.getX()*SCALE, food.getY()*SCALE, SCALE, SCALE);
		}
	}
	class GameListener implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_UP:
				xStep=0;
				yStep=-1;
				break;
			case KeyEvent.VK_DOWN:
				xStep=0;
				yStep=1;
				break;
			case KeyEvent.VK_LEFT:
				xStep=-1;
				yStep=0;
				break;
			case KeyEvent.VK_RIGHT:
				xStep=1;
				yStep=0;
				break;
			default:
				break;
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class Madi{
		int x=0, y=0;
		
		public Madi(int x, int y) {this.x=x; this.y=y;}
		public int getX() {return x;}
		public void setX(int x) {this.x = x;}
		public int getY() {return y;}
		public void setY(int y) {this.y = y;}
	}
}
