package hana.calendar;

import java.util.Scanner;

public class caleadar5 {
	public static void main(String[] args) {
		String PROMPT="cal>";//프롬프트를 입력할경우 문자열 cal>이 등장한다
		int[] arr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("몇월이 며칠까지 있는지 궁금한가요?");
		System.out.print(PROMPT);//프롬프트를 프린트한다는 명령어 ""는 쓰면안된다!
		//int month =1;
		while (true) {
			Scanner s2 = new Scanner(System.in);
			int b = s2.nextInt();
			if (b == -1) {
				System.out.println("프로그램을 종료합니다");
				System.out.println("have a nice day~");
				break;}
			if (b < 1) {
				System.out.println("잘못입력하셨습니다");
				continue;}//새로운 명령어를 배웠다! 계속 반복하라는 명령어! 이게 있으면 이경우에는 else if를 쓸필요가 없다
			if (b > 12) {
				System.out.println("잘못입력하셨습니다");
				continue;
				}
			else {
				System.out.printf("%d월은 %d일까지 있습니다\n", b, arr[b - 1]);
				}
			
			}}}
		
		
	
			
