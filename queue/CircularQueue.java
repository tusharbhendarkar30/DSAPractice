package queue;

public class CircularQueue {
	private int []arr;
	private int rear,front,size;
	private int count=0;
    
	public CircularQueue() {
		rear=-1;
		front=-1;
		size=10;
		arr=new int[10];
		
	}
	public CircularQueue(int size) {
		rear=-1;
		front=-1;
		
		arr=new int[size];
		
	}
	public boolean isEmpty() {
		if(count==0) {
			return true;
		}
		else {
			return false;
		}
			
	}
	public boolean isFull() {
		if(count==(arr.length-1)) {
			return true;
		}
		else {
			return false;
		}
	}
	public int enqueue(int data) {
		if(isFull()==false) {
			rear=(rear+1)%arr.length;
			arr[rear]=data;
			if(front==-1) {
				front=0;
			}
			count=count+1;
		    System.out.println("Enqueue="+data+"  front="+front+" rear="+rear);	
		    return data;
		}
		else {
			System.out.println("queue is full");
			return -1;
		}
		
	}
	
	public int dequeue() {
		if(isEmpty()==false) {
			int temp=arr[front];
			front=(front+1)%arr.length;
			count=count-1;
			 System.out.println("dequeue="+temp+"  front="+front+" rear="+rear);	
			return temp;
		}
		else {
			return -1;
		}
	}
}
