package hana.calendar;


import java.util.Scanner;


public class calendar3 {
	private static final int i = 0;
	private final static int[] MAX_DAYS={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int arr(int i) {
		return MAX_DAYS[i-1];
	} 
	
	public static void main(String[] args) {
		System.out.println("달을 입력하시면 그 달이 며칠까지 있는지 출력합니다.");
		Scanner scanner = new Scanner(System.in);
		calendar3 cal=new calendar3();
		int i=scanner.nextInt();
		if (i< 1) {
			System.out.println("1에서 12값을 입력하세요");
		} else if(i>12){
			System.out.println("1에서 12값을 입력하세요");
		}
		else {
			
			System.out.printf("%d월은 %d일까지 있습니다.\n",i,cal.arr(i));
			scanner.close();
		}
	}
}
