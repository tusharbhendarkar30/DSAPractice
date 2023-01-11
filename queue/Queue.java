package queue;

public class Queue {
	
	private int [] arr;
	private int rear,front,size;
	public Queue() {
		size=10;
		arr=new int[10];
		rear=-1;
		front=-1;
	}
	public Queue(int size) {
		
		arr=new int[size];
		rear=-1;
		front=-1;
	}
	public boolean isEmpty() {
		if(front==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isFull() {
		if(rear==(arr.length-1)) {
			return true;
		}
		else {
			return false;
		}
	}
	public int enqueue(int data) {
		if(isFull()==false) {
			rear=rear+1;
			arr[rear]=data;
			if(front==-1) {
				front=0;
			}
			System.out.println("Enqueue="+data+" rear="+rear+" front="+front);
			return data;
		}
		else {
			System.out.println("Queue is Full");
			return -1;
		}
	}
	public int dequeue() {
		if(isEmpty()==false) {
			int temp=arr[front];
			front=front+1;
			System.out.println("dequeue="+temp+" rear="+rear+" front="+front);
			return temp;
		}
		else {
			System.out.println("Queue is Empty");
			return -2;
			
		}
	}
	public int peek() {
		if(isEmpty()==false && isFull()==false) {
			int temp=arr[front];
			System.out.println("peek="+temp);
			return temp;
		}
		else {
			return -1;
		}
	}
	
	public int pop() {
		if(isEmpty()==false) {
			int temp=arr[rear];
			rear=rear-1;
			System.out.println("pop="+temp);
			return temp;
		}
		else {
			return -1;
		}
	}

}
