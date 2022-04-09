package hana.calendar;

import java.util.Scanner;

public class Prompt {
	public int pd(String week) {
		if(week.equals("su"))
		return 0;
		else if(week.equals("mo")) return 1;
		else if(week.equals("tu")) return 2;
		else if(week.equals("we")) return 3;
		else if(week.equals("th")) return 4;
		else if(week.equals("fr")) return 5;
		else if(week.equals("sa")) return 6;
		else if(week.equals("-1")) return -1;
		else return 7;
	
	}

public void runPrompt() {
	Scanner s1=new Scanner(System.in);
	int mon=1;
	int year=2017;
	int week=0;
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
		if(mon==-1) {System.out.println("프로그램을 종료합니다");
		break;}
		if(mon<1||mon>12) {System.out.println("잘못된입력입니다");
		continue;}
		System.out.println("요일입력 su mo..");
		System.out.print("> ");
		String str_week = s1.next();
		week=pd(str_week);
		if(week==-1) {System.out.println("종료합니다"); break;}
		cs.printcalendar(year, mon, week);
		
	
	}
}
public static void main(String[]args) {
	Prompt p=new Prompt();
	p.runPrompt();
} 
}
