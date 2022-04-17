package hana.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

public class PlanItem {
	public Date planDate;
	public String detail;
	public String peoples ="";
	
	public static Date getDatefromString(String strdate) {
		Date date = null;
		try {
			date=new SimpleDateFormat("yyyy-MM-dd").parse(strdate);
		} catch (ParseException e) {
			// 이부분은 위에 simpleDateformat이 바르지 않게 입력됏을때의 오류값 출력이다
			e.printStackTrace();
		}
		return date;
	}
	
	public PlanItem(String date, String detail) {
		this.planDate=getDatefromString(date);
		
		this.detail=detail;
	}
	public Date getdate() {
		return planDate;
	}
public void addPeople(String name) {
	peoples+=name+",";
}
}
