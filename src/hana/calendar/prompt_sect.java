package hana.calendar;

import java.util.Scanner;

public class prompt_sect {
	public void printmenu(){
		System.out.println("+---------------+");
		System.out.println("|1.일정 등록");
		System.out.println("|2.일정 검색");
		System.out.println("|3.달력 보기");
		System.out.println("|h.도움말 q.종료");
		System.out.println("+---------------+");
	
	}

	public void runPrompt() {
		printmenu();
		Scanner s1 = new Scanner(System.in);
		int mon = 1;
		int year = 2017;
		int week = 0;
		caleadar_sample cs = new caleadar_sample();
		System.out.println("명령 (1,2,3,h,q");
		String order=s1.next();
		if (order.equals("1")) {
			System.out.println("날짜를 입력하세요");
			String order_day=s1.next();
		}
		
//		while (true) {
//			System.out.println("년도를입력하세요");
//			System.out.print("year> ");
//			year = s1.nextInt();
//			if (year == -1) {
//				System.out.println("프로그램을 종료합니다");
//				break;
//			}
//			System.out.println("달을 입력하세요");
//			System.out.print("month> ");
//			mon = s1.nextInt();
//			if (mon == -1) {
//				System.out.println("프로그램을 종료합니다");
//				break;
//			}
//			if (mon < 1 || mon > 12) {
//				System.out.println("잘못된입력입니다");
//				continue;
//			}
//
//			
//			cs.printcalendar(year, mon);

//		}
	}

	public static void main(String[] args) {
		prompt_sect p1 = new prompt_sect();
		p1.runPrompt();
	}
}
