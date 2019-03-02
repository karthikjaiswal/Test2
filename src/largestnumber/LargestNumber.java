package largestnumber;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		LargestNumber l=new LargestNumber();
		l.calculateNextLarge(sc.nextInt(), sc.nextInt());

	}


	public void calculateNextLarge(int num,int digit)
	{ int temp=num,rem=0;
	
	while(temp!=0) {
		rem=temp%10;
		if(rem==digit)
		{
			num--;
			temp=num;
			continue;
		}
		temp=temp/10;
	}
	System.out.println(num);

	}
}