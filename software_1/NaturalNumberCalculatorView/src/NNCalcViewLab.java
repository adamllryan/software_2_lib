import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.*;
/**
 * Test class for NaturalNumber calculator GUI (view in MVC).
 * 
 * @author Put your name here
 */
public final class NNCalcViewLab extends JFrame implements ActionListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
     * Text areas.
     */
    private final JTextArea tTop, tBottom;
    

    /**
     * Operator and related buttons.
     */
    private final JButton bClear, bSwap, bEnter, bAdd, bSubtract, bMultiply,
            bDivide, bPower, bRoot;

    /**
     * Digit entry buttons.
     */
    private final JButton[] bDigits;

    /**
     * Useful constants.
     */
    private static final int TEXT_AREA_HEIGHT = 5, TEXT_AREA_WIDTH = 20,
            DIGIT_BUTTONS = 10, MAIN_BUTTON_PANEL_GRID_ROWS = 4,
            MAIN_BUTTON_PANEL_GRID_COLUMNS = 4,
            SIDE_BUTTON_PANEL_GRID_ROWS = 3,
            SIDE_BUTTON_PANEL_GRID_COLUMNS = 1, CALC_GRID_ROWS = 3,
            CALC_GRID_COLUMNS = 1;
    
    
    /**
     * No-argument constructor.
     */
    public NNCalcViewLab() {

        // Create the JFrame being extended

        /*
         * Call the JFrame (superclass) constructor with a String parameter to
         * name the window in its title bar
         */
        super("Natural Number Calculator");

        // Set up the GUI widgets --------------------------------------------
        
        /*
         * Create widgets
         */
        
        this.tTop = new JTextArea("", TEXT_AREA_HEIGHT, TEXT_AREA_WIDTH);
        this.tBottom = new JTextArea("", TEXT_AREA_HEIGHT, TEXT_AREA_WIDTH);
		this.bClear = new JButton("Clear");
		this.bSwap = new JButton("Swap");
		this.bEnter = new JButton("Enter");
		this.bAdd = new JButton("Add");
		this.bSubtract = new JButton("Subtract");
		this.bMultiply = new JButton("Multiply");
		this.bDivide = new JButton("Divide");
		this.bPower = new JButton("Power");
		this.bRoot = new JButton("Root");
		this.bDigits = new JButton[DIGIT_BUTTONS];
		
        // Set up the GUI widgets --------------------------------------------

        /*
         * Text areas should wrap lines, and should be read-only; they cannot be
         * edited because allowing keyboard entry would require checking whether
         * entries are digits, which we don't want to have to do
         */
		
		this.tTop.setLineWrap(true);
		this.tTop.setEditable(false);
		this.tTop.setLineWrap(true);
		this.tTop.setEditable(false);
		
        /*
         * Initially, the following buttons should be disabled: divide (divisor
         * must not be 0) and root (root must be at least 2) -- hint: see the
         * JButton method setEnabled
         */
		
		this.bDivide.setEnabled(false);
		this.bRoot.setEnabled(false);
		
        /*
         * Create scroll panes for the text areas in case number is long enough
         * to require scrolling
         */
		
		JScrollPane tTopScrollPane = new JScrollPane(this.tTop);
		JScrollPane tBottomScrollPane = new JScrollPane(this.tBottom);
		
        /*
         * Create main button panel
         */
		
		JPanel bMain = new JPanel(new GridLayout(MAIN_BUTTON_PANEL_GRID_ROWS,MAIN_BUTTON_PANEL_GRID_COLUMNS));
		
		
		/*
         * Add the buttons to the main button panel, from left to right and top
         * to bottom
         */
		for (int i = 0; i<10; i++) {
			bDigits[i] = new JButton(Integer.toString(i));
		}
		for (int i = 2; i>=0; i--) 
			for (int j = 1; j<=3; j++) 
				bMain.add(bDigits[i*3+j]);
		bMain.add(bDigits[0]);
        /*
         * Create side button panel
         */
		JPanel bCalc = new JPanel(new GridLayout(CALC_GRID_ROWS, CALC_GRID_COLUMNS));
		JPanel bSide = new JPanel(new GridLayout(SIDE_BUTTON_PANEL_GRID_ROWS, SIDE_BUTTON_PANEL_GRID_COLUMNS));
        /*
         * Add the buttons to the side button panel, from left to right and top
         * to bottom
         */
		bCalc.add(this.bAdd);
		bCalc.add(this.bSubtract);
		bCalc.add(this.bDivide);
		bCalc.add(this.bMultiply);
		bSide.add(this.bClear);
		bSide.add(this.bEnter);
		bSide.add(this.bSwap);
		
        /*
         * Create combined button panel organized using flow layout, which is
         * simple and does the right thing: sizes of nested panels are natural,
         * not necessarily equal as with grid layout
         */
		
		JPanel bCombined = new JPanel(new FlowLayout());
		
        /*
         * Add the other two button panels to the combined button panel
         */
		
		
		
		bCombined.add(bMain);
		bCombined.add(bSide);
		bCombined.add(bCalc);
        /*
         * Organize main window
         */
		

		this.setLayout(new GridLayout(3,1));
		
        /*
         * Add scroll panes and button panel to main window, from left to right
         * and top to bottom
         */
		

		this.add(tTopScrollPane);
		this.add(tBottomScrollPane);
		this.add(bCombined);
		
		
        // Set up the observers ----------------------------------------------

        /*
         * Register this object as the observer for all GUI events
         */
		
		this.bEnter.addActionListener(this);
		this.bClear.addActionListener(this);
		this.bSwap.addActionListener(this);
		for (JButton b : bDigits) {
			b.addActionListener(this);
		}

        // Set up the main application window --------------------------------

        /*
         * Make sure the main window is appropriately sized, exits this program
         * on close, and becomes visible to the user
         */
		
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JOptionPane.showMessageDialog(this,
                "You pressed: " + event.getActionCommand());
    }

    /**
     * Main method.
     * 
     * @param args
     *            the command line arguments; unused here
     */
    public static void main(String[] args) {
        NNCalcViewLab view = new NNCalcViewLab();
    }

}