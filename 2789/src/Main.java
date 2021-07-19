import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		BlackJack bj =new BlackJack();
		
		Scanner sc= new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] numList = new int[N];
		
		for(int i =0; i<N; i++) {
			numList[i] = sc.nextInt();
		}
		
		int result = bj.findJack(numList, N, M);
		System.out.println(result);
	}
	
	
}