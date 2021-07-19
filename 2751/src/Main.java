import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] numList = new int[N];
		
		for(int i =0; i<N; i++) {
			numList[i] = sc.nextInt();
		}
		
		quickSort(numList, 0, numList.length-1);
		
		for(int i =0; i<numList.length; i++) {
			System.out.println(numList[i]);
		}
	}

	public static int partition(int[] numList, int left, int right) {
		
		
		
		//�Ǻ��� �ǿ��ʰ�����
		int pivot = numList[left];
		int t_left = left;
		int t_right = right;
		
		
		while(t_left < t_right) {
			while(pivot < numList[t_right]) {
				t_right--;
			}
			while((numList[t_left] <= pivot) && (t_left < t_right)) {
				t_left++;
			}
			int temp = numList[t_left];
			numList[t_left] = numList[t_right];
			numList[t_right] = temp;
		}
		
		numList[left] = numList[t_left];
		numList[t_left] = pivot;
		
		return t_left;
	}
	
	public static void quickSort(int[] numList, int left, int right) {
		if(left < right) {
			int newPivot = partition(numList, left, right);
			
			quickSort(numList, left, newPivot-1);
			quickSort(numList, newPivot+1, right);
		}
		
	}
}
