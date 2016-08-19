
public class FindOutlier {
	
static int find(int[] integers)
{
	int howManyOdds = 0;
	int howManyEven = 0;
	int rezultatFinal = 0;
		
	for(int i = 0; i <integers.length; i++)
		{
			if (integers[i]  % 2 == 0) 
				{howManyEven++;
				//System.out.println(howManyEven);
				}
			else{
				howManyOdds++;
				//System.out.println(howManyOdds);
				}
			
		}
	
	for(int i = 0; i <integers.length; i++)
			{
				if ((integers[i] % 2 != 0) && (howManyEven > howManyOdds))
				{
					rezultatFinal = integers[i];
					//System.out.println(rezultatFinal);
					break;
				}
			else
				if ((integers[i] % 2 == 0 ) && (howManyEven < howManyOdds))
				{
					rezultatFinal = integers[i];
					//System.out.println(rezultatFinal);
					break;}
			}
		
	
	return rezultatFinal;	
		  
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = {2,6,8,-10,3};
int[] a1 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};

		System.out.println(find(a1));
		
	}

}
