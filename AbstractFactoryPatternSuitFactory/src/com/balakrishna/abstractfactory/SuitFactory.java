package com.balakrishna.abstractfactory;

public class SuitFactory extends AbstractSuitFactory {

	@Override
	Suit getSuit(SuitType suitType) {

		switch (suitType) {
		case CalvinKlein:
			return new CalvinKlein("Blue", "44L", "$149");
		case Nautica:
			return new Nautica("Black", "44L", "$300");
		case TommyHilfiger:
			return new TommyHilfiger("White", "44L", "$180");
		}

		return null;
	}

}
