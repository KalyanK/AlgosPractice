
public class QuickSort {

	//NOT WORKING YET
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Partition();

	}
	
	public static void Partition(){
		
		int[] A = new int[] {2,1,7,3,6,5,4};
		int pivot = A[0];//TAKING PIVOT AS FIRST ELEMENT
		int l = 0;
		
		int i = l+1;
		int temp;
		int temp1;
		
		for(int j=l+1; j<7; j++){
			
			if(A[j]<pivot){
				//swap A[j] and A[i]
			    temp = A[j];
			    A[j] = A[i];
			    A[i] = temp;
			}
			i = i+1;
		}
		
		temp1 = A[l];
		A[l] = A[i-1];
		A[i-1] = temp1;
	
		for(int k = 0 ; k<7; k++){
			System.out.println("Partitioned Array A: "+ A[k]);
		}
		
	}
	
	/*public static void Partition(){
		
		int[] A = new int[] {2,1,7,3,6,5,4};
		int pivot = A[0];//TAKING PIVOT AS FIRST ELEMENT
		int[] C = new int[111];
		int min = 0;
		int max = 6;
		
		for(int i = 1; i< 7; i++){
			
			if(A[i] < pivot){
				C[min] = A[i];
				System.out.println("value from A IN FIRST IF"+A[i]);
				min++;
			}
			if(A[i] > pivot){
				C[max] = A[i];
				System.out.println("value from A IN second IF"+A[i]);
				max--;
			}
			if(min == max){
				C[max] = A[0];
				System.out.println("value from A IN third IF"+A[0]);

			}
			
		}
		
		for(int k = 0 ; k<7; k++){		
	      System.out.println("Array after Quick Sort"+A[k]);	
		}
	}*/

}
