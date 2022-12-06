package com.demo.service;

import java.util.*;

import com.demo.Dao.*;

public class CustomerServiceImpl implements CustomerService {
	Scanner sc =new Scanner (System.in);
	CustomerDao cd = new CustomerDaoImpl();
	@Override
	public void Displayall() {
		cd.Showall();
		
	}
	@Override
	public void addcustomer()
	{
		System.out.println("entr the customer name");
		 String name=sc.nextLine();
		 
		 List<String> ls=new ArrayList<>();
		 for(int i=0;i<=3;i++) {
		 System.out.println("enter the product name");
		 String pname=sc.next();
		 ls.add(pname);
		 }
		 cd.addcustomers(name ,ls);
		 
	}
	@Override
	public void findproduct()
	{
		System.out.println("enter the customer name");
		String name=sc.nextLine();
		cd.productfind(name);
		
	}
	@Override
	public void addnewproduct() 
	{
		System.out.println("enter the customer name");
		String name=sc.nextLine();
		System.out.println("entrr the product");
		String pname=sc.next();
		cd.productadd(name,pname);
	}

}
