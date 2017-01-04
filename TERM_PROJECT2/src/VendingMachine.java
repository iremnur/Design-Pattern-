//Ýrem Nur SERDAR
//165101109
public class VendingMachine {

	/** Vending Machine States. */
	State noCoin;
	State hasCoin;
	State soldOut;
	State sold;
	State remainder;

	State state;
	int count = 0;

	double littleWaterPrice = 1.00;
	double oneLiterWaterPrice = 2.00;
	int selection;// choose water
	/** The currently inserted money. */
	double currentlyInsertedMoney = 0.00;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public VendingMachine(int numOfWater) {

		this.remainder = TakeRemainder.getInstance(this);
		this.noCoin = HasNoCoin.getInstance(this);
		this.hasCoin = HasCoin.getInstance(this);
		this.soldOut = WaterSoldOut.getInstance(this);
		this.sold = WaterSoldState.getInstance(this);
		this.count = numOfWater;
		// If there are more than 0 waters we set the state to the NoCoin.
		if (numOfWater > 0) {
			this.state = noCoin;
		}
		// If there is no more water we set the state to the WaterSoldOut.
		else
			this.state = soldOut;
	}

	public State getState() {
		return this.state;
	}

	public void setState(State currentState) {
		this.state = currentState;
	}

	// delegates job to the State method
	public void insert() {

		this.state.insertMoney();

	}

	// delegates job to the State method
	public void eject() {

	 this.state.ejectMoney();

	}

	// delegates job to the State method
	public void selectWater() {

		state.selectWater();
		state.dispenseWater();
		state.dispenseCoin();

	}

	// delegates job to the State method
	public void refillMachine() {
		 this.state.refillMachine();
	}

	// Getters of States
	public State getNoCoin() {
		return noCoin;
	}

	public State getHasCoin() {
		return hasCoin;
	}

	public State getSoldOut() {
		return soldOut;
	}

	public State getSold() {
		return sold;
	}

	public State getRemainder() {
		return remainder;
	}

	public void countDecrease() {

		if (count != 0) {
			count = count - 1;
		}
	}

}
