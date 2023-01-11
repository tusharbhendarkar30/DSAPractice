package stack;

public class StringReverse {
	private String[] arr;
	private int top, size;

	public StringReverse() {
		size = 10;
		arr = new String[10];
		top = -1;

	}
	public StringReverse(int size) {
		arr=new String[size];
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
     public String push(String element) {
    	 if(isFull()==false) {
    		 top=top+1;
    		 arr[top]=element;
    		 return element;
    		 
    	 }
    	 else {
    		 System.out.println("Stack is full");
    		 
    		 return "abc";
    	 }
    	 
     }
     public String pop() {
    	 if(isEmpty()==false) {
    	 String	temp=arr[top];
    	 top=top-1;
    	 return temp;
    		
    	 }
    	 else {
    		 System.out.println("stack  is empty");
    		 return "xyz";
    	 }
     }
     public String peek() {
    	 if(isEmpty()==false && isFull()==false) {
    		 String temp=arr[top];
    		 return temp;
    	 }
    	 else {
    		 System.out.println("stack is empty");
    		 return "xyz";
    		 
    	 }
     }
}
