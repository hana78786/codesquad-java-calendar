package yeje;

import java.util.Scanner;

public class calendar_print {
	private final static String PRMOPT=">";
	public static void runprompt() {
		while (true) {
			System.out.println("출력할 달력의 월수");
			System.out.print(PRMOPT);
			Scanner sc=new Scanner(System.in);
			int month=sc.nextInt();
			if(month==-1) {System.out.println("종료");
			break;}
			if(month<1||month>12) {System.out.println("잘못된 입력");
			continue;}
			calendar c=new calendar();
			c.print(2017, month);
		}
	}
public static void main(String[]artgs) {
	calendar_print cp=new calendar_print();
	cp.runprompt();
}
}
