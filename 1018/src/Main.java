import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Chess ch = new Chess();
		
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		boolean[][] tileList = new boolean[N][M]; 
		
		for(int i =0; i<N; i++) {
			String str = sc.nextLine().trim();
			for(int j =0; j<M; j++) {
				if(str.charAt(j)=='W') {
					tileList[i][j] = true;
				}
				else {
					tileList[i][j] = false;
				}
			}
		}
		
		
		for(int i=0; i<N-7; i++) {
			for(int j=0; j<M-7; j++) {
				
			}
		}
		int result = ch.findNum(tileList, N, M);
		
		System.out.println(result);
	}
}
