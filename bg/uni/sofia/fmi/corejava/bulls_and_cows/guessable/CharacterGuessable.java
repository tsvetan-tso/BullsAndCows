package bg.uni.sofia.fmi.corejava.bulls_and_cows.guessable;

import java.util.Arrays;
import java.util.Random;

import bg.uni.sofia.fmi.corejava.bulls_and_cows.Game;
import bg.uni.sofia.fmi.corejava.bulls_and_cows.result.Result;

public class CharacterGuessable extends Guessable {

	private char[] elements = new char[Game.elementsCount];;

	public CharacterGuessable() {
		initializeRandomGuessable();
	}

	public CharacterGuessable(char[] elements) {
		this.elements = elements;
	}

	@Override
	protected void generateRandomElements() {
		char[] elements = new char[Game.elementsCount];

		for (int i = 0; i < Game.elementsCount; i++) {
			char element = generateRandomChar();
			System.out.print(element);// For debug purposes
			elements[i] = element;
		}
		System.out.println();// For debug purposes
		this.elements = elements;
	}

	private char generateRandomChar() {
		Random rand = new Random();
		char ch = (char) (rand.nextInt(26) + 'a');
		return ch;
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
	protected Guessable parseGuessable(String str) {
		char[] chars = str.toCharArray();
		return new CharacterGuessable(chars);
	}

	@Override
	public int getElementsCount() {
		return elements.length;
	}

	@Override
	public String toString() {
		return Arrays.toString(elements);
	}

	@Override
	protected Result match(Guessable guessable) {
		int bulls = 0;
		int cows = 0;

		if (guessable instanceof CharacterGuessable) {
			for (int i = 0; i < this.getElementsCount(); i++) {
				for (int j = 0; j < guessable.getElementsCount(); j++) {
					if (elements[i] == ((CharacterGuessable) guessable)
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

	public char getElementAt(int index) {
		return this.elements[index];
	}
}
