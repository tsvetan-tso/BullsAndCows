package bg.uni.sofia.fmi.corejava.bulls_and_cows.exceptions;

public class InvalidCharacterException extends AbstractBaseException {

	private static final long serialVersionUID = 1L;

	public String getErrorMsg() {
		return "There is at least one element that is not a character !";
	}
}
