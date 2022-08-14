package recursion_and_backtracking_imp_questions;
import java.util.*;
class CoinChange1 {

	public static void solve(int i,int sum,int[] arr,String asf,int amt) {
		if(i == arr.length) {
			if(sum==amt) {
				System.out.println(asf);
			}
			return;
		}
		solve(i+1,sum+arr[i],arr,asf+arr[i]+"-",amt);
		solve(i+1,sum,arr,asf,amt);
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
		solve(0,0,arr,"",amt);
	}

}
