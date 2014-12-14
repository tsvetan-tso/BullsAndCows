package bg.uni.sofia.fmi.corejava.bulls_and_cows.exceptions;

public abstract class AbstractBaseException extends Exception {

	private static final long serialVersionUID = 1L;

	public abstract String getErrorMsg();
}
