package hana.calendar;

import java.text.ParseException;
import java.util.Scanner;

public class plan_test {
	

	
	static void cmdSerch(Scanner s,caleadar_sample cs) {
	System.out.println("[일정검색]");
	System.out.println("날짜를 입력하주세요(yyyy-MM-dd)");
	String date=s.next();
	PlanItem plan;
	plan=cs.searchPlan(date);
	if(plan!=null) {
	System.out.println(plan.detail);}
	else {
		System.out.println("일정이 없습니다");
	}
}
	
	static void cmdRegister(Scanner s,caleadar_sample cs) throws ParseException {
		System.out.println("[새 일정등록]");
		System.out.println("날짜를 입력하주세요(yyyy-MM-dd)");
		String date=s.next();
		String text="";
		 s.nextLine(); //ignore one newline
	        System.out.println("일정을 입력해 주세요.");
	        text = s.nextLine();
	       
		cs.registerPlan(date, text);
		
	}
	
}
