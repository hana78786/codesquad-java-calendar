package hana.calendar;

import java.util.Scanner;

public class caleadar4 {
public static void main(String[]args) {
	System.out.println("몇개의 달을 확인할건가요?");
	Scanner s1=new Scanner(System.in);
	int n=s1.nextInt();
	System.out.println("몇일까지 있는지 궁금한 달을 입력하세요");
	for(int a=1;a<n+1;a++) {
	int[] arr={31,28,31,30,31,30,31,31,30,31,30,31};
	Scanner scanner=new Scanner(System.in);
	int i=scanner.nextInt();
	System.out.printf("%d월은%d일까지 있습니다\n",i,arr[i-1]);
}


s1.close();
	
}
	}


