import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * 
 */

/**
 * @author atcaciu
 *
 */

public class StringUtils {

	/**
	 * @param args
	 */		  
		  public static boolean isDigit(String s) {
		    // your code goes here
		    //if (s.matches("-?\\d+(\\.\\d+)?")) return true;
			  if (s.matches("\\d")) return true;
		    return false;
		  }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(StringUtils.isDigit(""));
		System.out.println(StringUtils.isDigit("7"));
		System.out.println(StringUtils.isDigit(" "));
		System.out.println(StringUtils.isDigit("a"));
		System.out.println(StringUtils.isDigit("a5"));
		System.out.println(StringUtils.isDigit("14"));
				

	}

}
