package bg.uni.sofia.fmi.corejava.bulls_and_cows.guessable;

import java.util.Arrays;
import java.util.Random;

import bg.uni.sofia.fmi.corejava.bulls_and_cows.Game;
import bg.uni.sofia.fmi.corejava.bulls_and_cows.result.Result;

public class IntegerGuessable extends Guessable {

	private int[] elements = new int[Game.elementsCount];;

	public IntegerGuessable() {
		initializeRandomGuessable();
	}

	public IntegerGuessable(int[] elements) {
		this.elements = elements;
	}

	@Override
	protected void generateRandomElements() {
		int[] elements = new int[Game.elementsCount];

		for (int i = 0; i < Game.elementsCount; i++) {
			int element = generateRandomInt();
			System.out.print(element);// For debug purposes
			elements[i] = element;
		}
		System.out.println();// For debug purposes
		this.elements = elements;
	}

	private int generateRandomInt() {
		int min = 0;
		int max = 9;
		Random rand = new Random();
		int randomInt = rand.nextInt((max - min) + 1) + min;
		return randomInt;
	}

	@Override
	protected boolean hasDuplicate() {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length; j++) {
				if (i == j) {
					continue;
				}
				if (elements[i] == elements[j]) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return Arrays.toString(elements);
	}

	@Override
	protected Guessable parseGuessable(String str) {
		char[] chars = str.toCharArray();
		int[] elements = new int[Game.elementsCount];

		for (int i = 0; i < Game.elementsCount; i++) {
			elements[i] = Integer.parseInt(chars[i] + "");
		}

		return new IntegerGuessable(elements);
	}

	@Override
	public int getElementsCount() {
		return elements.length;
	}

	@Override
	protected Result match(Guessable guessable) {
		int bulls = 0;
		int cows = 0;

		if (guessable instanceof IntegerGuessable) {
			for (int i = 0; i < this.getElementsCount(); i++) {
				for (int j = 0; j < guessable.getElementsCount(); j++) {
					if (elements[i] == ((IntegerGuessable) guessable)
							.getElementAt(j)) {
						if (i == j) {
							bulls++;
						} else {
							cows++;
						}
					}
				}
			}
			return new Result(bulls, cows);
		}
		return null;
	}

	public int getElementAt(int index) {
		return this.elements[index];
	}
}
