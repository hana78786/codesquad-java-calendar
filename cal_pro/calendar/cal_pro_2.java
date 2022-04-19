package calendar;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class cal_pro_2 {

	
	public static void printmenu() {
		System.out.println("+-------------+");
		System.out.println("| 1. 일정등록");
		System.out.println("| 2. 일정검색");
		System.out.println("| 3. 달력보기");
		System.out.println("| h. 도움말  q.종료");
		System.out.println("+-------------+");
	}
			
		
		
	
	public void runprompt() throws ParseException {
		cal_pro_2 cp2=new cal_pro_2();
		cla_pro_1 cp1=new cla_pro_1();
		printmenu();
		boolean loop=true;
		while(loop) {
			System.out.println("명령(1,2,3,h,q)");
			System.out.print(">");
			Scanner sc=new Scanner(System.in);
			String cmd=sc.next();
			switch(cmd) {
			case "1": cp2.cal_1(sc, cp1);break;
			case "2": cp2.cal_2(sc, cp1);break;
			case "3": cp2.cal_print();break;
			case "h": cp2.help(sc);break;
			case "q": System.out.println("종료합니다");loop=false;
			}}}
	
	private void cal_2(Scanner sc,cla_pro_1 cp1) {
		System.out.println("[일정검색]");
		System.out.println("날짜를 입력하세요 yyyy-MM-dd");
		System.out.print(">");
		String date=sc.next();
		String plan="";
		try {
			plan=cp1.searchPlan(date);
		} catch (ParseException e) {
			e.printStackTrace();System.err.println("오류");
		}
		
		System.out.printf(plan);
		System.out.println();

	

		
	}




	private void help(Scanner sc) {
		System.out.println("도움말");
		System.out.println("번호를 입력하고 날짜를 바르게 입력해주세요");
		return;
		
		
	}




	private void cal_1(Scanner sc,cla_pro_1 cp1) throws ParseException {
		System.out.println("[일정입력]");
		System.out.println("날짜를 입력하세요 yyyy-MM-dd");
		System.out.print(">");
		String strdate=sc.next();
		String plan="";
		sc.nextLine();
		System.out.println("일정을 입력해주세요");
		System.out.print(">");
		plan=sc.nextLine();
		cp1.plan(strdate, plan);
		
		
		
		
	}




	public void cal_print() {
		while(true) {
			System.out.println("년도를 입력하세요");
			System.out.print(">");
			Scanner s=new Scanner(System.in);
			int year=s.nextInt();
			if(year==-1) {System.out.println("종료합니다");break;}
			System.out.println("월을 입력하세요");
			System.out.print(">");
			int mon=s.nextInt();
			if(mon==-1) {System.out.println("종료합니다");break;}
			else if(mon<1||mon>12) {System.out.println("잘못된입력입니다");continue;}
			
			cla_pro_1 cp=new cla_pro_1();
			cp.cal_print(year, mon);
			return;
	
		}
	}
public static void main(String[] args) throws ParseException {
	cal_pro_2 cp2=new cal_pro_2();
	cp2.runprompt();
}
}
