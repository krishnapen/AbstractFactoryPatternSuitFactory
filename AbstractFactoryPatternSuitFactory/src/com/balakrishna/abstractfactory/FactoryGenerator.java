package com.balakrishna.abstractfactory;

public class FactoryGenerator {
	
	public static AbstractSuitFactory getFactory(FactoryType factoryType) {
		
		switch (factoryType) {
		case SuitFactory:
			return new SuitFactory();
		}
		return null;
		
	}

}
