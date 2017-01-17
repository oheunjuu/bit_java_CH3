package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<String> v= new Vector<String>();
		
		v.addElement("둘리 ");
		v.addElement("마이콜 ");
		v.addElement("도우넛 ");
		
		//순회 1
		int count =v.size();
		for(int i=0;i<count;i++){
			String s=v.elementAt(i);
			System.out.print(s+" ");
		}
		System.out.println();
		//삭제
		v.removeElementAt(1);
		
		//순회 2
		Enumeration<String> enumeration = v.elements();
		while(enumeration.hasMoreElements()){
			String s=enumeration.nextElement();
			System.out.print(s+" ");
		}
	}

}
