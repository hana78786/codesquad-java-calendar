package hana.calendar;

import java.util.Scanner;

public class caleandar6 {

	public static void main(String[] args) {
		while (true) { // 반복문을 맨 먼저쓴다, 밑에 썼더니 조건문만 반복되는 오류가 나왔다
			String PROMPT = ">";
			System.out.println("월을 입력하세요");
			System.out.print(PROMPT);//이 프롬프트는 표시한 출력문 밑에 써야 정상출력된다
			Scanner s1 = new Scanner(System.in);//조건입력받음
			int mon = s1.nextInt();//입력받은 조건은 mon으로 정의
			if (mon == -1) {//-1이 나왔을때는
				System.out.println("프로그램을 종료합니다");
				break;//종료 메시지와 함께 반복종료
			}
			if (mon < 1 || mon > 12) {
				System.out.println("잘못된입력입니다");
				continue;//1보다 작거나 12보다 큰수를 입력했을때는 오류메세지와 함께 조건반복
			}
			if (true) {
				System.out.println("일  월   화  수   목  금   토");
				System.out.println("--------------------------");
				System.out.println("1   2   3   4   5   6   7");
				System.out.println("8   9   10  11  12  13  14");
				System.out.println("15  16  17  18  19  20  21");
				System.out.println("22  23  24  25  26  27  28");
			}//어떤 명령어를 입력해도 위 달력이 일괄 출력될수 있도록  true를 만들었다
			if (mon == 2) {
				continue;//2월은 28일까지이니 별다른것 없이 반복입력
			}
			if (mon == 1 || mon == 3) {
				System.out.println("29  30  31");
				continue;//31일까지 출력후 반복
			}
			if (mon == 5 || mon == 7) {
				System.out.println("29  30  31");
				continue;
			}
			if (mon == 8 || mon == 10) {
				System.out.println("29  30  31");
				continue;
			}
			if (mon == 5 || mon == 7) {
				System.out.println("29  30  31");
				continue;
			}

			if (mon == 4 || mon == 6) {
				System.out.println("29  30  ");
				continue;//30일까지 출력후 반복
			}
			if (mon == 9 || mon == 11) {
				System.out.println("29  30  ");
				continue;
			}

		}
	}
}
