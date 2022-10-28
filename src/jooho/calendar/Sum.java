package jooho.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
	int a, b;
	// 입력 : 키보드로 두 수를 입력받는다.
	// 출력 : 화면에 두수의 합을 출력한다.
	Scanner scanner = new Scanner(System.in);
	// 키보드로 입력받을 때는 new Scanner()의 ()안에 System.in을 써주기
	String s1, s2;
	System.out.println("두 수를 입력해 주세요.");
	s1 = scanner.next();
	s2 = scanner.next();
	a = Integer.parseInt(s1); // Integer : 정수형 클래스
	b = Integer.parseInt(s2); // 입력받은 숫자는 String형태이기 때문에 정수형으로 변환
							  // Integer.parseInt(변수) 표현 사용
	// System.out.println(s1 + ", " + s2);
	// int c = a + b;
	// System.out.println("두 수의 합은 " + (a + b) + "입니다.");
	System.out.printf("두 수의 합은 %d입니다.", a + b); // 20,21번째 줄을 간단히 한 것
	}
}
