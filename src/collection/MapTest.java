package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<String,Integer> map= new HashMap<String ,Integer>();
		
		map.put("둘리", new Integer(100));
		map.put("마이콜", 90); //자동으로 박싱처리 해줌 auto boxing -->new Integer(90) 해줌 
		map.put("도우넛", 17);
		map.put("희동이", 95);
		
		Integer score1 = map.get("마이콜");
		System.out.println(score1);
		
		int score2=map.get("희동이");
		System.out.println(score2); //auto unboxing이 일어남.
		
		//평균
		Set<String> keySet=map.keySet(); //set 객체를 리턴해 달라.
		int count=keySet.size();
		
		
		int sum=0;
		Iterator<String> it =keySet.iterator();
		while(it.hasNext()){
			String key=it.next();
			//System.out.println(key);
			int score=map.get(key);
			System.out.println(key+":"+score);
			sum+=score;
		}
		System.out.println("average: "+sum/count);
		
	}

}
