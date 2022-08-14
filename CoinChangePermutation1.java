package recursion_and_backtracking_imp_questions;
import java.util.*;
class CoinChangePermutation1 {

	public static void solve(String asf,int amt,boolean[] used,int[] arr) {
		if(amt ==0) {
			System.out.println(asf);
			return;
		}
		
		
		for(int i=0;i<arr.length;i++) {
			if(used[i]==false) {
				used[i] = true;
				solve(asf+arr[i]+"-",amt-arr[i],used,arr);
				used[i] = false;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int amt = sc.nextInt();
		boolean[] used = new boolean[n];
		solve("",amt,used,arr);
	}

}
