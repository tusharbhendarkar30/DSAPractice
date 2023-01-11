package queue;

public class TesterCirQueue {
	public static void main(String[] args) {
		CircularQueue c=new CircularQueue();
		
		c.enqueue(10);
		c.enqueue(20);
		c.enqueue(30);
		System.out.println("------------------------------");
		c.dequeue();
		c.dequeue();
		System.out.println("------------------------------");
		c.enqueue(40);
	}

}
