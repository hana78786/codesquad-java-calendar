package hana.calendar;

import java.util.HashMap;

public class hashpmap {
public static void main(String[] args) {
HashMap<String,String>hm=new HashMap<String,String>();
hm.put("1", "hello1");
hm.put("2", "world2");
hm.put("3", "hello3");
hm.put("4", "world4");
hm.put("2", "WorldWorld2");
System.out.print(hm);

hm.remove("3");
System.out.println(hm);

hm.clear();
System.out.println(hm);
}}