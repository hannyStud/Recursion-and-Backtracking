package recursion_and_backtracking_imp_questions;
import java.util.*;
class CoinChange2 {
	public static void solve(int i,int[] arr,String asf,int amt) {
		if(amt<0) {
			return;
		}
		if(i==arr.length) {
			if(amt==0) {
				System.out.println(asf);
			}
			return;
		}
//		if(amt==0) {
//			System.out.println(asf);
//			
//		}
		if(amt>0) {
		solve(i,arr,asf+arr[i]+"-",amt-arr[i]);
		}
		solve(i+1,arr,asf,amt);
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
				solve(0,arr,"",amt);
	}

}
