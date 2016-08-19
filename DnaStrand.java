
public class DnaStrand {

	public static String makeComplement(String dna)
	{
		  String final_string = new String();
		  
		  for(int i =0; i < dna.length(); i++)
		  {
			char ch = dna.charAt(i);
		  	 
		 switch (ch)
		 {
		  case 'A' : { ch = 'T'; break;}
		  case 'T' : {ch = 'A'; break;}
		  case 'G' : { ch = 'C'; break;}
		  case 'C': {ch = 'G'; break;}
		  };
		  
		  final_string = final_string + ch;
		  	}
		  
		  return final_string;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(makeComplement("AAAA"));
		System.out.println(makeComplement("ATTGC"));
		System.out.println(makeComplement("GTAT"));
	}

}
