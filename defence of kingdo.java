//

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while(a>0){
		    a--;
		int wd = sc.nextInt();
		int ht = sc.nextInt();
		int cd = sc.nextInt();
		
        ArrayList<Integer> xp = new ArrayList<>();
        ArrayList<Integer> yp = new ArrayList<>();
		xp.add(0);
		yp.add(0);
		
		for(int i = 0; i < cd; i++){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		   xp.add(x);
		   yp.add(y);
		}
		xp.add(wd+1);
		yp.add(ht+1);
		Collections.sort(xp);
		Collections.sort(yp);
		
		int max_xd = 0;
		int max_yd = 0;
		
		for(int i = 0; i < xp.size()-1; i++){
		     max_xd = Math.max(max_xd, xp.get(i+1)-xp.get(i)-1);
		     max_yd = Math.max(max_yd, yp.get(i+1)-yp.get(i)-1); 
		}
		System.out.println(max_xd*max_yd);
		}
	}
}
