
public class InversionPairs_BruteForce {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InversionPairs();
	}
	
	public static void InversionPairs(){
		int[] A = new int[] {2,1,4,3};
		int k = 0;
		
		
		for(int i = 0;i<4; i++){
			for(int j =0; j < 4; j++){
				if(A[i]<A[j]){
					k++;
				}
			}
		}
		System.out.println("Number of inversion pairs "+k);
		
	}

}
