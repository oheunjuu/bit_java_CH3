package bit_java_CH3;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateTest {

	public static void main(String[] args) {
		Date now= new Date();
		printDate(now);
		printDate2(now);
		
		Date d1= new Date(100,0,16);
		printDate(d1);
		
		Date d2=new Date(100,0,16,13,25,30);
		printDate(d2);
		
	}
	public static void printDate(Date d){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		System.out.println(sdf.format(d));
		
	}
	
	public static void printDate2(Date d){
		//년도 +1900
		int year = d.getYear(); //deprecated , 사용하지 말라는 권고 
		//월 (0-11)
		int month=d.getMonth();
		//일
		int day=d.getDay();
		//시
		int hour=d.getHours();
		//분
		int minute=d.getMinutes();
		//초
		int seconds=d.getSeconds();
		
		System.out.println((year+1900)+"년 "+(month+1)+"월 "+day+"일 "+hour+"시 "+minute+"분 "+seconds+"초 ");
		
	}
}
