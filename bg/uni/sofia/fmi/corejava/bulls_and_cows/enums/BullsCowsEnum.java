package bg.uni.sofia.fmi.corejava.bulls_and_cows.enums;

public enum BullsCowsEnum {
	BULL("bull"),BULLS("bulls"),COW("cow"),COWS("cows");

	private final String code;

	public String getCode() {
		return code;
	}

	private BullsCowsEnum(String code) {
		this.code = code;
	}
}
