package stack;

public class Stack {
	private int [] arr;
	private int top ,size;
	public Stack() {
		size=10;
		arr=new int[10];
		top=-1;
	}
	public Stack(int size) {
		
		arr=new int[size];
		top=-1;
	}
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isFull() {
		if(top==size-1) {
			return true;
		}
		else {
			return false;
			}
	}
	public int push(int data) {
		if(isFull()==false) {
			top=top+1;
			arr[top]=data;
			return data;
		}
		else {
			System.out.println("stack is full");
		    return -2;
		}
	}
	public int pop() {
		if(isEmpty()==false) {
			int temp=arr[top];
			top=top-1;
			return temp;
		}
		else {
			System.out.println("stack is empty");
			return -2;
		}
	}
	public int peek() {
		if(isEmpty()==false && isFull()==false) {
			int temp=arr[top];
			return temp;
		}
		else {
			return -2;
		}
	}
	
	
	
	

}
