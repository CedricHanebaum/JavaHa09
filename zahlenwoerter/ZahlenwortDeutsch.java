package zahlenwoerter;

public class ZahlenwortDeutsch extends Zahlenwort {

	private String[] einer = { "", "ein", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun" };
	private String[] zehner = { "", "zehn", "undzwanzig", "unddreißig", "undvierzig", "undfünfzig", "undsechzig", "undsiebzig", "undachtzig", "undneunzig" };
	private String hundert = "hundert";
	private String tausend = "tausend";

	public ZahlenwortDeutsch(int x) {
		super(x);
	}

	@Override
	public String getWortString() {
		String ret = "";
		if (Zahlenwort.getDigitAt(x, 1000) != 0) {
			ret += einer[Zahlenwort.getDigitAt(x, 1000)] + tausend;
		}
		if (Zahlenwort.getDigitAt(x, 100) != 0) {
			ret += einer[Zahlenwort.getDigitAt(x, 100)] + hundert;
		}
		if (Zahlenwort.getDigitAt(x, 1) != 0) {
			if (Zahlenwort.getDigitAt(x, 10) != 1 || !(Zahlenwort.getDigitAt(x, 1) == 1 || Zahlenwort.getDigitAt(x, 1) == 2)) {
				ret += einer[Zahlenwort.getDigitAt(x, 1)];
			}
		}
		if (Zahlenwort.getDigitAt(x, 10) != 0) {
			if (Zahlenwort.getDigitAt(x, 10) == 1 && (Zahlenwort.getDigitAt(x, 1) == 1 || Zahlenwort.getDigitAt(x, 1) == 2)) {
				if (Zahlenwort.getDigitAt(x, 1) == 1) ret += "elf";
				if (Zahlenwort.getDigitAt(x, 1) == 2) ret += "zwölf";
			} else {
				ret += zehner[Zahlenwort.getDigitAt(x, 10)];
			}
		}

		if (x == 1) ret = "eins";
		if (x == 11) ret = "elf";
		if (x == 12) ret = "zwölf";

		return ret;
	}

	@Override
	public String getSprache() {
		return "deutsch";
	}

}
