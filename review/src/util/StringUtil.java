package util;

public class StringUtil {
	// 1. String -> int
	public static int toInt(String s) { // Integer -> int
		if (s == null)
			return -1;
		return Integer.parseInt(s);
	}

	// 2. int -> string
	public static String toStr(int s) {
		return Integer.toString(s);
	}

	// 3. string -> 확장자(String) : LastindexOf, substring
	public static String getExt(String s) {
		String result = "";
		// to do
		result = s.substring(s.lastIndexOf(".") + 1);
		return result;
	}

	/** 
	 * 경로명에서 파일이름만 추출 
	 * param s 
	 * 경로명 "c:/img/item/p01.jpg" 
	 * return 파일명 p01.jpg
	 */ //2번
	public static String getFilename(String s) {
		String result = "";
		result =  s.substring(s.lastIndexOf("/") + 1);
		return result;
	}

	/**
	 * 경로명에서 경로만 추출 
	 * param s 
	 * 경로명 "c:/img/item/p01.jpg" 
	 * return 경로 c:/img/item
	 */
	public static String getPath(String pathname) {
        String result = "";
        result =  pathname.substring(0, pathname.lastIndexOf("/") + 1);
		return result;

	}
}
