package bit_java_CH3;

public class PointTest {
	public static void main(String[] args){
		Point pt=new Point(100,200);
		
		System.out.println(pt.getClass());
		System.out.println(pt.hashCode());
		
		//pt.getClass().getName() + "@"+pt.hashCode() -->숫자는 16진수로 변경되서 나
		System.out.println(pt.toString());
		//동일함 
		System.out.println(pt);
		
		
		//비교 String 객체 
		String s = new String("Hello");
		System.out.println(s.getClass());
		System.out.println(s.hashCode());
		System.out.println(s.toString());
	}
}	
