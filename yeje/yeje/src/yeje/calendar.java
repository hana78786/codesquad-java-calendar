package yeje;

public class calendar {
private final static int[] days= {31,28,31,30,31,30,31,31,30,31,30,31};
public static int days(int month) {
	return days[month-1];
}
public static void print(int year,int month) {
	System.out.printf("   <<%4d   %3d>>\n",year,month);
	System.out.println(" su mo tu we th fr sa");
	System.out.println("-----------------------");
	int maxday=days(month);
	for(int a=1;a<=maxday;a++) {
		System.out.printf("%3d",a);
		if(a%7==0) {
		System.out.println();}
	}System.out.println();
	
}
public static void main(String[]args) {}
}

		
	
	
