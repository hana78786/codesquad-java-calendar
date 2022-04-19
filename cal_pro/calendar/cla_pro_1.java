package calendar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class cla_pro_1 {
	private final static int[] arr = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private final static int[] larr = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
private static final String savefile="cal_p.dat";
	
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


	
	

	public void cal_print(int year, int mon) {
	

		System.out.printf("    %3d년  %3d월\n",year,mon);
		System.out.println(" su mo tu we th fr sa");
		System.out.println("----------------------");
		
		if(mon<=2) {mon=mon+12;year=year-1;}
		int y=year%100;
		int c=(year-y)/100;
		int z=((21*c/4)+(5*y/4)+(26*(mon+1)/10))%7;
		int maxday=arr(year,mon);
		for(int b=0;b<z;b++) {
			System.out.print("   ");
		}
		for(int a=1;a<=maxday;a++) {
			System.out.printf("%3d",a);
			if ((a+z)%7==0) {
				System.out.println();
			
		}}System.out.println();
		
	}
	
		
		private static HashMap<Date,String>hm;
		public cla_pro_1() {
			hm=new HashMap<Date,String>();
			File f=new File(savefile);
			if(!f.exists())
				return;
try {
	Scanner s=new Scanner(f);
	while(s.hasNext()){
		String line=s.nextLine();
		String[] words=line.split(",");
		String date=words[0];
		String plan=words[1];
		PlanItem p=new PlanItem(date, plan);
	}
} catch (FileNotFoundException e) {

	e.printStackTrace();
}
		}
	
	public void plan(String strdate, String plan) throws ParseException {
		PlanItem p=new PlanItem(strdate,plan);
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
		Date date=formatter.parse(strdate);
			hm.put(date, plan);
				System.out.println("날짜:"+strdate+" 일정:"+plan);
			File f=new File(savefile);
			
			String item=p.savestring();
			try {
				FileWriter fw=new FileWriter(f, true);
				fw.write(item);
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	public String searchPlan(String strdate) throws ParseException {
		Date date=new SimpleDateFormat("yyyy-MM-dd").parse(strdate);
		String plan=hm.get(date);
		return plan;
		
	}
	
		
		
	}


