package com.demo.dao;

import java.util.List;

public interface CityDao {

	void showall();

	boolean cityadd(String city, List<String> tree);

	void findcity(String city);

	void treeadd(String city, String tname);

	void findcitytree(String tname);

	void cityrmove(String city);

	void treeremovecity(String tree, String city);

	void treecount(String city);

	void sortbyname();

	void sorttreename(String city);

}
