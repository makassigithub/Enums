/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author makas
 */
public class EnumDemo {
	
    enum Human {
	//Enum are list of constant, typed as their container (Human) if their with a normal class, they work like inner classes.
	Brahima,Khaled,Claver,Ndsoga
	}
	public static void main(String...args){
	
	// Enums are not instanciated like classes but like primitives
	Human hm;
	
   //Enumerations in the container are implicitly public static final
   //Their are then accessed statically
	hm = Human.Brahima;
	System.out.println(hm);
	
	/* The enums are known with essential methods : Values() and getValue() 
	 values() return an array of the Container Type wchich also the type of each enumeration as well
	  */
	System.out.println("Let's print induvidual enumerations");
		Human [] humans = Human.values();
		//The loop could be  written for(Human hum : Human.values(){....}
		for(Human hum: humans){
			
			System.out.println(hum);
		}
		
		// Enums can also be used for switch cases.
		System.out.println("Let's switch with enums");
		Human m = Human.Ndsoga;
		switch (m){
		case Brahima:
			System.out.println("Brahima was a geolist before");
			break;
		case Khaled:
			System.out.println("Khaled is a tall guy");
			break;
		case Claver:
			System.out.println("Claver is a Burkinabe");
			break;
		case Ndsoga:
			System.out.println("Ndsoga is a really cool guy");
			break;
		}	
		
	// From here we start playing with the second enum type
		
		System.out.println("Let's play with wordays now");
		
		MyWorkDays wd;
		wd = MyWorkDays.Monday;
		System.out.println("On " + wd + " I work "+ wd.getHour()+ " HOURS");
		
		
	}
	/*Because Enums work like classes (although they can't instantiated with the new = keyword)
	 The can have constructors and methods and instance variable*/
	
	
	public enum MyWorkDays {
		Monday(8), Tuesday(10), Friday(5);
	   
		private int hours;
		
		//Constructor
		 MyWorkDays(int hourly){
		this.hours = hourly;
		
	}
	    // getter
		 
		 int getHour(){ return hours;}
		 // Now let's create one enumeration;
		 
		
	}
}
