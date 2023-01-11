package queue;

public class TesterQueue {

	public static void main(String[] args) {
		Queue s=new Queue();
		
		
		s.enqueue(10);
		s.enqueue(20);
		s.enqueue(30);
		s.enqueue(40);
		System.out.println("--------------------------------");
//		s.dequeue();
//		s.dequeue();
//		s.dequeue();
		
		System.out.println("--------------------------------");
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		System.out.println("--------------------------------");
		s.peek();

	}

}
