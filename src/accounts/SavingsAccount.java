package accounts;

import java.util.Scanner;

public class SavingsAccount extends FixedAccount{

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount s=new SavingsAccount();
		System.out.println("enter savings balance");
		long savings_balance=sc.nextLong();
		s.calculateInterest(savings_balance);
		
		FixedAccount f=new FixedAccount();
		System.out.println("enter fixed balance");
		long fixed_balance=sc.nextLong();
		f.calculateInterest(fixed_balance);
	}

	@Override
	public void calculateInterest(long savings_balance) {

		System.out.println("enter no.of years");
		int time=sc.nextInt();
		long savingInterest=(savings_balance*time*2)/100;
		System.out.println("Interest on fixed balance is :"+savingInterest);
		
	}
	

}
