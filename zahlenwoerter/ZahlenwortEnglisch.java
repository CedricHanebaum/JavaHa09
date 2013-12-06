package zahlenwoerter;

public class ZahlenwortEnglisch extends Zahlenwort {

	private String[] einer = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
	private String[] zehner = { "", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };
	private String hundert = "hundred";
	private String tausend = "thousand";
	private String und = "and";

	public ZahlenwortEnglisch(int x) {
		super(x);
	}

	@Override
	public String getWortString() {
		String ret = "";
		if (Zahlenwort.getDigitAt(x, 1000) != 0) {
			ret += einer[Zahlenwort.getDigitAt(x, 1000)] + " " + tausend;
		}
		if (Zahlenwort.getDigitAt(x, 100) != 0) {
			ret += einer[Zahlenwort.getDigitAt(x, 100)] + " " + hundert;
		}
		if (Zahlenwort.getDigitAt(x, 10) != 0) {
			if (Zahlenwort.getDigitAt(x, 10) == 1) {
				if (Zahlenwort.getDigitAt(x, 1) == 0) ret += "ten";
				if (Zahlenwort.getDigitAt(x, 1) == 1) ret += "eleven";
				if (Zahlenwort.getDigitAt(x, 1) == 2) ret += "twelve";
				if (Zahlenwort.getDigitAt(x, 1) == 3) ret += "thirteen";
				if (Zahlenwort.getDigitAt(x, 1) == 4) ret += "fourteen";
				if (Zahlenwort.getDigitAt(x, 1) == 5) ret += "fifteen";
				if (Zahlenwort.getDigitAt(x, 1) == 6) ret += "sixteen";
				if (Zahlenwort.getDigitAt(x, 1) == 7) ret += "seventeen";
				if (Zahlenwort.getDigitAt(x, 1) == 8) ret += "eighteen";
				if (Zahlenwort.getDigitAt(x, 1) == 9) ret += "nineteen";
			} else {
				if(Zahlenwort.getDigitAt(x, 100) != 0 || Zahlenwort.getDigitAt(x, 1000) != 0) ret += " ";
				ret += zehner[Zahlenwort.getDigitAt(x, 10)];
			}
		}
		if (Zahlenwort.getDigitAt(x, 10) != 1) {
			if (Zahlenwort.getDigitAt(x, 10) == 0) {
				ret += " ";
			} else {
				ret += "-";
			}
			ret += einer[Zahlenwort.getDigitAt(x, 1)];
		}
		if(ret.contains(" ")){
			ret = ret.substring(0, ret.lastIndexOf(" ")) + " " + und + ret.substring(ret.lastIndexOf(" "));
		}

		return ret;
	}

	@Override
	public String getSprache() {
		return "english";
	}

}