import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;


public class ArrowKeys {


	public ArrowKeys() {
		
		
		JFrame frame = new JFrame();
	
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setFocusable(true);
		
		
		JPanel panel = new JPanel();
		JLabel up = new JLabel();
		JLabel down = new JLabel();
		JLabel right = new JLabel();
		JLabel left = new JLabel();
		
		
		
		panel.add(up);
		panel.add(down);
		panel.add(right);
		panel.add(left);
		
		up.setText("up: 0");
		down.setText("down: 0");
		right.setText("right: 0");
		left.setText("left: 0");
		
		frame.addKeyListener(new KeyListener() {
			
			int countUp = 0;
			int countDown = 0;
			int countRight = 0;
			int countLeft = 0;

			@Override
			public void keyTyped(KeyEvent e) {				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch(keyCode) {
				case KeyEvent.VK_UP:
					up.setText("Up: " + Integer.toString(countUp++));
					break;
				case KeyEvent.VK_DOWN:
					down.setText("Down: " + Integer.toString(countDown++));
					break;
				case KeyEvent.VK_RIGHT:
					right.setText("Right: " + Integer.toString(countRight++));
					break;
				case KeyEvent.VK_LEFT:
					left.setText("Left: " + Integer.toString(countLeft++));
					break;
					
				}
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			
			
		});	
		
		
		
		
		
		frame.add(panel); 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ArrowKeys();

		
	}

}
