package util;

import java.util.ArrayList;

public class ListUtil {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		//추가 (추가는 마지막에 넣는 데이터 추가되는 거)
		list.add("바나나");
		//삽입 (삽입은 데이터들 중간에 삽입되는 거.. 개념이 다름)
		list.add(0,"사과");
		//수정
		list.set(1, "키위");
		//삭제
		list.remove(0);
		//단건 조회 검색
		list.get(0);
		//전체 조회
		System.out.println(list);
	}

}
