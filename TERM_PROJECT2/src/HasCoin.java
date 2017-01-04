import java.util.Scanner;

public class HasCoin implements State {

	private static HasCoin uniqueHasCoin;
	public VendingMachineMessages messages = new VendingMachineMessages();
	private static VendingMachine vendingMachine;

	private HasCoin() {

	}

	public static HasCoin getInstance(VendingMachine v) {
		if (uniqueHasCoin == null) {
			uniqueHasCoin = new HasCoin();
			vendingMachine=v;
		}
		return uniqueHasCoin;
	}

	public void insertMoney() {
		System.out.println("You cannot insert any other coin!");
	}

	public void ejectMoney() {
		// Return the customer’s coin and
		// transition back to the NoQuarterState.
		System.out.println("Coin returned.");
		vendingMachine.setState(vendingMachine.getNoCoin());	
		
	}

	public void refillMachine() {
		System.out.println("Already Vending Machine has water.");
	}

	public void dispenseWater() {
		System.out.println("No water dispensed");
	}

	public void dispenseCoin() {
		// TODO Auto-generated method stub
		System.out.println("No coin dispensed yet!");
	}

	public void selectWater() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter selection item;");
		System.out.println("        [1]  for 0.5lt water  \n"
				+ "        [2]  for 1 liter water");
		int n1 = sc.nextInt();
		vendingMachine.selection = n1;

		System.out.println("You selected .. ");
		vendingMachine.setState(vendingMachine.getSold());
		
	}
}