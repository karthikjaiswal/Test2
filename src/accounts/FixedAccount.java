package accounts;

import java.util.Scanner;

public class FixedAccount {

	Scanner sc=new Scanner(System.in);
	public void calculateInterest(long fixed_balance) 
	{
			System.out.println("enter no.of years");
			int time=sc.nextInt();
			long Interest=(fixed_balance*time*4)/100;
			System.out.println("Interest on fixed balance is :"+Interest);
	}

}
