package stack;
import java.util.Stack; 
import java.util.Scanner;


public class pallindrome {
    public static void main(String[] args) {
		Stack <String> stack=new Stack<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your input");
		String str=sc.next();
		
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			String s=Character.toString(ch);
			stack.push(s);
		}
		
            String s1="";
            for (int i = 0; i < str.length(); i++) {
            	s1=s1+stack.pop();
				
			}
            System.out.println("Reverse String is");
            System.out.println(s1);
            
            
            if(str.equals(s1))
               System.out.println("pallindrome");
            else 
               System.out.println("Not Pallindrome");
            
			
		}
		
	}

