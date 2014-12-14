package bg.uni.sofia.fmi.corejava.bulls_and_cows;

import bg.uni.sofia.fmi.corejava.bulls_and_cows.enums.GuessableTypesEnum;
import bg.uni.sofia.fmi.corejava.bulls_and_cows.guessable.Guessable;
import bg.uni.sofia.fmi.corejava.bulls_and_cows.guessable.GuessableFactory;
import bg.uni.sofia.fmi.corejava.bulls_and_cows.input.InputReader;
import bg.uni.sofia.fmi.corejava.bulls_and_cows.result.Result;
import bg.uni.sofia.fmi.corejava.bulls_and_cows.validators.GuessableTypeValidator;
import bg.uni.sofia.fmi.corejava.bulls_and_cows.validators.ValidatorFactory;
import bg.uni.sofia.fmi.corejava.bulls_and_cows.validators.IValidator;

public class Game {

	public static final int elementsCount = 4;
	static final String gameLabel = "===============================================\n"
			+ "\t\tBulls and cows game\n"
			+ "===============================================\n";
	static final String enterGuessableItemsTypeMsg = "Please choose the type of elements to guess:\n"
			+ "[1] for positive interger numbres\n"
			+ "[2] for alphabetic letters [1 or 2]: ";
	static final String enterGuessMsg = "Guess the four items: ";
	static final String successfullGuessMsg = "Congratulations you win !";

	public static void main(String[] args) {
		System.out.println(gameLabel);
		InputReader inputReader = new InputReader();
		String guessableTypeStr = inputReader.collectInput(
				new GuessableTypeValidator(), enterGuessableItemsTypeMsg);
		GuessableTypesEnum guessableType = GuessableTypesEnum
				.getType(guessableTypeStr);
		Guessable guessable = GuessableFactory.createGuessable(guessableType);
		IValidator validator = ValidatorFactory
				.createValidator(guessableType);

		do {
			String inputStringToGuess = inputReader.collectInput(validator,
					enterGuessMsg);
			Result result = guessable.guess(inputStringToGuess);
			System.out.println(result);

			if ((result != null) && (result.getBulls() == elementsCount)) {
				System.out.println(successfullGuessMsg);
				break;
			}
		} while (true);

		inputReader.closeReader();

	}
}
