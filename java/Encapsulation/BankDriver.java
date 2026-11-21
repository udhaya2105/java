package Encapsulation;

public class BankDriver {
public static void main(String[] args) {
	Bank b1=new Bank();
	b1.setActHolderName("Udhaya");
	System.out.println(b1.getActHolderName());
	b1.setBalance(1000000);
	System.out.println(b1.getbalance());
}
}
class Bank{
	private String actholdname;
	private double balance;
	public void setActHolderName(String actholdname)
	{
		this.actholdname=actholdname;
	}
	public String getActHolderName() {
		return actholdname;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getbalance()
	{
		return balance;
	}
	
}
