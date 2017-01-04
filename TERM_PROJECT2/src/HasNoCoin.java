import java.util.Scanner;

public class HasNoCoin implements State {

	private static HasNoCoin uniqueHasNoCoin;
	private static VendingMachine vendingMachine;
	VendingMachineMessages messages;
	Scanner sc;

	private HasNoCoin() {

		this.messages = new VendingMachineMessages();
	}

	public static HasNoCoin getInstance(VendingMachine v) {
		if (uniqueHasNoCoin == null) {
			uniqueHasNoCoin = new HasNoCoin();
			vendingMachine = v;
		}
		return uniqueHasNoCoin;
	}

	public void insertMoney() {

		System.out.print("Please enter the amount of coin : ");
		sc = new Scanner(System.in);
		double n = sc.nextDouble();
		vendingMachine.currentlyInsertedMoney = n;
		System.out.println(messages.hasMoneyInsert+" "+n);
		vendingMachine.setState(vendingMachine.getHasCoin());
		System.out.println("You have successfully inserted  "+n);
	}

	public void ejectMoney() {
		// You can’t get money back if you never gave it to us!
		System.out.println("No money has been inserted.");
	}

	public void refillMachine() {
		System.out.println("Already the machine has water.");
	}

	public void dispenseWater() {
		// TODO Auto-generated method stub
		System.out.println("You need to pay!");

	}

	public void dispenseCoin() {
		// TODO Auto-generated method stub
		System.out.println("You need to pay the required amount of money!");
	}

	public void selectWater() {
		System.out.println("There is no coin");
	}

}
