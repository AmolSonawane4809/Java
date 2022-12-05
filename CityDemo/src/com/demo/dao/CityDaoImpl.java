package com.demo.dao;

import java.util.*;

public class CityDaoImpl implements CityDao {
	Scanner sc =new Scanner (System.in);
	static Map<String ,List<String>> clis;
	static {
		clis=new HashMap<>();
		List<String> tlist1 =new ArrayList<String>();
		tlist1.add("Mango");
		tlist1.add("Neem");
		tlist1.add("Lemon");
		//Arrays.asList("Mango","Neem","Lemon");
		//ist1.addAll(new String ({"Mango","Neem","Lemon"}));
		clis.put("Pune",tlist1);
		List<String> tlist2 =Arrays.asList("Mango","Coconut","Banana");
		clis.put("Mumbai", tlist2);


	}
	@Override
	public void showall() {
		//System.out.println(clis);
		List<String> l = null;
		if (clis.isEmpty()) {
			System.out.println("EMPTY");
		} else {

			for (String s : clis.keySet()) {
				System.out.println("City :"+s);
				l=clis.get(s);
				for (int i = 0; i < l.size(); i++) {
					System.out.println(l.get(i));
				}
				System.out.println("=============================");
			}


		}
	}
	@Override
	public boolean cityadd(String city,List<String> tree) 
	{
		if (!clis.containsKey(city)) {
			clis.put(city, tree);
			return true;
		}


		return false;
	}
	@Override
	public void findcity(String city) {
		if(clis.containsKey(city)) {
			System.out.println(" city found");
			System.out.println(city+" = "+clis.get(city));
		}else {
			System.out.println("not found");
		}

	}
	@Override
	public void treeadd(String city, String tname) 
	{
		if(clis.containsKey(city))
		{
			List<String> lst=clis.get(city);
			System.out.println(lst + "  " + lst.size());
			if (lst!=null) {
				if (!lst.contains(tname)){
					lst.add(tname);


					System.out.println("added");
				}
				else {
					System.out.println("already available");
				}
			}

		}
		else {
			System.out.println("not add");
		}
	}
	@Override
	public void findcitytree(String tname) {
		List<String> city= new ArrayList<>();

		for (Map.Entry<String, List<String>> e: clis.entrySet()) {
			if(e.getValue().contains(tname)) {
				city.add(e.getKey());
			
				
			}
		}
		System.out.println(city);
	}
	@Override
	public void cityrmove(String city) {

		if (clis.containsKey(city)) {
			clis.remove(city);
			System.out.println("Removed");
		}
		else
			System.out.println("Not Found");
	}
	@Override
	public void treeremovecity(String tree, String city)
	{
		List<String> ls=clis.get(city);
		if(ls!=null) {
			ls.remove(tree);
			System.out.println("tree removed");
		
		}
		else {
			System.out.println("empty list");
		}
	}
	@Override
	public void treecount(String city)
	{
		List <String> ls =clis.get(city);
		System.out.println("Count is "+ls.size());
	}
	@Override
	public void sortbyname()
	{
		TreeMap<String ,List<String>> sort= new TreeMap<>();
		sort.putAll(clis);
		System.out.println(sort);
		
	}
	@Override
	public void sorttreename(String city) {
     List< String > ts=new ArrayList<>();	
     ts.addAll(clis.get(city));
     Collections.sort(ts);
     System.out.println(ts);
	}

}

