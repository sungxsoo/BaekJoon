import java.util.Scanner;

public class BlackJack {
	
	public int findJack(int[] numList, int N, int M) {
		int result = 0;
		
		for(int i =0; i<N-2; i++) {
			for(int j=i+1; j<N-1; j++) {
				for(int k=j+1; k<N; k++) {
					int sum = numList[i] + numList[j] + numList[k];
					if(sum<=M&&sum>result) {
						result = sum;
					}
				}
			}
		}
		
		return result;
		
	}
}

	
