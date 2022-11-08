package jooho.calendar;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if (year % 4 ==0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;
	}
	public int getMaxDaysOfMonth(int year, int month) { // "maxDaysOfMonth"를 함수로 빼준 것
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		} else {
		return MAX_DAYS[month - 1];
		}
	}

	public void printCalendar(int year, int month, int weekDay) {
		System.out.printf("    <<%4d%3d>>\n", year, month);
		System.out.println(" 일  월   화  수  목  금  토");
		System.out.println("-----------------------");
		
		//print blank space
		for(int i = 0; i < weekDay; i++) {
			System.out.print("   ");
		}
		
		int maxDay = getMaxDaysOfMonth(year, month);
		int count = 7 - weekDay;
		int delim = (count < 7) ? count : 0;
		/*과 같은의미
		 int delim;
		 if (count < 7) {
		 delim = count;
		 } else {
		 delim = 0;
		 */ 
		
		//print first line
		for(int i = 1; i <= count; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		
		//print from second line to last line
		
		count++;
		for(int i = count; i <= weekDay; i++) {
			System.out.printf("%3d", i);
			if(i % 7 == delim) {
				System.out.println();
			}
		}
		
		for(int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if(i % 7 == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
		
//		System.out.println(" 1   2  3   4  5  6   7");
//		System.out.println(" 8   9 10  11 12  13 14");
//		System.out.println("15  16 17  18 19  20 21");
//		System.out.println("22  23 24  25 26  27 28");
	}
}