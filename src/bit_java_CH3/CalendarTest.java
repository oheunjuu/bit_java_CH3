package bit_java_CH3;
import java.util.Calendar;


public class CalendarTest {

	public static void main(String[] args) {
		
		//Calendar cal = new Calendar(); //추상 클래스이기 때문에 생성 불가능 
		Calendar cal = Calendar.getInstance();
		printDate(cal);
		
		//특정 날짜 세팅하기
		cal.set(Calendar.YEAR,2015);
		cal.set(Calendar.MONTH,11);
		cal.set(Calendar.DATE,12);
		
		printDate(cal);
		
		//기념일
		cal.set(2015,03,14); //2015.04.14
		cal.add(Calendar.DATE,100);
		
		printDate(cal);
		
	}
	public static void printDate(Calendar cal){
		
		String[] days={" ","월","화","수","목","금","토","일"};
		
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH);
		int date=cal.get(Calendar.DATE);
		int day=cal.get(Calendar.DAY_OF_WEEK);
		int hour=cal.get(Calendar.HOUR);
		int minutes=cal.get(Calendar.MINUTE);
		int seconds=cal.get(Calendar.SECOND);
		
		System.out.println(year+" "+(month+1)+" "+date+" "+day+" "+hour+" "+minutes+" "+seconds);
	}

}
