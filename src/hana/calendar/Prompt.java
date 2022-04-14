package hana.calendar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prompt {
	
	public void printmenu(){
		System.out.println("+---------------+");
		System.out.println("|1.일정 등록");
		System.out.println("|2.일정 검색");
		System.out.println("|3.달력 보기");
		System.out.println("|h.도움말 q.종료");
		System.out.println("+---------------+");
//		System.out.println("명령 (1,2,3,h,q");
	}
	public void runPrompt() {
		printmenu();
		Scanner scanner = new Scanner(System.in);
		
		caleadar_sample cs = new caleadar_sample();
while (true) {
	System.out.println();
	System.out.println("명령 (1,2,3,h,q)");
		String cmd=scanner.next();
		if(cmd.equals("1")) cmdRegister();
		else if (cmd.equals("2"))  cmdSerch();
		else if (cmd.equals("3")) cmdCal1(scanner, cs);
		else if (cmd.equals("h")) printmenu();
		else if (cmd.equals("q")) break;
	}
	System.out.println("thank you");
	scanner.close();
	}
	
		private void cmdCal1(Scanner s, caleadar_sample cs) {
			
			int mon = 1;
			int year = 2017;
			int week = 0;
		while (true) {
			System.out.println("년도를입력하세요");
			System.out.print("year> ");
			year = s.nextInt();
			if (year == -1) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			System.out.println("달을 입력하세요");
			System.out.print("month> ");
			mon = s.nextInt();
			if (mon == -1) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			if (mon < 1 || mon > 12) {
				System.out.println("잘못된입력입니다");
				continue;
			}

			
			cs.printcalendar(year, mon);
			return;

		}
		
		
		
	}

	private void cmdCal() {
		// TODO Auto-generated method stub
		
	}
	private void cmdSerch() {
		// TODO Auto-generated method stub
		
	}
	private void cmdRegister() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
