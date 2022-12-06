package com.demo.Test;

import java.util.Scanner;

import com.demo.service.*;

public class CustomerTest {

	public static void main(String[] args) {
		CustomerService cs = new CustomerServiceImpl();
		int choice=0;
		Scanner sc=new Scanner (System.in);
		do {


			System.out.println("1.add Customer \n2. find Products by Customer \n3.add new Product in exusting Customer \n4.display all "
					+ "\n5.Exit");
			System.out.println("entr the choice");
			choice=sc.nextInt();
			
			switch (choice) 
			{
			
			
			case 1:cs.addcustomer();
			break;
			case 2:cs.findproduct();
				break;
			case 3:cs.addnewproduct();	
			break;
			case 4:
				cs.Displayall();
				break;

			default:
				break;
			}
	}while(choice!=5);

}
}
