package stack;

public class Testerstack {

	public static void main(String[] args) {
		Stack s=new Stack();
		System.out.println("push="+s.push(10));
	    System.out.println("push="+s.push(20));
	    System.out.println("push="+s.push(30));
	    System.out.println("push="+s.push(40));
	    
	    System.out.println("--------------------------");
	   System.out.println("pop="+s.pop());
	   System.out.println("pop="+s.pop());
	   System.out.println("pop="+s.pop());
	   
	   System.out.println("--------------------------");
	   System.out.println("peek="+s.peek());

	}

}
