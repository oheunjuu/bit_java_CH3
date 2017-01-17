package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("dully");
		list.add("Michel");
		list.add("donut");
		
		//순회 1
		int count=list.size();
		for(int i=0;i<count;i++){
			String s=list.get(i);
			System.out.println(s);
		}
		
		//삭제
		list.remove(1);
		
		//순회 2
		Iterator<String> it =list.iterator();
		while(it.hasNext()){
			String s=it.next();
			System.out.println(s);
		}
		
		//순회 3
		
		for(String s: list){
			System.out.println(s);
		}
	}

}
