package hana.calendar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashpmap {
public static void main(String[] args) {
	
	
HashMap<String,String>hm=new HashMap<String,String>();
System.out.println("날짜를 입력하세요");
Scanner scanner=new Scanner(System.in);
String a=scanner.next();
System.out.println("일정을 입력하세요");
String b=scanner.next();
hm.put(a, b);

System.out.print("일정수:"+hm.size());
System.out.println();

for(Map.Entry<String,String>e:hm.entrySet())
	System.out.println("날짜:"+e.getKey()+" 일정:"+e.getValue());

}}