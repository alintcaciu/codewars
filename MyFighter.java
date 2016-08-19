
public class MyFighter {
	
	public class Fighter {
		  public String name;
		  public int health, damagePerAttack;
		  public Fighter(String name, int health, int damagePerAttack) {
		    this.name = name;
		    this.health = health;
		    this.damagePerAttack = damagePerAttack;
		  
		}
	}
	public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
	    // Your code goes here. Have fun!
		if(fighter1.name == firstAttacker)
		{
		  fighter1.health= fighter1.health - fighter1.damagePerAttack;
		}
	  if (fighter2.name == firstAttacker)
	  {
		  fighter2.health = fighter2.health - fighter2.damagePerAttack;
	  }
	  
	 do
	 {
		 if(fighter1.name == firstAttacker)
			 {
			 fighter1.health = fighter1.health - fighter1.damagePerAttack;
			 }
		 if(fighter2.name == firstAttacker)
			 {
			 fighter2.health = fighter2.health - fighter2.damagePerAttack;
			 }
	 }
	 
	while ((fighter1.health >0) || (fighter2.health > 0));
	 if (fighter1.health <0) return fighter2.name;
	 return fighter1.name;
	 
	  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyFighter.Fighter a = new MyFighter.Fighter("Lew", 10, 2);
		MyFighter.Fighter b = new MyFighter.Fighter("Harry", 5, 4);
		//MyFighter.Fighter c = new MyFighter.Fighter("Lew", 5, 4);
		
		
		declareWinner(b,new Fighter("Lew", 5, 4), "Lew");
		

}}

