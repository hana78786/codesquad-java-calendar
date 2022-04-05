package hana.calendar;

import java.util.Scanner;

public class calendar3 {
	public static void main(String[] args) {
		System.out.println("달을 입력하시면 그 달이 며칠까지 있는지 출력합니다.");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		if (i < 1) {
			System.out.println("1에서 12값을 입력하세요");
		} else if(i>12){
			System.out.println("1에서 12값을 입력하세요");
		}
		else {
			int[] arr = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			System.out.println(i + "월은 " + arr[i] + "일까지 있습니다");
			scanner.close();
		}
	}
}
