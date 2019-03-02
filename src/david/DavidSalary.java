package david;

import java.util.Scanner;

public class DavidSalary {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter basic salary");
		long basic_salary=sc.nextLong();
		DavidSalary d=new DavidSalary();
		d.calculateTotalSalary(basic_salary);

	}

	private void calculateTotalSalary(long basic_salary) {
		
		long hra=basic_salary/2;
		long special_allowance=(75/100)*basic_salary;
		long PF_deduction=(12/100)*basic_salary;
		
		long total_sal=hra+special_allowance-PF_deduction;
		
		System.out.println("The net payable salary is:"+ total_sal);
		
	}

}
