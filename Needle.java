import java.util.Collections;
import java.util.List;

public class Needle {

	public static String findNeedle(Object[] haystack) {
	    // Your code here
		String return_string = "";
		int counter = 0;
		
				
	  for(Object in : haystack)
	  		{
		  counter++;
		  if (in != null) 
		  		  {
			  		
		  		  	if (in.toString() == "needle") return_string = "found the needle at position " + Integer.toString(counter-1);
		  		  }
	  		}
	  System.out.println(return_string);
	  return return_string;
	  
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
	    Object[] haystack2 = {"283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle", "something somebody lost a while ago"};
	    Object[] haystack3 = {1,2,3,4,5,6,7,8,8,7,5,4,3,4,5,6,67,5,5,3,3,4,2,34,234,23,4,234,324,324,"needle",1,2,3,4,5,5,6,5,4,32,3,45,54};

	    findNeedle(haystack1);
	    findNeedle(haystack2);
	   findNeedle(haystack3);
	    
	}

}
