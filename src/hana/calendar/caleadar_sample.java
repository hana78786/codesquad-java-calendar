package hana.calendar;
import java.text.SimpleDateFormat;

import java.util.HashMap;

import javax.swing.text.html.CSS;

import java.util.Date;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;




public class caleadar_sample {
	private final static int[] arr = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private final static int[] larr = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private final static String Save_File="cal.dat";
	
	private HashMap <Date,PlanItem> planmap;
	public caleadar_sample() {
		planmap=new HashMap<Date,PlanItem>();
	}
	
	
	public void registerPlan (String strdate, String plan) {
		
		PlanItem p=new PlanItem(strdate,plan);
		planmap.put(p.getdate(),p);
		
		File f=new File(Save_File);
		String item=p.saveString();
		try {
			FileWriter fw=new FileWriter(f, true);
			fw.write(strdate);
			fw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public PlanItem searchPlan(String strdate) {
		Date date=PlanItem.getDatefromString(strdate);
		return planmap.get(date);
	}
	
	
	public boolean isLeepYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;
	}

	public int arr(int year, int mon) {
		if (isLeepYear(year)) {
			return larr[mon];
		} else {
			return arr[mon];
		}
	}

	
	public void printcalendar(int year, int mon) {
		System.out.printf("   <<%4d %3d>>\n", year, mon);
		System.out.println(" su mo tu we th fr sa");
		System.out.println("---------------------");

		
		int weekday = getweekday(year, mon, 1);
		// System.out.print(week);
		
		for (int a = 0; a < weekday; a++) {
			System.out.print("   ");
		}
	
		int md = arr(year, mon);
		int count = 7 - weekday;
		int delim = (count < 7) ? count : 0;
		
		for (int a = 1; a <= count; a++) {
			System.out.printf("%3d", a);
		}
				System.out.println();
				
				count++;
				for(int a = count; a <= md; a++) {
					System.out.printf("%3d",a);
					if (a % 7 == delim) 
						System.out.println();
			}
			 System.out.println();


				}
		
	

	private int getweekday(int year, int mon, int day) {
		int syear = 1970;
	
		final int STAND_WEEKDAY = 3;// 1970 jan 1st thursday

		int count = 0;
		for (int a = syear; a < year; a++) {
			int delta = isLeepYear(a) ? 366 : 365;
			count += delta;
		}
		for (int a = 1; a < mon; a++) {
			int delta = arr(year, a);
			count += delta;
		}

		count += day;
		int weekday = (count + STAND_WEEKDAY) % 7;
		return weekday;

	}

	public static void main(String[] args) throws ParseException {
	caleadar_sample cs = new caleadar_sample();
	cs.registerPlan("2017-06-23", "식사");
		
	System.out.println(cs.searchPlan("2017-06-23").equals("식사"));
	}
}
