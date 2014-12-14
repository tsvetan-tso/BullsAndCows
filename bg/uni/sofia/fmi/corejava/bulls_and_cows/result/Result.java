package bg.uni.sofia.fmi.corejava.bulls_and_cows.result;

import bg.uni.sofia.fmi.corejava.bulls_and_cows.enums.BullsCowsEnum;

public class Result {

	private int bulls;
	private int cows;

	public Result() {
		this.bulls = 0;
		this.cows = 0;
	}

	public Result(int bulls, int cows) {
		this.bulls = bulls;
		this.cows = cows;
	}

	public int getBulls() {
		return bulls;
	}

	public int getCows() {
		return cows;
	}

	public String toString() {
		String bullsStr = (this.bulls == 1) ? BullsCowsEnum.BULL.getCode()
				: BullsCowsEnum.BULLS.getCode();
		String cowsStr = (this.cows == 1) ? BullsCowsEnum.COW.getCode()
				: BullsCowsEnum.COWS.getCode();

		return this.bulls + " " + bullsStr + " " + this.cows + " " + cowsStr;
	}
}
