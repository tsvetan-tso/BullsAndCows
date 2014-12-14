package bg.uni.sofia.fmi.corejava.bulls_and_cows.exceptions;

import bg.uni.sofia.fmi.corejava.bulls_and_cows.Game;

public class InvalidElementsCountException extends AbstractBaseException {

	private static final long serialVersionUID = 1L;

	public String getErrorMsg() {
		return "The number of items is different than " + Game.elementsCount
				+ " !";
	}
}
