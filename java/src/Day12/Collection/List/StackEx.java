package Day12.Collection.List;

import java.util.Stack;

public class StackEx {
	
	private Stack<String> history = new Stack<>();
	private String currntPage = "현재 페이지";
	//페이지 방문
	public void visit(String page ) {
		history.push(currentPage);
		currentPage = page;
		System.out.println(page + "- 페이지로 이동합니다.");
	}
	
	public static void main(String[] args) {
		if (!history.isEmpty()) {
			currentPage = history.pop();
			System.out.println("뒤로 가기 : " + currentPage);
		}
		else {
			System.out.println("뒤로 갈 수 없습니다.");
		}
	}
	
	public void showHistory() {
		System.out.println("::::: 방문 기록 :::::");
		Iterator<String> it = history.iterator();
		while (it.hasNext()) {
			String page = (String) it.next();
			System.out.println(page);
		}
	
	}

}
