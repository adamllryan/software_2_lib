import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber2;

/**
 * Controller class.
 *
 * @author Put your name here
 */
public final class NNCalcController1 implements NNCalcController {

    /**
     * Model object.
     */
    private final NNCalcModel model;

    /**
     * View object.
     */
    private final NNCalcView view;

    /**
     * Useful constants.
     */
    private static final NaturalNumber TWO = new NaturalNumber2(2), INT_LIMIT = new NaturalNumber2(Integer.MAX_VALUE);

    /**
     * Updates this.view to display this.model, and to allow only operations
     * that are legal given this.model.
     *
     * @param model
     *            the model
     * @param view
     *            the view
     * @ensures [view has been updated to be consistent with model]
     */
    private static void updateViewToMatchModel(NNCalcModel model, NNCalcView view) {
    	view.updateTopDisplay(model.top());
    	view.updateBottomDisplay(model.bottom());
    	if (model.bottom().compareTo(INT_LIMIT)>0) {
    		//if bottom>INT_LIMIT disable power and root button
    		view.updatePowerAllowed(false);
    		view.updateRootAllowed(false);
    	} else {
    		view.updatePowerAllowed(true);
    		//if bottom<=2 set disable root
    		view.updateRootAllowed(model.bottom().compareTo(TWO)>=0? true : false);
    	}
    	//disable divide if bottom is 0
    	view.updateDivideAllowed(model.bottom().compareTo(new NaturalNumber2(0))!=0 ? true : false);
    	//disable subtract if top<bottom
    	view.updateSubtractAllowed(model.bottom().compareTo(model.top())<0 ? true : false);
    }

    /**
     * Constructor.
     *
     * @param model
     *            model to connect to
     * @param view
     *            view to connect to
     */
    public NNCalcController1(NNCalcModel model, NNCalcView view) {
        this.model = model;
        this.view = view;
        updateViewToMatchModel(model, view);
    }

    @Override
    public void processClearEvent() {
        /*
         * Get alias to bottom from model
         */
        NaturalNumber bottom = this.model.bottom();
        /*
         * Update model in response to this event
         */
        bottom.clear();
        /*
         * Update view to reflect changes in model
         */
        updateViewToMatchModel(this.model, this.view);
    }

    @Override
    public void processSwapEvent() {
        /*
         * Get aliases to top and bottom from model
         */
        NaturalNumber top = this.model.top();
        NaturalNumber bottom = this.model.bottom();
        /*
         * Update model in response to this event
         */
        NaturalNumber temp = top.newInstance();
        temp.transferFrom(top);
        top.transferFrom(bottom);
        bottom.transferFrom(temp);
        /*
         * Update view to reflect changes in model
         */
        updateViewToMatchModel(this.model, this.view);
    }

    @Override
    public void processEnterEvent() {
    	//top=bottom
    	this.model.top().copyFrom(this.model.bottom());
        updateViewToMatchModel(this.model, this.view);
    }

    @Override
    public void processAddEvent() {
    	//add bottom to top then transfer top to bottom
    	NaturalNumber top = this.model.top();
    	NaturalNumber bottom = this.model.bottom();
    	top.add(bottom);
    	bottom.transferFrom(top);
        updateViewToMatchModel(this.model, this.view);
    }

    @Override
    public void processSubtractEvent() {
    	//subtract bottom from top then transfer to bottom
    	NaturalNumber top = this.model.top();
    	NaturalNumber bottom = this.model.bottom();
    	top.subtract(bottom);
    	bottom.transferFrom(top);
        updateViewToMatchModel(this.model, this.view);
    }

    @Override
    public void processMultiplyEvent() {
    	//multiply top from bottom then transfer to bottom
    	NaturalNumber top = this.model.top();
    	NaturalNumber bottom = this.model.bottom();
    	top.multiply(bottom);
    	bottom.transferFrom(top);
        updateViewToMatchModel(this.model, this.view);
    }

    @Override
    public void processDivideEvent() {
    	//divide top by bottom, store remainder in i, then transfer top to bottom and transfer i to top
    	NaturalNumber top = this.model.top();
    	NaturalNumber bottom = this.model.bottom();
    	NaturalNumber i = top.divide(bottom);
    	bottom.transferFrom(top);
    	top.transferFrom(i);
        updateViewToMatchModel(this.model, this.view);
    }

    @Override
    public void processPowerEvent() {
    	//top^bottom after converting bottom to int
    	NaturalNumber top = this.model.top();
    	NaturalNumber bottom = this.model.bottom();
    	top.power(bottom.toInt());
    	bottom.transferFrom(top);
        updateViewToMatchModel(this.model, this.view);
    }

    @Override
    public void processRootEvent() {
    	//top^(1/bottom) after converting bottom to int
    	NaturalNumber top = this.model.top();
    	NaturalNumber bottom = this.model.bottom();
    	top.root(bottom.toInt());
    	bottom.transferFrom(top);
        updateViewToMatchModel(this.model, this.view);
    }

    @Override
    public void processAddNewDigitEvent(int digit) {
    	//multiply bottom by ten then add digit
    	NaturalNumber bottom = this.model.bottom();
    	bottom.multiplyBy10(digit);
    	updateViewToMatchModel(this.model, this.view);
    }

}
