package util;

import java.util.HashMap;

public class MapUtil {
	HashMap<Integer, Emp> map;
	
	public MapUtil() {
		map = new HashMap<>();
	}
	
	//추가
	public void addEmp(Emp emp) {
		map.put(emp.id, emp);
	}
	
	//수정
	
	//삭제
	public void delEmp(Integer id) {
		map.remove(id);
	}
	
	//사번으로 이름 조회
	public String getName(Integer id) {
		String name= "";
		name = map.get(id).name;
		return name;
	}
	
	//맵 리턴
	public HashMap<Integer, Emp> getMap() {
		return map;
	}
	
	//전체 이름만 조회 map.KeySet() --> Iterator -> for //과제
	
}
