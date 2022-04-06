package hana.calendar;

import java.util.Scanner;

public class caleadar_sample {
	private final static int[] MAX_DAYS={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int arr(int i) {
		return MAX_DAYS[i-1];
	}
	

	public void printCalendar(int year,int i) {	
		System.out.printf("   <<%4d   %3d>>\n",year,i);
		System.out.println(" 일  월  화 수 목  금  토");
		System.out.println("--------------------------");
		int maxday = arr(i);
		for(int a=1;a<=maxday;a++) {
			System.out.printf("%3d",a);
			if(a%7==0)
				System.out.println();
		}
		System.out.println();
//		System.out.println("1   2   3   4   5   6   7");
//		System.out.println("8   9   10  11  12  13  14");
//		System.out.println("15  16  17  18  19  20  21");
//		System.out.println("22  23  24  25  26  27  28");
		}
	

	public static void main(String[]args){}}