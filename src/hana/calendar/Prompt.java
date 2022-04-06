package hana.calendar;

import java.util.Scanner;

public class Prompt {
	private final static String PROMPT = "> ";

	public void runPrompt() {
		Scanner s1 = new Scanner(System.in);
		caleadar_sample cal1 = new caleadar_sample();
		int i=1;
		while (true) {
			System.out.println("알고싶은 달의 수를 쓰세요");
			System.out.print(PROMPT);
			i = s1.nextInt();
			int[] arr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

			if (i == -1) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			if (i < 1) {
				System.out.println("잘못입력하셨습니다");
				continue;
			}
			if (i > 12) {
				System.out.println("잘못입력하셨습니다");
				continue;
			}
			cal1.printCalendar(2017, i);
		}
		//System.out.printf("%d월은 %d일까지 입니다\n", i,i - 1);

	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
		// 두 함수에대한 설명이 없다 왜 들어가는지만이라도 알려주면 좋을텐데
	}

}
