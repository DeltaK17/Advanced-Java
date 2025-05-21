package Lab4;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mouse_Operations {
	JLabel messageLabel;
	Mouse_Operations() {
		 JFrame frame = new JFrame("Mouse Event Example");

		        
		  messageLabel = new JLabel("Click on the button to test mouse events");
		  messageLabel.setBounds(30, 30, 400, 30);
		  messageLabel.setFont(new Font("Arial", Font.PLAIN, 16));

		        
		   JButton button = new JButton("Click Me!");
		   button.setBounds(150, 100, 120, 50);

		        
		   button.addMouseListener(new MouseAdapter() {
		    @Override
		     public void mousePressed(MouseEvent e) {
		      messageLabel.setText("Mouse Down (Pressed)");
		            }

		          @Override
		           public void mouseReleased(MouseEvent e) {
		               messageLabel.setText("Mouse Up (Released)");
		            }

		            @Override
		            public void mouseClicked(MouseEvent e) {
		                if (e.getClickCount() == 2) {
		                    messageLabel.setText("Double Click Detected");
		                } else if (e.getClickCount() == 1) {
		                    messageLabel.setText("Single Click Detected");
		                }
		            }
		        });

		        
		    frame.add(messageLabel);
		    frame.add(button);

		        
		    frame.setSize(450, 250);
		    frame.setLayout(null);
		    frame.setVisible(true);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    }

		    public static void main(String[] args) {
		        new Mouse_Operations();
		    }
}
