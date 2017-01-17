package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos=null;
		try{
			
			bos=new BufferedOutputStream(new FileOutputStream("./src/io/1234.txt"),5);
			
			
			//char c='0';
			for(int i='0';i<'9';i++){
			//for(int i=48;i<57;i++){ //아스키 코드 값 
				bos.write(i);
				bos.flush();
				
			}
			
			
		}catch(FileNotFoundException e){
			System.out.println("file opening fail: "+e);
		}catch(IOException e){
			System.out.println("file opening fail: "+e);
		}finally{
			try{
				if(bos !=null){
					bos.close();
				}
			}catch(IOException e){
				System.out.println("file closing fail: "+e);
			}
		}
	}

}
