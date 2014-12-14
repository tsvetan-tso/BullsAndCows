package bg.uni.sofia.fmi.corejava.bulls_and_cows.enums;

public enum GuessableTypesEnum {
	INT_GUESSABLE("1"),CHAR_GUESSABLE("2");

	private String command;

	private GuessableTypesEnum(String str) {
		this.command = str;
	}

	public static GuessableTypesEnum getType(String inputCommand) {
		switch (inputCommand) {
		case "1":
			return GuessableTypesEnum.INT_GUESSABLE;
		case "2":
			return GuessableTypesEnum.CHAR_GUESSABLE;
		default :
			return GuessableTypesEnum.INT_GUESSABLE;
		}
	}
}
