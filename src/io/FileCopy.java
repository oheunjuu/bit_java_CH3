package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("mong.jpg");
			fos = new FileOutputStream("mong2.jpg");

			int data = 0;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}

			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다. " + e);
		} catch (IOException ioe) {
			System.out.println("I/O error" + ioe);
		} finally {
			try {
				if (fis != null) {

					fis.close();
				}
				if (fos != null) {
					fos.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
