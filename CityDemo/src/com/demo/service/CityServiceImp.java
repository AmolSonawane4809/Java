package com.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.dao.*;

public class CityServiceImp implements CityService
{Scanner sc =new Scanner(System.in);
 CityDao cd =new CityDaoImpl(); 
	@Override
	public void Displayall() {
		cd.showall();
	}
	@Override
	public boolean addnewcity() {
		System.out.println("Enter the city");
		String city=sc.next();
		List<String> tree=new ArrayList<>();
		
		for(int i=1;i<4;i++) {
		System.out.println("Enter the treename");
		String tname=sc.next();
		tree.add(tname);
		
	}
		return cd.cityadd(city ,tree);
	}
	@Override
	public void Findcityname() {
		System.out.println("Enter the city");
		String city=sc.next();
		cd.findcity(city);
	}
	@Override
	public void addtree() 
	{
		System.out.println("Enter the city");
		String city=sc.next();
		System.out.println("Enter the treename");
		String tname=sc.next();
		cd.treeadd(city,tname);
	}
	@Override
	public void Findtreecity() {
		System.out.println("Enter the treename");
		String tname=sc.next();
		cd.findcitytree(tname);
	}
	@Override
	public void removecity() {
		System.out.println("entr city name which remove");
		String city=sc.next();
		cd.cityrmove(city);
	}
	@Override
	public void removetreefromcity()
	{
		System.out.println("select city");
		String city =sc.next();
		System.out.println("select tree which u remove");
		String tree =sc.next();
		cd.treeremovecity(tree ,city);
	}
	@Override
	public void counttree() {
		System.out.println("enter city");
		String city=sc.next();
		
		cd.treecount(city);
	}
	@Override
	public void sortcityname()
	{
		cd.sortbyname();
	}
	@Override
	public void sortbytname()
	{
		System.out.println("enter city");
		String city=sc.next();
		cd.sorttreename(city);
		
		
	}

}
