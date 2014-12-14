package bg.uni.sofia.fmi.corejava.bulls_and_cows.input;

import bg.uni.sofia.fmi.corejava.bulls_and_cows.exceptions.AbstractBaseException;
import bg.uni.sofia.fmi.corejava.bulls_and_cows.validators.IValidator;

public class InputReader {

	private InputScanner inputScanner;

	public InputReader() {
		inputScanner = InputScanner.getInstance();
	}

	public String collectInput(IValidator validator, String infoMsg) {
		System.out.println(infoMsg);
		String inputStr = inputScanner.readLine();

		try {
			validator.validate(inputStr);
		} catch (AbstractBaseException e1) {
			System.out.println(e1.getErrorMsg());
			return collectInput(validator, infoMsg);// Recursion
		} catch (Exception e2) {
			e2.printStackTrace();
			return collectInput(validator, infoMsg);// Recursion
		}

		return inputStr;
	}

	public void closeReader() {
		inputScanner.closeScanner();
	}
}
