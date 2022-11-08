package jooho.calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT = "cal> "; //������ �ȵǴ� ���� final static���� ���� ���
	
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		int month = -1;
		int year = -1;
		
		while (true) {
			System.out.println("������ �Է��ϼ��� : ");
			System.out.print("Year> ");
			year = scanner.nextInt();
			System.out.println("���� �Է��ϼ��� : ");			
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
		// �� ����
		
		Prompt p =  new Prompt();
		p.runPrompt();
		}
	}
