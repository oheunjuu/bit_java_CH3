package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		FileReader fr=null;
		FileInputStream fis=null;
		try{
			//문자열 단위로 읽음 
			int count=0;
			fr=new FileReader("1234.txt");
			int data=-1;
			while((data=fr.read()) != -1){
				count++;
				System.out.println((char)data);
			}
			
			System.out.println(count);
			System.out.println("==============");
			
			//바이트 단위로 읽음 
			count=0;
			fis=new FileInputStream("1234.txt");
			while((data=fis.read())!=-1){
				
				count++;
				System.out.println((char)data);
			}
			
		}
		catch(FileNotFoundException e){
			System.out.println("No File");
		}catch(IOException ioe){
			System.out.println("Reading Error");
		}finally{
			try{
				
				if(fr !=null){
					fr.close();
				}
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
		}
	}

}
