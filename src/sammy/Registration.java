package sammy;

import java.util.ArrayList;
import java.util.Scanner;

public class Registration {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		
		ArrayList<UserDetails> userdetail=new ArrayList<>();
		int age=sc.nextInt();
		if(age<20 || age>55)
		{
			System.out.println("The employee is not eligible");
		}
		else
		{
			userdetail.add(setInfo(age));
		}
		
	}
	public static UserDetails setInfo(int age)
	{
		
		UserDetails user=new UserDetails();
		System.out.println("enter name");
		user.setName(sc.next());
		user.setAge(age);
		System.out.println("enter contact");
		user.setContact(sc.nextLong());

		return user;
	}

}
