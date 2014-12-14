package bg.uni.sofia.fmi.corejava.bulls_and_cows.exceptions;

public class InvalidGuessableTypeException extends AbstractBaseException {

	private static final long serialVersionUID = 1L;

	@Override
	public String getErrorMsg() {
		return "Only values '1' or '2' are correct !";
	}

}
