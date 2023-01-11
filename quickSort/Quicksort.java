package quickSort;

public class Quicksort {
	 public static void quickSort(int[] arr, int left, int right) {
		 if(left<right) {
			 int pivotidx=partition(arr,left,right);
			 quickSort(arr,left,pivotidx-1);
			 quickSort(arr,pivotidx+1,right);
		 }
		
		 
	 }
	 public static int partition(int[] arr, int left, int right) {
		 int pivot=arr[right];
		 int i=left-1;
		 for(int j=left;j<right;j++) {
			 if(arr[j]<pivot) {
				 i++;
				 int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			 }
			 
			 
		 }
		 i++;
		 int temp=arr[i];
		 arr[i]=pivot;
		 arr[right]=temp;
		 return i;
		 
	 }
//	        if (left >= right) {
//	            return;
//	        }
//
//	        int pivotLoc = partition(arr, left, right);
//	        quickSort(arr, left, pivotLoc - 1);
//	        quickSort(arr, pivotLoc + 1, right);
//	    }
//	  public static int partition(int[] arr, int left, int right) {
//
//	        int pivot = arr[left];
//
//	        while (left != right) {
//
//	            while (arr[right] > pivot && left != right) {
//	                right--;
//	            }
//
//	            if (left != right) {
//	                arr[left] = arr[right];
//	                left++;
//	            }
//
//	            while (arr[left] < pivot && left != right) {
//	                left++;
//	            }
//
//	            if (left != right) {
//	                arr[right] = arr[left];
//	                right--;
//	            }
//	        }
//
//	        arr[left] = pivot;
//
//	        return right;
//	    }


}
