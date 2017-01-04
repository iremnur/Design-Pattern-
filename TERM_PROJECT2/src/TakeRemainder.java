public class TakeRemainder implements State {
	double remainderOfCoin;
	private static TakeRemainder uniqueTakeRemainder;
	VendingMachineMessages messages;
	public static VendingMachine vendingMachine;

	private TakeRemainder() {
		this.messages = new VendingMachineMessages();
	}

	public static TakeRemainder getInstance(VendingMachine v) {
		if (uniqueTakeRemainder == null) {
			uniqueTakeRemainder = new TakeRemainder();
			vendingMachine =v;
		}
		return uniqueTakeRemainder;
	}

	public void insertMoney() {
		// TODO Auto-generated method stub
		System.out.println("Already Vending Machine has water.");
	}

	public void ejectMoney() {
		// TODO Auto-generated method stub
		System.out.println("Sorry,you do not take your coin");
	}

	public void dispenseWater() {
		// TODO Auto-generated method stub
		System.out.println("Your water already is dispensed");
	}

	public void dispenseCoin() {

		if (vendingMachine.getCount() > 0) {
			vendingMachine.setState(vendingMachine.getNoCoin());
		} else {
			vendingMachine.setState(vendingMachine.getSoldOut());
		}

		// Enter 1, If the 0.5 l water is selected
		if (vendingMachine.selection == 1) {
			if (vendingMachine.currentlyInsertedMoney > vendingMachine.littleWaterPrice) {
				remainderOfCoin = (vendingMachine.currentlyInsertedMoney - vendingMachine.littleWaterPrice);
				System.out.println("Please, take your remaining coin "+remainderOfCoin);
			}
		}
		// Enter 2, If the 1 liter of water is selected
		else {
			if (vendingMachine.currentlyInsertedMoney > vendingMachine.oneLiterWaterPrice) {
				remainderOfCoin = (vendingMachine.currentlyInsertedMoney - vendingMachine.oneLiterWaterPrice);
				System.out.println("Please, take your remaining coin "+remainderOfCoin);
			}

		}


	}

	public void refillMachine() {
		// TODO Auto-generated method stub
		System.out.println("Already Vending Machine has water.");
	}

	public void selectWater() {
		// TODO Auto-generated method stub
		System.out.println("You already select water");
	}


}
