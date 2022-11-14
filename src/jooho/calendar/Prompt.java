package jooho.calendar;

import java.util.Scanner;

public class Prompt {
	
	public int parseDay(String weekDay) {
		
		/**
		 * 
		 * @param week 요일명
		 * @return 0~6(0 = Sunday, 6 = Saturday)
		 */
		if (weekDay.equals("sun")) return 0;
		else if (weekDay.equals("mon")) return 1;
		else if (weekDay.equals("tue")) return 2;
		else if (weekDay.equals("wed")) return 3;
		else if (weekDay.equals("thu")) return 4;
		else if (weekDay.equals("fri")) return 5;
		else if (weekDay.equals("sat")) return 6;
		else 
			return 0;
	}
		
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		int month = 1;
		int year = 2017;
		
		while (true) {
			System.out.println("연도를 입력하세요. exit: -1");
			System.out.print("Year> ");
			year = scanner.nextInt();
			if(year == -1) {
				break;
			}
			
			System.out.println("달을 입력하세요. ");			
			System.out.print("Month> ");
			month = scanner.nextInt();
			
			if (month > 12 || month < 1) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			cal.printCalendar(year, month);
		}
		
		System.out.println("Bye~~");
		scanner.close();
	}
	public static void main(String[] args) {
		// 쉘 실행
		
		Prompt p =  new Prompt();
		p.runPrompt();
		}
	}
