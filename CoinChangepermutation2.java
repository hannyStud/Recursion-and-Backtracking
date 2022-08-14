package recursion_and_backtracking_imp_questions;
import java.util.*;
class CoinChangepermutation2 {

	public static void solve(String asf,int amt,boolean[] used,int[] arr) {
		if(amt < 0) {
			return;
		}
		if(amt ==0) {
			System.out.println(asf);
			return;
		}
		
		if(amt>0) {
		for(int i=0;i<arr.length;i++) {
				solve(asf+arr[i]+"-",amt-arr[i],used,arr);
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
