package button;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MButton {
	JButton button;
	
	public void go() {
		JFrame frame = new JFrame();
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button = new JButton("버튼");
		button.addActionListener(new MyListener());
		JLabel label = new JLabel("선생님");
		
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(label);
		
		panel.setSize(100, 100);
		panel.setBackground(Color.green);
		
		frame.getContentPane().add(panel);
		
		frame.setVisible(true);
	}
	
	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			button.setText("짜잔");
		}
	}
}





