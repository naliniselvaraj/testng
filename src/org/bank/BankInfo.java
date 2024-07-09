package org.bank;

public class BankInfo extends AxisBank {
private void savings() {
System.out.println("Savings=1000000");
}
private void fixed() {
System.out.println("FIxed=500000");
}
@Override
	public void deposit() {
System.out.println("Axis Bank Deposit=500000");
	}
public static void main(String[] args) {
	BankInfo bi = new BankInfo();
	bi.savings();
	bi.fixed();
	bi.deposit();
}
}
