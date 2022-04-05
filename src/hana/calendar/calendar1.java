package hana.calendar;
import java.util.Scanner;

public class calendar1 {
	public static void main(String[] args) {
	int a,b;
	Scanner scanner=new Scanner(System.in);
	String s1,s2;//문자열 s1,s2
	System.out.println("두 수를 입력하세요 예:a b");
	s1=scanner.next();
	s2=scanner.next();
	//차례로 입력된 숫자를 인식받는다. 이런게 있는줄은 몰랐는데..
	a=Integer.parseInt(s1);
	b=Integer.parseInt(s2);
	//a와 b의 값을 s1 s2로 지정하였다.
	System.out.printf("%d+%d는%d이다",a,b,a+b);
	//처음보는 프린트 명령어 아마 %d라는 입력값을 뒤에 오는 순서대로 출력한다고 예상된다
	scanner.close();
	//scanner같은 명령어를 쓰고나면 꼭 닫는 버릇을 들이자
	
	}

}
