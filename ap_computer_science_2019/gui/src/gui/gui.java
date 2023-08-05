/*
Adam Ryan 3
Moga
22Aug2019
Mailing list or something
*/
package gui;
import java.awt.Container;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
public class gui {
	public static void main(String[] args) {
		// it says some stuff
		JFrame gui = new JFrame();
		gui.setTitle("yeet");
		gui.setSize(1920,1080);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel n = new JPanel();
		n.setBackground(Color.red);
		JPanel e = new JPanel();
		e.setBackground(Color.red);
		JPanel s = new JPanel();
		s.setBackground(Color.red);
		JPanel w = new JPanel();
		w.setBackground(Color.red);
		gui.setVisible(true);
		JPanel c = new JPanel();
		c.setBackground(Color.white);
		Container pane = gui.getContentPane();
		pane.add(n, BorderLayout.NORTH);
		pane.add(e, BorderLayout.EAST);
		pane.add(s, BorderLayout.SOUTH);
		pane.add(w, BorderLayout.WEST);
	}}
/*
Enter the degrees Fahrenheit: -40
The equivalent in celsius is -40
Enter the degrees Fahrenheit: 212
The equivalent in celsius is 100
 */




