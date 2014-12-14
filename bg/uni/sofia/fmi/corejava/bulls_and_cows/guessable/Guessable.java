package bg.uni.sofia.fmi.corejava.bulls_and_cows.guessable;

import bg.uni.sofia.fmi.corejava.bulls_and_cows.result.Result;

public abstract class Guessable {

	protected void initializeRandomGuessable() {
		System.out.println("Randomly generated guessable is :");// For debug
																// purposes
		do {
			generateRandomElements();
		} while (hasDuplicate());
	}

	protected abstract void generateRandomElements();

	protected abstract boolean hasDuplicate();

	public Result guess(String stringToGuess) {
		Guessable guessable = parseGuessable(stringToGuess);
		return match(guessable);
	}

	protected abstract Guessable parseGuessable(String str);

	protected abstract Result match(Guessable guessable);

	public abstract int getElementsCount();
}
