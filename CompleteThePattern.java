
public class CompleteThePattern {

	public static String pattern ( int n) {
        //Happy Coding ^_^
		String s = new String("");
		int x = n;
		if (x < 1) return ""; 
		if (x == 1) return String.valueOf(x);
		do
		{
			for(int i = n; i > n - x ;i--)
				{
					s = s + String.valueOf(i);
					
				}
			 if (x > 1) {
				 s = s + "\n";
			 }
			 
		x = x - 1;
		}	
		while (x >= 1);
				
		//System.out.println(s);
		return s;
   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pattern(5));
	}

}
