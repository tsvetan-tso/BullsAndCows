package bg.uni.sofia.fmi.corejava.bulls_and_cows.validators;

import bg.uni.sofia.fmi.corejava.bulls_and_cows.exceptions.InvalidDigitException;

public class IntegerValidator extends ElementsCountValidator {

	@Override
	public void validate(String str) throws Exception {
		try {
			super.validate(str);
		} catch (Exception e) {
			throw e;
		}
		
		char[] inputArray = str.toCharArray(); 
		for (Character ch : inputArray) {
			if (! Character.isDigit(ch)) {
				throw new InvalidDigitException();
			}
		}
	}
}
