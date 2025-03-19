package Day08.Ex01_TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int menuNo = 0;
	String menuName;
	
	
	do {
		System.out.println("1.Java");
		System.out.println("2. HTML CSS JS");
		System.out.println("3.MySQL DB");
		System.out.println("4.Spring Framework");
		System.out.println("5.Servlet/JSP");
		System.out.println("6.React");
		System.out.println("7.Oython");
		System.out.println("8.dJango");
		System.out.println("9.Node.js");
		System.out.println("10.Express");
		System.out.println("11.Flutter");
		System.out.println("0.종료");
		System.out.println("입력:");
		
		
		try {
			menuNo = sc.nextInt();
		} catch (InputMismatchException e) {
			sc.next();
			System.out.println("(0~11) 번 사이의 숫자를 입력해주세요.");
			continue;
		}
		
	
		
		
		
		//종료조건
		if(menuNo ==0) break;
		switch (menuNo) {
		case 1: menuName = "Java"; break;
		case 2: menuName = "HTML CSS JS"; break;
		case 3: menuName = "MySQL DB"; break;
		case 4: menuName = "Spring Framework"; break;
		case 5: menuName = "Servlet/JSP"; break;
		case 6: menuName = "React"; break;
		case 7: menuName = "Oython"; break;
		case 8: menuName = "dJango"; break;
		case 9: menuName = "Node.js"; break;
		case 10: menuName = "Express"; break;
		case 11: menuName = "Flutter"; break;
		}
		System.out.println(menuName + "(을/를) 공부를 합니다.");
		
	} 
	
	while (true);
	
	
	
	
	sc.close();
	}
}

