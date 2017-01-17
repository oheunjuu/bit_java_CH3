package bit_java_CH3;

public class StringTest03 {

	public static void main(String[] args) {
		String a= "aBcAbCabcABC";
		
		//charAt
		System.out.println(a.charAt(2));
		
		//indexOf
		System.out.println(a.indexOf("abc"));
		System.out.println(a.indexOf("xyz")); //-1 return해준다. 
		
		//length()
		System.out.println(a.length());
		
		//치환 replace
		System.out.println(a.replace('a','R')); //이때만 바뀐다. 다시 a를 호출하면 원래 스트링 나옴. 아니면 새로운 변수에 저장 
		System.out.println(a);
		
		
		//치환 replaceAll
		System.out.println(a.replaceAll("abc","123"));
		
		//substring
		System.out.println(a.substring(0,3)); //endindex 부분 +1 해줘야 원하는 자리까지 출력된다. 
		
		//toLowerCase()
		System.out.println(a.toLowerCase());
		
		//toUpperCase()
		System.out.println(a.toUpperCase());
		
		String str1=" abcd";
		String str2=",efg ";
		
		//concat: 문자열
		str1=str1.concat(str2);
		System.out.println(str1);
		
		//trim : 앞 뒤의 공백 제거 (중간에 있는 공백은 사라지지 않음, 앞뒤 공백만 제거)
		System.out.println(str1.trim()+"@");
		
		//split 문자열 분리 
		String str3="ab cd";
		String[] result=str1.split(",");
		for(String s: result){
			System.out.println(s);
		}
		
		String[] result2=str3.split(",");
		for(String s1: result2){
			System.out.println(s1);  //찾는 문자가 없으면 원래 문자열 반환 
		}
		
	}

}
