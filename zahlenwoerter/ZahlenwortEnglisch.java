package zahlenwoerter;

public class ZahlenwortEnglisch extends Zahlenwort {

	private String[] einer = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
	private String[] zehner = { "", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };
	private String[] zehnBisNeunzehn = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
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
				ret += zehnBisNeunzehn[Zahlenwort.getDigitAt(x, 1)];
			} else {
				if (Zahlenwort.getDigitAt(x, 100) != 0
						|| Zahlenwort.getDigitAt(x, 1000) != 0)
					ret += " ";
				ret += zehner[Zahlenwort.getDigitAt(x, 10)];
			}
		}
		if (Zahlenwort.getDigitAt(x, 10) != 1) {
			if (Zahlenwort.getDigitAt(x, 1) != 0) {
				if (Zahlenwort.getDigitAt(x, 10) == 0) {
					ret += " ";
				} else {
					ret += "-";
				}
			}

			ret += einer[Zahlenwort.getDigitAt(x, 1)];
		}
		if (ret.contains(" ")) {
			ret = ret.substring(0, ret.lastIndexOf(" ")) + " " + und
					+ ret.substring(ret.lastIndexOf(" "));
		}

		return ret;
	}

	@Override
	public String getSprache() {
		return "english";
	}

}