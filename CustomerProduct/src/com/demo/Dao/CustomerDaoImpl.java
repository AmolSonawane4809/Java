package com.demo.Dao;

import java.util.*;

public class CustomerDaoImpl implements CustomerDao{
	static Map<String ,List <String>> CusP;
	static {
		CusP=new HashMap<>();
		List<String> plst1 = new ArrayList<>();
		plst1.add("Lux");
		plst1.add("Complain");
		plst1.add("Fake Hairs");
		plst1.add("Brain");
		CusP.put("Akshay", plst1);
		List<String> plst2 = new ArrayList<>();
		plst2.add("Black Fillter");
		plst2.add("Clomex");
		plst2.add("Advance");
		plst2.add("Chota Light");
		CusP.put("Maddy", plst2);
		
	}
	@Override
	public void Showall() {
		//System.out.println(CusP);
		List<String> l=null;
		for (String  s : CusP.keySet()) {
			System.out.println("Customer Is :--> "+s);
			l=CusP.get(s);
			System.out.println("Product is :");
			for(int i =0;i<l.size();i++)
			{
				System.out.println("\t"+i+" "+l.get(i));
			}
		}
		
		
	}
	@Override
	public void addcustomers(String name, List<String> ls) 
	{
		CusP.put(name,ls);
		
	}
	@Override
	public void productfind(String name) {
		List<String> ls=CusP.get(name);
		for(int i=0;i<=ls.size();i++)
		{
			System.out.println("\t"+i+" "+ls.get(i));
		}
	}
	@Override
	public void productadd(String name,String pname) {
		List<String> ls=CusP.get(name);
	
		ls.add(pname);
		System.out.println("roduct added");
		System.out.println(pname);
	}

}
