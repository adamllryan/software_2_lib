package tictactoe;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class tictactoe {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Tic Tac Toe");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(300,300);
	    frame.setLayout(new GridLayout(3, 3));
        
	    JButton[][]buttons = new JButton[3][3];
	    
	    for (int i = 0; i < 3; i++) {
	        for (int k = 0; k < 3; k++) { 
	        	buttons[i][k] = new JButton((i) + "-" + (k));
                buttons[i][k].putClientProperty("column", i);
                buttons[i][k].putClientProperty("row", k);
                buttons[i][k].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    	JButton tempB = (JButton) e.getSource();
                    	int x = (int) tempB.getClientProperty("column");
                        int y = (int) tempB.getClientProperty("row");
                        if (turn == 0) {
                        	buttons[x][y].setText("X");
                        	turn = 1;
                        } else {
                        	buttons[x][y].setText("O");
                        	turn = 0;
                        }
                        
                        
                        buttons[x][y].setEnabled(false);
                    	
                    	
                    }});
	        	frame.add(buttons[i][k]);
	        } 
	        
	    } 
	    
	    frame.setVisible(true);
    }
	public int getTurn()
	
	
}
