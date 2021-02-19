package util;

import java.util.ArrayList;

import lombok.Data;

public class EmpList {
	ArrayList<Emp> list;
	public EmpList() {
		list = new ArrayList<>();
	}
	
	//추가
	public void addEmp(Emp emp) {
		//to do
		list.add(emp);
	}
	//해당 사원의 이름 조회
	public String getName(int index) {
		String name="";
		//to do
	    name = list.get(index).name;
		return name;
	}
	//삭제
	public void delEmp(int index) {
		//to do
	}
	
	//전체 사원의 이름 조회
//	public void getNames() {
//		String name="";
//		for(int i=0; i< list.size(); i++) {
//	    name = list.get(i).name;
//	    System.out.println(name);
//		}
//	}
	
	public void getNames() { //확장 for문
		for(Emp e : list) {
	    System.out.println(e.name);
		}
	}
	
	//전체 이름만 리턴 //5번
	public String getNamesStr() {
		String names= "";
		//for()
		
		return names;
	}
		
	//리스트 조회
	public ArrayList<Emp> getList() {
		return list;
	}
}
	
	