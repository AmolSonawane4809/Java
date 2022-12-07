package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.demo.servise.FileService;
import com.demo.servise.FileServiceImpl;

public class FileHandlingTest {

	public static void main(String[] args)
	{
		FileService p = new FileServiceImpl();
		p.fileinpu();
		p.fileBuff();
		
		
	}

}
