import java.util.ArrayList;

public class MonkeyCounter {
	 
	public static int[] monkeyCount(final int n){
		  int[] x = new int [n+1];
		  
		  for(int i = 1; i<=n; i++)
		  x[i] = i;
		  System.out.println();
		  return x;
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(monkeyCount(3));
		int[] n = monkeyCount(20);
		for (int i = 1; i <n.length ;i++)
		{
		if (i == (n.length-1)) System.out.print(n[i] +"\n");
		else System.out.print(n[i] + ",");
		}
		
		//System.out.println(monkeyCount(3));
		//System.out.println(monkeyCount(9));
		//System.out.println(monkeyCount(10));
		//System.out.println(monkeyCount(20));
		//System.out.println(monkeyCount(5));
		//System.out.println(monkeyCount(5));
		
	}

}
