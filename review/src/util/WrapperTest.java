package util;

import java.util.Date;

public class WrapperTest {

	public static void main(String[] args) {
	    //int result = StringUtil.toInt("1234");
		//System.out.println(result);
		
		//String s = StringUtil.toStr(1234);
		//System.out.println(s);
		
		//파일명에서 확장자만 추출
		//String ext = StringUtil.getExt("a.b.hwp");
		//System.out.println(ext);
		
		//Date result = DateUtil.toDate("2021-02-10");
		//System.out.println(result);
//		
//		String str = DateUtil.toStr(new Date());
//		System.out.println(str);
//		
//		//얘는 오버로딩 개념
		String str2 = DateUtil.toStr(new Date(), "yyyy-MM");
		System.out.println(str2);
		
		//날짜계산 LacalDate
		Date today = new Date();
		Date meetDay = DateUtil.addDay(today, 100);
		System.out.println(DateUtil.toStr(meetDay));
		
	}

}
