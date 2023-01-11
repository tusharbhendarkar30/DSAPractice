package bubblesort;

public class Bubblesort {
	
    public static int bubblesort(int []arr) {
    	int pass=arr.length-1;
    	int comp=arr.length-1;
    	for (int i = 0; i < pass; i++) {
    		for (int j = 0; j < comp-i; j++) {
    			if(arr[j]>arr[j+1]) {
    				int temp=arr[j];
    				arr[j]=arr[j+1];
    				arr[j+1]=temp;
    			}
    			
				
			}
    		
			
		}
    	
    	return arr.length;
    }
}
