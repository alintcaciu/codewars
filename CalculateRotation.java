
public class CalculateRotation {
	
	static String rotateOnce(String once)
	{
		String rotated ="";
		
		rotated = once.substring(once.length()-1, once.length()) + once.substring(0, once.length() -1);
		//System.out.println(rotated);
		return rotated;
	}
	
	static int shiftedDiff(String first, String second)
	{
  //System.out.println("first >>" +first);
  //System.out.println("second >>" + second);
  
		String rotated2 = first;
		int returnIndex = -1;
		int compareStrings = 1;
		compareStrings = first.compareTo(second);
		if (compareStrings == 0 ) returnIndex = 0;
		
		else
		{
		for(int i = 0; i < first.length();i++)
			{
			rotated2 = rotateOnce(rotated2);
			compareStrings = rotated2.compareTo(second); 
			if (compareStrings == 0) {
				//System.out.println("rotated2  >> " + rotated2);
				 returnIndex = i + 1;
				 break;
				} 
			}
		}
	    return returnIndex;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(shiftedDiff("hoop", "pooh"));
//System.out.println(shiftedDiff("coffee","eecoff"));
//System.out.println(shiftedDiff("eecoff","coffee"));
//System.out.println(shiftedDiff("NV)*{gY8YR(*9{ <","NV)*{gY8YR(*9{ <"));
//System.out.println(shiftedDiff("hY>}X","hY>}X"));
			
	}

}
