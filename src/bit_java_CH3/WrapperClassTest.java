package bit_java_CH3;

public class WrapperClassTest {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		Character c = new Character('a');
		Float f = new Float(3.14);
		Boolean v = new Boolean(true);
		
		
		//auto boxing
		//자동으로 new Integer(10) 이 생긴다. 
		Integer j= 10;
		
		//auto unboxing
		//int k=10+j.intValue();
		int k= 10+j;
		
		//swap(new Integer(10),new Integer(20));
		swap(10,20);
		
		
		
	}

	public static void swap(int a ,int b){
		//이런 방식으로는 객체이지만
		//절대 바뀌지 않는다.
		//이유는  wrapper 객체는 내부를 수정할 수 없기 때문에 
	}
}
