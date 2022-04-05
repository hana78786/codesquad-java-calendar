package hana.calendar;

import java.util.Scanner;

public class caleadar4 {
public static void main(String[]args) {
	System.out.println("확인하고자 하는 갯수를 입력하시오");
	int[] arr= {31,28,31,30,31,30,31,31,30,31,30,31};
	Scanner s1=new Scanner(System.in);
	int i=s1.nextInt();
	System.out.println("몇월이 며칠까지 있는지 궁금한가요?");
	for(int a=1;a<i+1;a++) {
		Scanner s2=new Scanner(System.in);
		int b=s2.nextInt();
		if(b<1) {System.out.println("잘못입력하셨습니다");}
		else if(b>12){System.out.println("잘못입력하셨습니다");}
		else {System.out.printf("%d월은 %d일까지 있습니다\n",b,arr[b-1]);}
		
		
	}
	s1.close();

	System.out.println("프로그램을 종료합니다");
}

}

	

