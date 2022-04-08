package hana.calendar;

import java.util.Scanner;

public class Prompt {
private final static String PROMPT=">";
public void runPrompt() {
	Scanner s1=new Scanner(System.in);
	int mon=1;
	int year=2017;
	String b="su";
	caleadar_sample cs=new caleadar_sample();
	while(true) {
		System.out.println("년도를입력하세요");
		System.out.print("year> ");
		year=s1.nextInt();
		if(year==-1) {System.out.println("프로그램을 종료합니다");
		break;}
		System.out.println("달을 입력하세요");
		System.out.print("month> ");
		mon=s1.nextInt();
		System.out.println("시작 요일을 입력하세요 su mo tu...");
		System.out.print("> ");
		b=s1.next();
		if(mon==-1) {System.out.println("프로그램을 종료합니다");
		break;}
		if(mon<1||mon>12) {System.out.println("잘못된입력입니다");
		continue;}
		cs.printcalendar(year, mon, b);
		
	
	}
}
public static void main(String[]args) {
	Prompt p=new Prompt();
	p.runPrompt();
} 
}
