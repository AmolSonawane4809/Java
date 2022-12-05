package com.demo.test;

import java.util.Scanner;

import com.demo.service.*;

public class CityDemoTest {

	public static void main(String[] args)
	{
		CityService cs=new CityServiceImp();
		int choice=0;
		Scanner sc=new Scanner (System.in);
		do {


			System.out.println("1.add city \n2. find tree city \n3.add new tree in exusting city \n4.display all \n.5"
					+ "find all city from give tree \n6. diplay sorted order of city name \n7.display no of tree in city \n8"
					+ "remove tree  from city \n9.remove city \n10.sort by treename from city \n11 .exit");

			System.out.println("entr the choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1 :
				boolean status =cs.addnewcity();
				if(status)
				{
					System.out.println("new city is added");
				}
				else {
					System.out.println("not added");
				}
				break;
			case 2 :
				cs.Findcityname();
				break;
			case 3:
				cs.addtree();
				
				break;
			case 4 :
				
				cs.Displayall();
				break;
			case 5 :
				cs.Findtreecity();
				break;
			case 6 :
				cs.sortcityname();
				break;
			case 7 :
				cs.counttree();
				break;
			case 8 :cs.removetreefromcity();
				break;
			case 9 :
				cs.removecity();
				break;
			case 10 :
				cs.sortbytname();
				break;
			case 11:
				
				break;
			default:
				System.out.println("wrong choice");
				break;
			}

			
		} while (choice !=10);
	}

}
