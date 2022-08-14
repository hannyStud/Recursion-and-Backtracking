package recursion_and_backtracking_imp_questions;
import java.util.*;
class Combination2 {

	public static void combine(boolean[] boxes,int cb,int t,int ll) {
		if(cb>t) {
			for(int i=0;i<boxes.length;i++) {
				if(boxes[i]) {
					System.out.print("i");
				}else {
					System.out.print("-");
				}
			}
			System.out.println();
			return;
		}
		
		for(int i=ll+1;i<boxes.length;i++) {
			if(boxes[i]==false) {
				boxes[i] = true;
				combine(boxes,cb+1,t,i);
				boxes[i] = false;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  int box = sc.nextInt();
		  int item = sc.nextInt();
		  combine(new boolean[box],1,item,-1);
	}

}
