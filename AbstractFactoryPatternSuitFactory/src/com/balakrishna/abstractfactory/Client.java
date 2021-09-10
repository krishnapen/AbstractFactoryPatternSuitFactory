package com.balakrishna.abstractfactory;

public class Client {
	
	public static void main(String[] args) {
		
		Suit calvinKlein = FactoryGenerator.getFactory(FactoryType.SuitFactory).getSuit(SuitType.CalvinKlein);
		System.out.println(calvinKlein.getDetails());
		
		Suit nautica = FactoryGenerator.getFactory(FactoryType.SuitFactory).getSuit(SuitType.Nautica);
		System.out.println(nautica.getDetails());
		
		Suit tommyHilfiger = FactoryGenerator.getFactory(FactoryType.SuitFactory).getSuit(SuitType.TommyHilfiger);
		System.out.println(tommyHilfiger.getDetails());
	}

}
