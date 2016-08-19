
public class TestItAll {

	public static String Testit(String s){
        if (s.length() <=1) return s;
        if (s.length() > 1 & s.length() <= 2) return s.substring(0,1);
        if (s.length() > 2 & s.length() <= 4) return s.substring(0, s.length()/2);
        if (s.length() > 4 )
        	{
        	if ((s.length() % 2) == 0 ) return s.substring(0, s.length()/2);
        	if ((s.length() % 2) != 0 )
        		{
        	    		return s.substring(0, s.length()/2);
    		}
        	
        	}
        return "a";
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(Testit ("aa"));
		//System.out.println(Testit ("aaaaaa"));
		//System.out.println(Testit ("fmdmhzrd"));
		//System.out.println(Testit ("gqwbzlnjobvfxco"));
		//System.out.println(Testit ("iplpqmtjoizox"));
		System.out.println(Testit ("jzrdylausiovyasgbqjm"));
		//rkrknrmmik
		
		//lnooltx
	}

}
