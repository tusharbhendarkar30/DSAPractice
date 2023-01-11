package quickSort;

import java.util.Scanner;

public class TesterQuick {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int [] arr=new int[size];
	    System.out.println("Enter the elements of array");
	   for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	    Quicksort.quickSort(arr, 0, arr.length -1);
	    System.out.println("after sorting");
	    for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
