package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 利用throws声明异常
 * @author dell
 *
 */

public class Test03 {
	public static void main(String[] args) throws IOException {
		readMyFile();
	}
	public static void readMyFile()throws IOException {
		FileReader reader=null;
		System.out.println("1");
		reader=new FileReader("e:/b.txt");
		System.out.println("2");
		char c1=(char)reader.read();
		System.out.println(c1);
		if(reader!=null) {
			reader.close();
		}
	}	
}
