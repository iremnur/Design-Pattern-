import java.util.Scanner;

public class WaterSoldOut implements State {

	private static WaterSoldOut uniqueWaterSoldOut;
	VendingMachineMessages messages;
	private static VendingMachine vendingMachine;

	private WaterSoldOut() {
		this.messages = new VendingMachineMessages();
	}

	public static WaterSoldOut getInstance(VendingMachine v) {
		if (uniqueWaterSoldOut == null) {
			uniqueWaterSoldOut = new WaterSoldOut();
			vendingMachine = v;
		}
		return uniqueWaterSoldOut;
	}

	public void insertMoney() {
		// TODO Auto-generated method stub
		System.out.println("Sorry,you cannot insert a coin! The machine is empty");
	}

	public void ejectMoney() {
		// TODO Auto-generated method stub
		System.out.println("No money has been inserted");
	}


	public void refillMachine() {
		System.out.println("Please enter the number of water to add : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		vendingMachine.count = n;
		System.out.println(n + " cola is added");
		vendingMachine.setState(vendingMachine.getNoCoin());
		System.out.println("Already Vending Machine has water.");
	}

	public void dispenseCoin() {
		
	}

	public void selectWater() {
		System.out.println(messages.noWater);

	}

	public void dispenseWater() {
		
	}

}
