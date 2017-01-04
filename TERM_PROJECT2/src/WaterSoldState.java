public class WaterSoldState implements State {

	private static WaterSoldState uniqueWaterSoldState;
	VendingMachineMessages messages;
	private static VendingMachine vendingMachine;

	private WaterSoldState() {
		this.messages = new VendingMachineMessages();
	}

	public static WaterSoldState getInstance(VendingMachine v) {
		if (uniqueWaterSoldState == null) {
			uniqueWaterSoldState = new WaterSoldState();
			vendingMachine =v;
		}
		return uniqueWaterSoldState;
	}

	public void insertMoney() {
		// TODO Auto-generated method stub
		System.out.println("Please wait, already giving you a water.");
	}

	public void ejectMoney() {
		// TODO Auto-generated method stub
		System.out.println("Sorry,you do not take your coin");
	}

	public void dispenseWater() {

		// Enter 1, If the cans of cola is selected
		if (vendingMachine.selection == 1) {
			if (vendingMachine.currentlyInsertedMoney < vendingMachine.littleWaterPrice) {
				vendingMachine.setState(vendingMachine.getNoCoin());
				System.out.println("Insufficent funds. Ejecting Money");
			} else {

				vendingMachine.setState(vendingMachine.getRemainder());
				vendingMachine.countDecrease();
				System.out.println("Enjoy your 0.5 lt water");

			}
		}
		// Enter 2, If the 1 liter of cola is selected
		else if (vendingMachine.selection == 2) {
			if (vendingMachine.currentlyInsertedMoney < vendingMachine.oneLiterWaterPrice) {
				vendingMachine.setState(vendingMachine.getNoCoin());
				System.out.println("Insufficent funds. Ejecting Money");
			}

			else {
				vendingMachine.setState(vendingMachine.getRemainder());
				vendingMachine.countDecrease();
				System.out.println("Enjoy your 0.5 lt water");
			}
		}
		
	}

	public void refillMachine() {
		// TODO Auto-generated method stub
		System.out.println("Already Vending Machine has water.");
	}

	public void dispenseCoin() {
		// TODO Auto-generated method stub
		System.out.println("You only take water not coin");
	}

	public void selectWater() {
		System.out.println("You already select a water.");

	}

}
