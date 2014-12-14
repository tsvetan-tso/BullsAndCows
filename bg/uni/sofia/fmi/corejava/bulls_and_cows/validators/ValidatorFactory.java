package bg.uni.sofia.fmi.corejava.bulls_and_cows.validators;

import bg.uni.sofia.fmi.corejava.bulls_and_cows.enums.GuessableTypesEnum;

public class ValidatorFactory {
	public static IValidator createValidator(GuessableTypesEnum guessableType) {
		switch (guessableType) {
		case INT_GUESSABLE:
			return new IntegerValidator();
		case CHAR_GUESSABLE:
			return new CharacterValidator();
		default:
			return new IntegerValidator();
		}

	}
}
