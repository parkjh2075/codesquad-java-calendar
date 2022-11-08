package jooho.calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT = "cal> "; //변경이 안되는 것을 final static으로 많이 사용
	
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		int month = -1;
		int year = -1;
		
		while (true) {
			System.out.println("연도를 입력하세요 : ");
			System.out.print("Year> ");
			year = scanner.nextInt();
			System.out.println("달을 입력하세요 : ");			
			System.out.print("Month> ");
			month = scanner.nextInt();
			
			if(month == -1) {
				break;
			}
			 
			if (month > 12) {
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
