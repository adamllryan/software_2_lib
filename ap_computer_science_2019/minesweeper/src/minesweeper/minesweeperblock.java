package minesweeper;import javax.swing.*;import java.awt.event.KeyEvent;import java.awt.event.KeyListener;import java.
lang.Math.*;import java.awt.*;import java.awt.event.ActionEvent;import java.awt.event.ActionListener;import java.util.
Random;import java.util.Scanner;public class minesweeperblock {public static void main(String args[]) {Random r = new 
Random();JFrame frame = new JFrame("Minesweeper");frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);Scanner reader 
= new Scanner(System.in);System.out.print("Enter SIZE of grid: ");final int SIZE = reader.nextInt();frame.setSize(75 *
SIZE, 75 * SIZE);boolean[][] mineposition = new boolean[SIZE + 2][SIZE + 1];int j = 0;int mines = (SIZE * SIZE / 3);
System.out.println(mines);boolean mineGen[][] = new boolean[SIZE][SIZE];while (j < mines) {int minex = r.nextInt(SIZE);
int miney = r.nextInt(SIZE);if (mineGen[minex][miney] == false) {mineGen[minex][miney] = true;j++;System.out.println(
"set mine at: " + minex + ", " + miney);}}for (int i = 0; i < SIZE; ++i) {for (int k = 0; k < SIZE; k++)mineposition[i]
[k] = mineGen[i][k];}frame.setLayout(new GridLayout(SIZE, SIZE));JButton[][] buttons;buttons = new JButton[SIZE][SIZE];
for (int i = 0; i < SIZE; i++) {for (int k = 0; k < SIZE; k++) {buttons[i][k] = new JButton((i) + "-" + (k));buttons[i]
[k].putClientProperty("column", i);buttons[i][k].putClientProperty("row", k);buttons[i][k].addActionListener(new ActionListener() 
{@Override public void actionPerformed(ActionEvent e) {JButton tempB = (JButton) e.getSource();int x = (int) tempB.getClientProperty("column")
;int y = (int) tempB.getClientProperty("row");System.out.println(x + " " + y);System.out.println("Pressed (" + x + ", "
+ y + ")");if (mineposition[x][y] == true) {System.out.println("bruh");buttons[x][y].setText("bruh");buttons[x][y].setEnabled(
false);for (int z = 0; z < SIZE; z++) {for (int z1 = 0; z1 < SIZE; z1++) {System.out.println("Revealing (" + z + ", " +
z1 + ")");if (mineposition[z][z1] == true) {System.out.println("bruh");buttons[z][z1].setText("bruh");buttons[z][z1].
setEnabled(false);} else {if (buttons[z][z1].getText().indexOf('-') == 1)buttons[z][z1].setText("");buttons[z][z1].
setEnabled(false);}}}} else {buttons[x][y].setText("");buttons[x][y].setEnabled(false);for (int i = 0; i < 8; i++) {
int count = 0, g = -1, h = -1;if(i==0){g=x-1;h=y-1;}if(i==1){g=x;h=y-1;}if(i==2){g=x+1;h=y-1;}if(i==3){g=x+1;h=y;}if(
i==4){g=x+1;h=y+1;}if(i==5){g=x;h=y+1;}if(i==6){g=x-1;h=y+1;}if(i==7){g=x-1;h=y;}System.out.print("Checking " + g + "-"
+ h + "/" + x + "-" + y);if(g>0 && h>0 && g<=SIZE && h<SIZE)if(mineposition[g-1][h-1]==true)count++;if(g>0 && h>0 && g<=
SIZE && h<SIZE)if(mineposition[g][h-1]==true)count++;if(g>0 && h>0 && g<=SIZE && h<SIZE)if(mineposition[g+1][h-1]==true
)count++;if(g>0 && h>0 && g<=SIZE && h<SIZE)if(mineposition[g+1][h]==true)count++;if(g>0 && h>0 && g<=SIZE && h<SIZE)if
(mineposition[g+1][h+1]==true)count++;if(g>0 && h>0 && g<=SIZE && h<SIZE)if(mineposition[g][h+1]==true)count++;if(g>0 &&
h>0 && g<=SIZE && h<SIZE)if(mineposition[g-1][h+1]==true)count++;if(g>0 && h>0 && g<=SIZE && h<SIZE)if(mineposition[g-1
][h]==true)count++;System.out.println(", found " + count + " mines");if (g > 0 && h > 0 && g < SIZE && h < SIZE)if (!
buttons[g][h].getText().equals("") && !buttons[g][h].getText().equals("bruh"))buttons[g][h].setText(String.valueOf(count
));}}}});frame.add(buttons[i][k]);frame.setVisible(true);reader.close();}}}}