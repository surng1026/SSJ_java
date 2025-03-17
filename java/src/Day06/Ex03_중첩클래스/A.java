
package Day06.Ex03_중첩클래스;


/* 
 * 중첩 클래스
 * 
 * 
 */
//아우터클래스

public class A {

int a, b;
//이너클래스

class B {
	int x, y;
	
	public void bMethod() {
		System.out.println("이너클래스에서 아우터클래스의 맴버접근가능");
		System.out.println("A의 a :" + a);
		System.out.println("A의 b :" + b);}
	}

public void aMethod() {
	System.out.println("아우터클래스에서 이너클래스의 맴버 접근불가");
	
}

}



