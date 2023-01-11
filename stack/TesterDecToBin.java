package stack;

public class TesterDecToBin {
	public static void main(String[] args) {
	      DecimalToBin d=new DecimalToBin();
	      System.out.println("push="+d.push(4));
	      System.out.println("push="+d.push(5));
	      System.out.println("push="+d.push(6));
	      System.out.println("-------------------------");
	      System.out.println("pop="+d.pop());
	      System.out.println("pop="+d.pop());
	      System.out.println("-------------------------");
	      System.out.println("peek="+d.peek());
	      
	}

}
