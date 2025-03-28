package Day14.Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializePerson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//사용자로부터 입력
		System.out.println("이름 : ");
		String name =sc.nextLine();
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		//person 객체 생성
		Person person = new Person(name, age);
		
		//person 객체 직렬화
		//객체를 바이트 데이터로 변환하여 파일로 저장
		try(
				//"Person.dat"파일로 생성하고 파일 출력 스트림
				FileOutputStream fos = new FileOutputStream("Person.dat");
				//객체를 직렬화하여 파일에 저장할 수있도록 객체 스트림을 생성
				ObjectOutputStream oos = new ObjectOutputStream(fos);
		){
			//Person 객체를 직렬화하여 파일에 저장
			oos.writeObject(person);
			//직렬화가 완려 메시지 출력
			System.out.println("Person객체를 직렬화하여 Person.dat에 저장 완료.");
		} 
		catch (Exception e) {
			//예외 발생 시 에러 메시지 출력
			e.printStackTrace();
		}
		
		sc.close();
	}
	
}
