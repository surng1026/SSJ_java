package Day12.Collection.List;

import java.util.LinkedList;

public class LinkedListEx {

	class Product {
		String name; //상품명
		int price;	 //price
		int count;	 //재고 수
	}
	public static void main(String[] args) {
		LinkedList<Product> inventoryList = new LinkedList<Product>();
		Product product1 = new Product.ProductBuilder()
									  .name("블루투수 동글")
									  .price(5000)
									  .count(10)
									  .build();
		Product product2 = new Product.ProductBuilder()
										.name("기계식 키보드")
										.price(55000)
										.count(20)
										.build();
		Product product3 = new Product.ProductBuilder()
								      .name("기계식 키보드")
									  .price(12000)
									   	.count(50)
								     	.build();
		inventoryList.add(product1);
		inventoryList.add(product2);
		inventoryList.add(product3);
		
		//첫 번째/ 마지막 요소 가져오기
		Product firstProduct = inventoryList.getFirst();
		Product lastProduct = inventoryList.getLast();
		System.out.println("첫 번째 상품 : " + firstProduct);
		System.out.println("마지막 상품 : " + lastProduct);
		
		//첫번쨰 / 마지막 요소 제거
		inventoryList.removeFirst();
		inventoryList.removeLast();
		//첫번쨰/마지막 요소 추가
		inventoryList.addFirst( new Product("모니터", 200000, 10));
		inventoryList.addLast( new Product("컴퓨터", 1500000, 5));
		
		System.out.println("상품 개수 : " + inventoryList.size());
		
		inventoryList.clear();
		System.out.println(":::::재고 목록 :::::");
		System.out.println(inventoryList);
	}
}
