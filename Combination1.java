package recursion_and_backtracking_imp_questions;
import java.util.*;
class Combination1 {

	public static void combine(int i,int nboxes,int ritmes,int ssf,String asf) {
		if(i>nboxes) {
			if(ritmes==ssf) {
				System.out.println(asf);
			}
			return;
		}
		
		
		combine(i+1,nboxes,ritmes,ssf,asf+"-");
		combine(i+1,nboxes,ritmes,ssf+1,asf+"i");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nboxes = sc.nextInt();
		int ritmes = sc.nextInt();
		combine(1,nboxes,ritmes,0,"");
	}

}
