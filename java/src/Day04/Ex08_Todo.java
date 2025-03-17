package Day04;

import java.util.Scanner;

/** 할일 목록 프로그램
*
*최대 10개의 할일을 관리할 수 있는 프로그램으로,
*
*메뉴를 통해 할일을 추가, 조회, 상태변경을 할 수있는 기능을 구현
*-기능-
*1.할일 추가
*2.할일 목록
*상태변경
*
*
*"""작업상태"""를 enum(열거타읍)으로 정의하여 관리
*시작전
*진행중
*완료
*/

//작업상태를 나타내는 enum
enum Status {
	TODO("시작전"),
	ING("진행중"),
	DONE("완료");
	private final String status;
	
	//생성자를 통해 상수를 값을 설정
	Status(String status) {
	this.status = status;	// TODO Auto-generated constructor stub
	}
//	상태의 값을 반환하는 메소드
public String getValue()  {
	return status;
}
	
}


class Todo {
	private String name;
	private Status status;
	
	public Todo(String name) {
		this.name = name;
		this.status = status.TODO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "(" + status + "] - " + name;
	}
//  alt + shift + s
}

public class Ex08_Todo {

	public static void main(String[] args) {
		
		Todo[] todoList = new Todo[10]; //최대 10개의 할일
		int count = 0;                  //할일 개수
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("######### 할일 목록 프로그램 #########");
			System.out.println("1. 할일 추가");
			System.out.println("2. 할일 목록");
			System.out.println("3. 상태 변경");
			System.out.println("0. 프로그램 종료");
			System.out.println("메뉴선택 :");
			
			int menuNo = sc.nextInt();
			sc.nextLine(); //남은 엔터 제거
			//TODO
			if (menuNo == 0 ) {
				System.out.println("프로그램을 종료합니다.");
				break;
				
			}
			
			switch (menuNo) {
				case 1: //할일 추각
						System.out.println("할일 :");
						String name = sc.nextLine();
						
						//이걸 타수 제한으로 변경하는걸 해보자
//						
					//  1.if (input.length() > 5){
//						System.out.println(" 최대 5자까지만 입력 가능합니다.");
//	                   		}   break; <-??
						
//						2.if (input.length() >= 1 && input.length() <= 50) {
//			                System.out.println("입력한 문자열은: " + input);
//			                break;  // 조건을 만족하면 반복 종료
//			            } else {
//			                System.out.println("입력한 문자열의 길이가 잘못되었습니다. 1자 이상, 50자 이하로 입력해주세요.");
//			            	}   break; <-??
						
					
						if( name.isEmpty()) {
							System.out.println("아무것도 입력하지 않았습니다.");
							break;
						}
						
						
						todoList[count] = new Todo(name);
						count++;
//						if (condition) {
//							
//						}
						System.out.println("할일을 추가하였습니다.");
					break;
				case 2: //할일 목록
						System.out.println("=========할일 목록=========");
						for (int i = 0; i < todoList.length; i++) {
							System.out.println( (i+ 1) +". " + todoList[i]);
						}
						System.out.println();
					break;
				case 3: //상태 변경
						System.out.println("할일 번호 : ");
						int index = sc.nextInt() -1;
						sc.nextLine();
						
						Status[] statusList = Status.values();
						for (Status status : statusList) {
							//1.시작전
//							//2.진행중
							//완료
							System.out.println( ( status.ordinal() + 1 ) + ". " + status.getValue());
						}
						// 변경할 상태 번호 입력
						System.out.println("번호: ");
						int statusNo = sc.nextInt();
						sc.nextLine();
						//상태변경
						Status updateStatus = statusList[statusNo-1];
						todoList[index].setStatus( updateStatus );
						System.out.println("작업상태를" + updateStatus.getValue() + " (으/로) 변경하였습니다.");
						
					break;
					
				case 0: //프로그램 종료
					System.out.println("프로그램을 종료합니다.");
					break;
					
				default:
					System.err.println("0~3 사이의 올바른 번호를 입력하세요.");
			}
		} // while 끝
		sc.close();
	}
}


