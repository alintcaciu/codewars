
public class Kata {

	public static String getMiddle(String word) {
	    //Code goes here!
		int n = (word.length()/2);
				
		if (word.length() % 2 == 0) return word.substring(n-1, n+1 );
		
		else return word.substring(n, n+1);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(getMiddle("A"));
		System.out.println(getMiddle("AB"));
		System.out.println(getMiddle("ABC"));
		
		System.out.println(getMiddle("test"));
		System.out.println(getMiddle("middle"));
		System.out.println(getMiddle("testing"));
		

	}

}
