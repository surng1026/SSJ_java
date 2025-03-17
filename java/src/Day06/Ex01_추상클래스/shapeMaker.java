package Day06.Ex01_추상클래스;

import java.util.Scanner;

public class shapeMaker {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력변수
		double width = 0.0;
		double height = 0.0;
		double radius = 0.0;
		
		//입력받은 도형 배열 (3개)
		Shape[[ shapeList = new Shape[3];
		int index =0;
		while (true) {
			if (index ==3 )
				break;
			
			System.out.println("1.삼각형, 2.사각형, 3.원형");
			System.out.println(">> ");
			String input =sc.next();
			
			if (input) {
				break;
			switch (input) {
			case "1":
				System.out.println("가로: ");
				width = sc.nextdouble();
				System.out.println("세로: ");
				height = sc.nextdouble();
				shapeList[index++] = new Rectangle(width, height);
				break;
			case "2":
				System.out.println("가로: ");
				width = sc.nextdouble();
				System.out.println("세로: ");
				height = sc.nextdouble();
				shapeList[index++] = new Rectangle(width, height);
				break;
			case "3":
				System.out.println("가로: ");
				radius = sc.nextdouble();

				shapeList[index++] = new circle(width, height);
				break;

			
			}
				
			}
			
			double areaSum = 0.0;
			double roundSum = 0.0;
			
			for (shape shape : shapeList ) {
				if (shape == null) 
					continue;
				//넓이와 둘레
				double area = shape.area();
				double round = shape.round();
				//합계
			areaSum += area;
			roundSum += round;
			
			//instranceof : 인스턴스를 확인하는 연산
			if (shape instanceof Triangle ) System.out.println("삼각형");
			if (shape instanceof Rectangle ) System.out.println("사각형");
			if (shape instanceof circle ) System.out.println("원형");
			
			System.out.println("넓이 : " + area + "\t");
			System.out.println("둘레 : " + area + "\t");
			
			}
			//foreach끝
			System.out.println("넓이 총합 : " + areaSum);
			System.out.println("둘레 총합 : " + roundSum);
			sc.close();
			
			
	//살려줘 시봉뱅		
			}
		}
	}

