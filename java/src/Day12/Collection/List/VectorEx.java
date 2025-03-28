package Day12.Collection.List;

import java.util.Vector;

public class VectorEx {
		//Vector 생성
	public static void main(String[] args) {
		
	
	// 학생목록
	Vector<String> studentList = new Vector<String>();
		
		//요소추가
	//요소 추가 add()
	studentList.add("고건우");
	studentList.add("장예지");
	studentList.add("구본걸");
	studentList.add("배은주");
	studentList.add("김조은");
	
	System.out.println(":::::학생 목록:::::");
	System.out.println(studeuntList);
	System.out.println();
	//요소 제거 remove()
	studentList.remove("배은주"); //객체 요소 (인스턴스)로 제거
	studentList.remove(1);// index로 제거
	//요소 접근 get()
	String firstStudent = new studentList.get(0);
	String secondStudent = new studentList.get(1);
	
	//요소 개수 size()
	int size = studentList.size();
	System.out.println(":::::모든 요소 제거:::::"); 
	System.out.println(studentList); 
	System.out.println("--------------------"); 
	//모든 요소 제거 clear()
	Vector<String> 야근반 = new Vector<String>();
	야근반.add("서성재");
	야근반.add("전주원");
	야근반.add("이윤태");
	studentList.addAll(야근반);
	
	System.out.println("::::: 요소 전체 추가 :::::"); 
	for ( int i = 0; i < studentList.size(); i++) {
		String student = new studentList.get(i);
		System.out.print(student); 
		if(i < studentList.size() -1) System.out.println(", ");
	}
	//요소 전체 추가 addAll()
	System.out.println();
	for (String student : 야근반) {
		System.out.println(student + " ");
	}
	//다른 컬렉션을 인자로  생성할 수 있다.
	Vector<String> 오전반 = new Vector<String>(야근반);
	오전반.add("박도현");
	for (String student : 오전반) {
		System.out.println(student + " ");
	}
	System.out.println();
}
}
