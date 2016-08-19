
import java.util.ArrayList;

public class SortDeckRanks {
	

	
	public static String[] sortCards (String[] cards) {
		  ArrayList<String> a0 = new ArrayList<String>();
		  ArrayList<String> a1 = new ArrayList<String>();
		  ArrayList<String> a2 = new ArrayList<String>();
		  ArrayList<String> a3 = new ArrayList<String>();
		  ArrayList<String> a4 = new ArrayList<String>();
		  ArrayList<String> a5 = new ArrayList<String>();
		  ArrayList<String> a6 = new ArrayList<String>();
		  ArrayList<String> a7 = new ArrayList<String>();
		  ArrayList<String> a8 = new ArrayList<String>();
		  ArrayList<String> a9 = new ArrayList<String>();
		  ArrayList<String> a10 = new ArrayList<String>();
		  ArrayList<String> a11 = new ArrayList<String>();
		  ArrayList<String> a12 = new ArrayList<String>();
		  ArrayList<String> n = new ArrayList<String>();
	
		  String[] s = new String[cards.length];
	 
		  
		  for(String m : cards)
		  {
			  switch (m)
			  {
			  case "A": { a0.add("A"); break;}
			  case "2": { a1.add("2"); break;}
			  case "3": { a2.add("3"); break;}
			  case "4": { a3.add("4"); break;}
			  case "5": { a4.add("5"); break;}
			  case "6": { a5.add("6"); break;}
			  case "7": { a6.add("7"); break;}
			  case "8": { a7.add("8"); break;}
			  case "9": { a8.add("9"); break;}
			  case "T": { a9.add("T"); break;}
			  case "J": { a10.add("J"); break;}
			  case "Q": { a11.add("Q"); break;}
			  case "K": { a12.add("K"); break;}
			  }
		  }
		
			
		n.addAll(a0);
		n.addAll(a1);
		n.addAll(a2);
		n.addAll(a3);
		n.addAll(a4);
		n.addAll(a5);
		n.addAll(a6);
		n.addAll(a7);
		n.addAll(a8);
		n.addAll(a9);
		n.addAll(a10);
		n.addAll(a11);
		n.addAll(a12);
	
		  try
		  {
			 s = n.toArray(new String[0]); 
		  }
		  
		  catch (ArrayStoreException e)
		  {System.out.println(e);
		   }
				
		  System.out.println(s.length);
		return s;
		    /// Fill me
		  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sortCards(new String []{"3", "9", "A", "5", "T", "8", "2", "4", "Q", "7", "J", "6", "K"});
		sortCards(new String []{"Q", "2", "8", "6", "J", "K", "3", "9", "5", "A", "4", "7", "T"});
		sortCards(new String []{"5", "4", "T", "Q", "K", "J", "6", "9", "3", "2", "7", "A", "8"});

	}

}
