package sll;

public class SLL {

	private Node head;
	public SLL() {
		head=null;
	}
	
	public boolean insertFirst(int data) {
		Node newNode=new Node(data);
		if(newNode==null) {
			return false;
		}
		if(head==null) {
			head=newNode;
			return true;
		}
		else {
			newNode.setNext(head);
			head=newNode;
			return true;
		}
	}
	
	
	public boolean insertlast(int data) {
		Node newNode=new Node(data);
		if(newNode==null) {
			return false;
		}
		if(head==null) {
			head=newNode;
		    return true;	
		}
		else {
			Node last=head;
			while(last.getNext()!=null) {
				last=last.getNext();
				
			}
			last.setNext(newNode);
			return true;
		}
	}
	
	public Node removefirst() {
		if(head==null) {
			System.out.println("SLL is empty");
			return null;
			
		}
		else {
			Node first=head;
			head=head.getNext();
			return first;
		}
	}
	
	public void removelast() {
		if(head==null) {
			System.out.println("Sll is empty");
			
		}
		else {
			Node last=head;
			Node prev=head;
			while(prev.getNext().getNext()!=null) {
				prev=prev.getNext();
				
			}
			prev.setNext(null);
		
		}
	}
	public boolean insertbyposition(int data,int position) {
		if(position<=0||(head==null&&position>1)) {
			return false;
	}
	Node newNode=new Node(data);
	if(newNode==null) {
		return false;
	}
	if(position==1) {
		newNode.setNext(head);
		head=newNode;
		return true;
	}
	Node prev=head;
	for(int i=1;i<position-1;i++) {
		prev=prev.getNext();
		if(prev==null) {
			return false;
		}
	}
	newNode.setNext(prev.getNext());
	prev.setNext(newNode);
	return true;
	}
	public boolean removebyPosition(int position) {
		Node newNode=new Node(position);
		if (position == 0 || head == null) {
			return false;
		}
		
		if(position == 1) {
			head=head.getNext();
			return true;
			
		}
		Node prev=head;
		for( int i=1;i<position-1;i++) {
			prev=prev.getNext();
			if(prev.getNext()==null) {
				return false;
				
			}
		}
			Node del=prev.getNext();
			prev.setNext(del.getNext());
			return true;
			
		

	}
	public void display() {
		Node last=head;
		while(last!=null) {
			System.out.print(last.getData()+" ");
			last=last.getNext();
			
		}
		System.out.println();
	}
}
