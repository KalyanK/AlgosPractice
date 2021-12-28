

public class MergeSort{

	public static void main(String[] args){
		MergeSort1();
	}

	public static void MergeSort1(){

		//List<integer> A = new List<integer>{2,5,8,4};
		//List<integer> B = new List<integer>{3,6,1,7};


		//Sorted arrays 
		int[] A = new int[] {2,4,5,8};
		int[] B = new int[] {1,3,6,7 };
		int[] C = new int[111];
		//List<integer> A = new List<integer>{2,4,5,8};
		//List<integer> B = new List<integer>{1,3,6,7}; 
		//List<integer> c = new List<integer>(); 

		System.out.println("A OF 0"+A[0]);
		System.out.println("A OF 1 "+A[1]);
		int i=0;
		int j =0;  

		for(int k = 0 ; k<8; k++){

			if(A[i] < B[j]){
				System.out.println("value of k in if: "+k);
				C[k] = A[i];
				System.out.println("value of C[k] in if: "+C[k]);

				i++;
			}
			else {
				System.out.println("value of k in else: "+k);
				C[k] = B[j];
				System.out.println("value of C[k] in else: "+C[k]);

				j++;
			}
		}

		for(int k = 0 ; k<8; k++){
		System.out.println("Sorted Array C: "+ C[k]);
		}
	}

}
