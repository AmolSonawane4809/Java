package com.demo.servise;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileServiceImpl implements  FileService
{

	@Override
	public void fileinpu() {
		try(FileInputStream fis =new FileInputStream("abc.dat");
				FileOutputStream fos =new FileOutputStream("abc1.dat",true);){
			
				int s = fis.read();
		
				while (s!=-1) {
					fos.write(s);
					s = fis.read();
				}
				
			}
			catch (IOException e) {
			System.out.println("File Not Found");
			}
		
	}

	@Override
	public void fileBuff() {
		System.out.println("Buffer Input Stream");
		try(BufferedInputStream bis =new BufferedInputStream(new FileInputStream("abc.dat"));
				BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream("abc1.dat",true));){
			
				int s = bis.read();
		
				while (s!=-1) {
					bos.write(s);
					s = bis.read();
				}
				
			}
			catch (IOException e) {
			System.out.println("File Not Found");
			}
		
	}

}
