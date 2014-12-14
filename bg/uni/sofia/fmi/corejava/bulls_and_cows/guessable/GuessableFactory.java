package bg.uni.sofia.fmi.corejava.bulls_and_cows.guessable;

import bg.uni.sofia.fmi.corejava.bulls_and_cows.enums.GuessableTypesEnum;

public class GuessableFactory {

	public static Guessable createGuessable(GuessableTypesEnum guessableType) {
		switch (guessableType) {
		case INT_GUESSABLE:
			return new IntegerGuessable();
		case CHAR_GUESSABLE:
			return new CharacterGuessable();
		default:
			return new IntegerGuessable();
		}
	}
}
