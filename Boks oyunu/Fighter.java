public class Fighter {
	
	String name;
	int health;
	int weight;
	int damage;
	double dodge;
	
	public Fighter(String name, int health, int weight, int damage, double dodge) {
		
		this.name = name;
		this.health = health;
		this.weight = weight;
		this.damage = damage;
		this.dodge = dodge;
	}
	
	
	public int hit(Fighter fighter) {
		 System.out.println("------------");
	     System.out.println(this.name + " => " + fighter.name + " " +  this.damage + " hasar vurdu.");
		
	     if (fighter.dodge()) {
	    	 
	    	 System.out.println(fighter.name + " gelen hasarý savurdu.");
	            return fighter.health;
			
		}
	     
	     if (fighter.health-this.damage <0) {
			return 0;
		}
	     
	     return fighter.health-this.damage;
	     
	     
	
	}
	
	public boolean dodge() {
		double randomvalue=Math.random()*100;
		
		return randomvalue <=this.dodge;
		
	}

}