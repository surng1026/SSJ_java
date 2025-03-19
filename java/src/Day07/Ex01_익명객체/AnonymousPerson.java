package Day07.Ex01_익명객체;

public class AnonymousPerson {

	//익명 자식 객체 생성
	// 부모클래스 객체명 = new 부모 클래스() {익명객체 정으ㅏ}
	
	Person person1 = new Person() {

		@Override
		void work() {
			// TODO Auto-generated method stub
			System.out.println(name + "("+age+")");
			System.out.println("프로그래밍을 합니다");
			System.out.println();
		}
		//이 역역은 마치 자식 클래스 영역과 같다.
		
		Person person1 = new Person() {

			@Override
			void work() {
				// TODO Auto-generated method stub
				System.out.println(name + "(" + age + ")");
				System.out.println("프로그래밍을 합니다");
				System.out.println();
			}
			
			Person person2 = new Person() {

				@Override
			void work() {
					// TODO Auto-generated method stub
				System.out.println(name + "(" + age + ")");
				System.out.println("요리를 합니다");
				System.out.println();
				}
		
		
	};
	
		void method() {
			person1.name = "김조은"
					person1.name = "김조은"
					person1.name = "김조은"
					person1.name = "김조은"
					person1.name = "김조은"
					person1.name = "김조은"
		}
		}

}