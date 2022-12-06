package com.demo.Dao;

import java.util.List;

public interface CustomerDao {

	void Showall();

	void addcustomers(String name, List<String> ls);

	void productfind(String name);

	void productadd(String name, String pname);

}
