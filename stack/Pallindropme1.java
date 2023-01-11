package stack;

public class Pallindropme1 {
	private int[] arr;
	private int size, top;

	public Pallindropme1() {
		size = 10;
		arr = new int[10];
		top = -1;
	}

	public Pallindropme1(int size) {

		arr = new int[size];
		top = -1;
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		if (top == size - 1) {
			return true;
		} else {
			return false;
		}
	}

	public int push(int data) {
		if (isFull() == false) {
			top = top + 1;
			arr[top] = data;
			return data;
		} else {
			System.out.println("stack is full");
			return -2;
		}
	}

	public int pop() {
		if (isEmpty() == false) {
			int temp = arr[top];
			top = top - 1;
			int rem;
			int reversed=0;
			while (temp != 0) 
			{
				rem = temp % 10;
				reversed=(reversed*10)+rem;
				temp = temp / 10;
				

			}
			
			
			if(temp==reversed) {
				System.out.println("pallindrome");
			}
			else {
				System.out.println("Not Pallindrome");
			}
			return reversed;
			
		} else {
			System.out.println("stack is empty");
              return -1;
			
		}
	}

	public int peek() {
		if (isFull() == false && isEmpty() == false) {
			int temp = arr[top];
			return temp;
		} else {
			System.out.println("stack is empty");
			return -1;
		}
	}
}
