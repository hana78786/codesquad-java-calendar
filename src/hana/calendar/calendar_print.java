package hana.calendar;

import java.util.Scanner;

public class calendar_print {

	
//	public static boolean ly(int year) {
//		if(year%4==0 && (year%100!=0||year%400==0))
//	return true;
//		else return false;
//	}
//	public static int d(int year) {
//		if (ly(year)) {
//			return 1;
//			
//		}else {
//		return 0;}}
	
	
//	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		int year=scanner.nextInt();
//		int month=scanner.nextInt();
//		System.out.println(ly(year));
//		System.out.println(d(year));
		
//		int y=year%100;
//		int c=year/100-y;
//		if (month==1) {month=13;}
//		if (month==2) {month=14;}
//		int z=(12*c/4)+(5*y/4)+(13*(month+1)/5)+1-1;
//		int dz=z%7;
//		System.out.println(dz);
		
//	}

	
//	public static int wee_d(String week) {
//		if(week.equals("su")) return 0;
//		else if(week.equals("mo")) return 1;
//		else if(week.equals("tu")) return 2;
//		else if(week.equals("we")) return 3;
//		else if(week.equals("th")) return 4;
//		else if(week.equals("fr")) return 5;
//		else if(week.equals("sa")) return 6;
//		else return 7;
//	} 
	private final static String PRMOPT=">";
	public static void runprompt() {
		while (true) {
			int week=0;
			System.out.println("년도");
			System.out.print("year>");
			Scanner sc=new Scanner(System.in);
			int year=sc.nextInt();
			if(year==-1) {System.out.println("종료");
			break;}
			System.out.println("출력할 달력의 월수");
			System.out.print("mon>");
			int month=sc.nextInt();
			if(month==-1) {System.out.println("종료");
			break;}
			if(month<1||month>12) {System.out.println("잘못된 입력");
			continue;}

			calendar c=new calendar();
			c.print(year, month);
		}
	}
public static void main(String[]artgs) {
	calendar_print cp=new calendar_print();
		cp.runprompt();
		
}
}
