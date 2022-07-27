package abstraction;
import inheritance.Bank;

public class AxisBank extends StockTrade implements Bank{
	
	public void buyStock(){
		System.out.println("Stock is bought");
	}
	public void depositMoney() {
		System.out.println("Axis Bank Money deposited");
	}

	public void withdrawMoney() {
		System.out.println("Axis Bank Money withdrawn");
	}

}
