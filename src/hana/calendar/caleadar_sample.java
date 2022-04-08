package hana.calendar;

import java.util.Scanner;


public class caleadar_sample {
	private final static int[] arr= {31,28,31,30,31,30,31,31,30,31,30,31};
	private final static int[] larr= {31,29,31,30,31,30,31,31,30,31,30,31};
	private String b;
	
	public boolean isLeepYear(int year) {
		if(year %4 ==0 && (year%100 != 0||year%400==0))
		return true;
		else
	return false;
	}
	
	public int arr(int year,int mon) {
		if (isLeepYear(year)) {
			return larr[mon-1];
		}else {
		return arr[mon-1];
	}}

	
public void printcalendar(int year,int mon, int week) {
	
	System.out.printf("   <<%4d %3d>>\n",year,mon);
System.out.println(" su mo tu we th fr sa");
System.out.println("---------------------");

for(int a=0;a<week;a++) {
	System.out.print("   ");
}
int md=arr(year,mon);
int count=7-week;
int d= (count<7)?count:0;
for(int a=1;a<=count;a++) {
	System.out.printf("%3d",a);}
		System.out.println();	

count++;
for(int a=count;a<=md;a++) {
	System.out.printf("%3d",a);
	if(a%7==d) {
		System.out.println();}	
}

System.out.println();}
public static void main(String[]args) {}} 
