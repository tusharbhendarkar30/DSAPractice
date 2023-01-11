package inseretionsort;

public class InsertionSort {
      public static int Insertionsort(int [] array) {
    	  for (int i = 0; i < array.length; i++) {
    		  for (int j = 0; j !=i; j++) {
    			  if(array[i]<array[j]) {
    				  int temp=array[i];
    				  array[i]=array[j];
    				  array[j]=temp;
    				  
    			  }
				
			}
			
		}
    	  return array.length;
      }
}
