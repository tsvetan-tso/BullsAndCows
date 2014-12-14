package bg.uni.sofia.fmi.corejava.bulls_and_cows.validators;

import bg.uni.sofia.fmi.corejava.bulls_and_cows.Game;
import bg.uni.sofia.fmi.corejava.bulls_and_cows.exceptions.InvalidElementsCountException;

public abstract class ElementsCountValidator implements IValidator {

	@Override
	public void validate(String str) throws Exception {
		if (str.length() != Game.elementsCount) {
			throw new InvalidElementsCountException();
		}
	}
}
