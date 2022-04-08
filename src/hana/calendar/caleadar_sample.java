package hana.calendar;

import java.util.Scanner;

public class caleadar_sample {
	private final static int[] arr= {31,28,31,30,31,30,31,31,30,31,30,31};
	private final static int[] larr= {31,29,31,30,31,30,31,31,30,31,30,31};
	
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

	
public void printcalendar(int year,int mon, String b) {
System.out.printf("   <<%4d %3d>>\n",year,mon);
System.out.println(" sn mo tu we th fr sa");
System.out.println("---------------------");
int md=arr(year,mon);

for(int a=1;a<=md;a++) {
	if(b=="su") {
	System.out.printf("%3d",a);
	if(a%7==0) {
		System.out.println();}}
	if(b=="mo") {
		System.out.printf("%3d"," ");
		System.out.printf("%3d",a);
		if(a%7==6) {
			System.out.println();}}
	if(b=="tu") {
		System.out.printf("%6d"," ");
	System.out.printf("%3d",a);
	if(a%7==5) {
		System.out.println();}}
	if(b=="we") {
		System.out.printf("%9d"," ");
	System.out.printf("%3d",a);
	if(a%7==4) {
		System.out.println();}}
	if(b=="th") {
		System.out.printf("%12d"," ");
	System.out.printf("%3d",a);
	if(a%7==3) {
		System.out.println();}}
	if(b=="fr") {
		System.out.printf("%15d"," ");
	System.out.printf("%3d",a);
	if(a%7==2) {
		System.out.println();}}
	if(b=="sa") {
		System.out.printf("%18d"," ");
	System.out.printf("%3d",a);
	if(a%7==1) {
		System.out.println();}}
}System.out.println();}
public static void main(String[]args) {}} 
