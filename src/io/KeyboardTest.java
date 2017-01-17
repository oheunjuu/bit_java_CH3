package io;

import java.io.*;

public class KeyboardTest {

	public static void main(String[] args) {
		// 기반 스트림은 System.in (표준입력, 키보드 사용)
		BufferedReader br = null;
		try {

			InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");

			br = new BufferedReader(isr);

			String line = null;
			while (true) {
				System.out.print(">>");
				line = br.readLine();
				if ("exit".equals(line)) {
					break;
				}
				System.out.println(line);
			}

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
