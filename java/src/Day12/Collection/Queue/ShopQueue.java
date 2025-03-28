package Day12.Collection.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 큐 자료구조는 
 * 실세계에 있는 줄서기 와 유사하다.
 * 
 * 가게에 방문한 손님들을 줄서게 하는 관리 프로그램을 만들어 봅시다.
 * 
 */

public class ShopQueue {
		//큐 자료구조를 컬렉션으로 사용할 때는
		//linkedList로 객체를 생성하고 Queue 인터페이스 타입으로 선언한다.
	
		private Queue<String> customerQueue = new LinkedList<String>();
		
		//손님대기
		public void wait(String custmer) {
			customerQueue.offer(custmer);		// 큐 데이터 삽입(enqueue)
			System.out.println("대기한 손님 : " + custmer);
		}
		
		//손님 입장
		public void serve() {
			if(!customerQueue.isEmpty()) {
				String servedCustomer = customerQueue.poll();// 큐 데이터 삭제(dequeue)
				System.out.println("입장한 손님 : " + servedCustomer);
			}
			else { 
				System.out.println("대기 중인 고객이 없습니다.");
			}
		}
		//대기열 확인
		public void showWaitngList() {
			System.out.println(":::::대기 중인 손님:::::");
			Iterator<String> it = customerQueue.iterator();
			int index = 0;
			while (it.hasNext()) {
				String customer = (String) it.next();
				System.out.println((++index) + ". " + customer);
			}
			
		}
		public static void main(String[] args) {
			ShopQueue shopQueue = new ShopQueue();
			shopQueue.wait("윤홍민");
			shopQueue.wait("이준영");
			shopQueue.wait("고건우");
			shopQueue.showWaitngList();
			
			shopQueue.serve();
			shopQueue.wait("신유식");
			
			shopQueue.serve();
			
			shopQueue.showWaitngList();

			shopQueue.serve();
			shopQueue.serve();
		}
		
		
		
		
}
