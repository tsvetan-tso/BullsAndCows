package bg.uni.sofia.fmi.corejava.bulls_and_cows.validators;

import bg.uni.sofia.fmi.corejava.bulls_and_cows.exceptions.InvalidGuessableTypeException;

public class GuessableTypeValidator implements IValidator {
	
	@Override
	public void validate(String str) throws Exception {
		
		if ( !((str.length() == 1) && (str.equalsIgnoreCase("1") || str.equalsIgnoreCase("2"))) ) {
			throw new InvalidGuessableTypeException();
		}
	}
}
