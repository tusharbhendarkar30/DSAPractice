package mergeSort;

public class TesterMerge {
	public static void main(String[] args) {
		int []arr= {2,1,7,9,6,8,3};
		MergeSort.divide(arr, 0, 6);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
