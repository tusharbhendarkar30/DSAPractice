package inseretionsort;

import java.util.Scanner;

public class TesterInsertionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter the elements");
	    for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}	
	    
	    InsertionSort.Insertionsort(arr);
	    System.out.println("after sorting");
	    for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
