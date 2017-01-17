package bit_java_CH3;

public class WrapperClassTest02 {

	public static void main(String[] args) {
		Character c='A';
		
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.isDigit('B'));
		System.out.println(Character.isDigit('g'));
		
		int i=Integer.parseInt("-1234");
		System.out.println(i);
		
		System.out.println(Integer.parseInt("f",16));
		System.out.println(Integer.toBinaryString(256));
		System.out.println(Integer.toHexString(255));
		System.out.println(Double.parseDouble("44.13e-16"));
		System.out.println(Long.parseLong("123456789"));
		
	}

}
