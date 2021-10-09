package src;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class color extends JFrame{
	private JPanel panel;
	private final int w = 300;
	private final int h = 150;
	private JLabel label;
	private JButton button;
	private JButton blue;
	
	public color() {
		setTitle("color");
		setSize(w,h);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel("I will turn a color");
		button = new JButton("purple");
		blue = new JButton("blue");
		button.addActionListener(new purplescreen());
		blue.addActionListener(new bluescreen());
		panel = new JPanel();
		panel.add(label);
		panel.add(button);
		panel.add(blue);
		add(panel);
		setVisible(true);
		
		
	}
	private class purplescreen implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.MAGENTA);
			
			
		}
}
	private class bluescreen implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.BLUE);	
		}
}
}