
public class Checkchoose {

	public static long factorial(int n)
	{
		long rezultatFactorial = 1;
		
		for(int i = 1; i < n; i++)
		{
			rezultatFactorial = rezultatFactorial * (i+1); 
		}
		return rezultatFactorial;
	}
	
	public static long checkchoose(long m, int n)
	{
	long rezultat = -1;
	
	
		for(int i = 0; i < n ; i++)
		{
			if (m == factorial (n)/(factorial(i) * factorial(n - i)))
			{
				rezultat = i;
				//System.out.println(i);
				//System.out.println(rezultat);
				break;
			}
							
		}
		if (m == n )
			{
			rezultat = 1;
			}
		System.out.println(rezultat);
		
		if (n > m)
	    {
			
	    }
		return rezultat;
		
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(factorial(2));

//System.out.println(factorial(3));

//System.out.println(factorial(1));
//System.out.println(factorial(19));

		
//checkchoose(6, 4); //bine
//checkchoose(4, 4); //bine
//checkchoose(35, 7); //bine
//checkchoose(4, 2); //bine
//checkchoose(36, 7); ///bine
//checkchoose(20, 6); ///bine
//checkchoose(17383860, 27); ///bine
		//checkchoose(129024480, 32); ///bine
		//checkchoose(91, 14); ///bine
		//checkchoose(75583, 19); ///bine
		checkchoose(21, 6); ///bine
		
		
	}

}
