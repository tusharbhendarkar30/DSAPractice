package bubblesort;

public class TesterBubbleSort {

	public static void main(String[] args) {

		int [] arr= {10,3,2,5,20,6,4,8,30};
		
		for (int i : arr) {
            System.out.print(i+" ");			
		}
		System.out.println();
		Bubblesort.bubblesort(arr);
		System.out.println("After sorting");
		for (int i : arr) {
			System.out.print(i+" ");
			
			
		}
		

	}

}
