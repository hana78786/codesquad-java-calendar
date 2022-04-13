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
hm.put("2", "world2");
hm.put("3", "hello3");
hm.put("4", "world4");
hm.put("2", "WorldWorld2");
System.out.print("size:"+hm.size());
System.out.println();

for(Map.Entry<String,String>e:hm.entrySet())
	System.out.println("Key:"+e.getKey()+"Value:"+e.getValue());



hm.remove("3");
System.out.println(hm);

hm.clear();
System.out.println(hm);
}}