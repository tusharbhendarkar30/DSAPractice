package sll;

public class Main {

	public static void main(String[] args) {
		SLL sll=new SLL();
		sll.insertFirst(10);
		sll.insertFirst(20);
		sll.insertFirst(30);
		sll.display();
		sll.insertlast(40);
		sll.display();
		sll.removefirst();
		sll.display();
		sll.removelast();
		sll.display();
		sll.removelast();
		sll.display();		
		sll.insertFirst(10);
		sll.insertFirst(20);
		sll.insertFirst(30);
		sll.display();
		sll.insertbyposition(40, 3);
		sll.display();
		sll.removebyPosition(3);
		sll.display();
			

	}

}
