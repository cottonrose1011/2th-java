package cacao;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class CacaoApp implements Observer{
	Server server;
	JFrame frame;
	
	JTextArea in;
	JTextArea out;
	
	public CacaoApp(Server s, String name) {
		this.server = s;
		server.register(this);
		
		frame = new JFrame(name);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(320,500);
		frame.setVisible(true);
		
		Container pane = frame.getContentPane();
		pane.setLayout(new BorderLayout()); //layout 설정
		
		in = new JTextArea();
		out = new JTextArea();
		JButton send = new JButton("send");
		send.addActionListener(new MyListener()); //신청서
		
		pane.add(in, BorderLayout.NORTH);
		pane.add(out, BorderLayout.CENTER);
		pane.add(send, BorderLayout.SOUTH);
	}

	@Override
	public void update(String msg) {
		in.setText(msg);
	}
	
	public class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String msg = out.getText();
			server.notify(msg);
			
		}
	}
	
}
