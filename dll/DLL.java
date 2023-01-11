package dll;

public class DLL {
	private Node head;

	public DLL() {
		this.head = null;
	}

	public boolean inserlast(int data) {
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}
		if (head == null) {
			head = newNode;
			return true;
		}
		Node last = head;
		while (last.getNext() != null) {
			last = last.getNext();

		}
		last.setNext(newNode);
		newNode.setPrev(last);
		return true;
	}

	public boolean insertfirst(int data) {
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}
		if (head == null) {
			head = newNode;
			return true;

		}
		newNode.setNext(head);
		head.setPrev(newNode);
		head = newNode;
		return true;
	}

	public void removefirst() {
		if (head == null) {
			System.out.println("Dll is empty");
		}
		head = head.getNext();
	}
	public void removelast() {
		if(head==null) {
			System.out.println("dll is empty");
		}
		Node last=head;
		while(last.getNext().getNext()!=null)
		{
			last=last.getNext();
		}
		last.setNext(null);
	}
	
	public boolean insertbyposition(int data,int position) {
		if(position<=0||(head==null&&position>1)) {
			return false;
		}
		Node newNode =new Node(data);
		if(newNode==null) {
			return false;
			
		}
		if(position==1) {
			if(head!=null) {
				newNode.setNext(head);
				head.setPrev(newNode);
			}
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
		newNode.setPrev(prev);
		if(prev.getNext()!=null) {
			newNode.setNext(prev.getNext());
			prev.getNext().setPrev(newNode);
		}
		prev.setNext(newNode);
        return true;		
		
	}
        public boolean removebyposition(int position) {
        	if(head==null) {
        		return false;
        	}
        	if(position==1) {
        		head=head.getNext();
        		if(head!=null) {
        			head.setPrev(null);
        		}
        		return true;
        		
        	}
        	Node del=head;
        	for(int i=1;i<position;i++) {
        		del=del.getNext();
        		if(del==null) {
        			return false;
        		}
        		
        	}
        	del.getPrev().setNext(del.getNext());
        	if(del.getNext()!=null) {
        		del.getNext().setPrev(del.getPrev());
        	}
        	return true;
        }

	public void display() {
		Node last = head;
		while (last != null) {
			System.out.print(last.getData() + " ");
			last = last.getNext();
		}
		System.out.println();
	}
}
