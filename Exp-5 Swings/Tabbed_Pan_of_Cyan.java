package Lab5;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Tabbed_Pan_of_Cyan {
	JFrame frame;
	Tabbed_Pan_of_Cyan() {
	      frame = new JFrame("Color Tabbed Pane Example");
	      JPanel cyanPanel = new JPanel();
	      cyanPanel.setBackground(Color.CYAN);

	      JPanel magentaPanel = new JPanel();
	      magentaPanel.setBackground(Color.MAGENTA);

	      JPanel yellowPanel = new JPanel();
	      yellowPanel.setBackground(Color.YELLOW);

	       JTabbedPane tabbedPane = new JTabbedPane();
	       tabbedPane.add("Magenta", magentaPanel);
	       tabbedPane.add("Yellow", yellowPanel);
	       tabbedPane.add("Cyan", cyanPanel);
	       frame.add(tabbedPane);
	       frame.setSize(400, 400);
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setVisible(true);
	    }
	    public static void main(String[] args) {
	        new Tabbed_Pan_of_Cyan();
	    }
}
