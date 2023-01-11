package stack;

public class TesterStringRev {

	public static void main(String[] args) {
		StringReverse s=new StringReverse();
		System.out.println("push="+s.push("Hey"));
		System.out.println("push="+s.push("It's"));
		System.out.println("push="+s.push("Me"));
		System.out.println("push="+s.push("Tushar"));
		System.out.println("--------------------------");
		System.out.println("pop="+s.pop());
		System.out.println("pop="+s.pop());
		System.out.println("pop="+s.pop());
		System.out.println("--------------------------");
		System.out.println("peek="+s.peek());
		
		
		

	}

}
