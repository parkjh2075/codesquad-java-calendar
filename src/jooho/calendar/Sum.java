package jooho.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
	int a, b;
	// �Է� : Ű����� �� ���� �Է¹޴´�.
	// ��� : ȭ�鿡 �μ��� ���� ����Ѵ�.
	Scanner scanner = new Scanner(System.in);
	// Ű����� �Է¹��� ���� new Scanner()�� ()�ȿ� System.in�� ���ֱ�
	String s1, s2;
	System.out.println("�� ���� �Է��� �ּ���.");
	s1 = scanner.next();
	s2 = scanner.next();
	a = Integer.parseInt(s1); // Integer : ������ Ŭ����
	b = Integer.parseInt(s2); // �Է¹��� ���ڴ� String�����̱� ������ ���������� ��ȯ
							  // Integer.parseInt(����) ǥ�� ���
	// System.out.println(s1 + ", " + s2);
	// int c = a + b;
	// System.out.println("�� ���� ���� " + (a + b) + "�Դϴ�.");
	System.out.printf("�� ���� ���� %d�Դϴ�.", a + b); // 20,21��° ���� ������ �� ��
	}
}
