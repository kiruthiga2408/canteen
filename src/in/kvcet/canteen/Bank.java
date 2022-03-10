package in.kvcet;
class Bank {
	public int interestRate = 5;
	
	public Bank() {
		System.out.println("Bank-" + interestRate);
	}
	
	public void display() {
		System.out.println("Bank Display interest Rate-" + interestRate);
	}
}

class IciciBank extends Bank {

	public IciciBank() {
		this.interestRate = 6;
		System.out.println("IciciBank - " + interestRate);
	}
}

class IndianBank extends Bank {

	public IndianBank() {
		super();
		this.interestRate = 8;
		System.out.println("IndianBank - " + interestRate);
	}
	

	@Override
	public void display() {
		System.out.println("My IndianBank Display interest Rate-" + interestRate);
	}
}

public class TestBank {

	public static void main(String[] args) {
		
		IndianBank bank = new IndianBank();
		bank.display();

	}
}
	