package zahlenwoerter;

public class ZahlenwortDeutsch extends Zahlenwort {

	private String[] einer = { "", "ein", "zwei", "drei", "vier", "fuenf", "sechs", "sieben", "acht", "neun" };
	private String[] zehner = { "", "zehn", "zwanzig", "dreissig", "vierzig", "fuenfzig", "sechzig", "siebzig", "achtzig", "neunzig" };
	private String[] zehnBisNeunzehn = {"zehn", "elf", "zwoelf", "dreizehn", "vierzehn", "fuenfzehn", "sechszehn", "siebzehn", "achtzehn", "neunzehn"};
	private String hundert = "hundert";
	private String tausend = "tausend";
	private String und = "und";

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
		if (Zahlenwort.getDigitAt(x, 1) != 0 && Zahlenwort.getDigitAt(x, 10) != 1) {
				ret += einer[Zahlenwort.getDigitAt(x, 1)];
		}
		if (Zahlenwort.getDigitAt(x, 10) != 0) {
			if (Zahlenwort.getDigitAt(x, 10) == 1) {
				ret += zehnBisNeunzehn[Zahlenwort.getDigitAt(x, 1)];
			} else {
				if(Zahlenwort.getDigitAt(x, 1) != 0) ret += und;
				ret += zehner[Zahlenwort.getDigitAt(x, 10)];
			}
		}

		if (x == 1) ret = "eins";

		return ret;
	}

	@Override
	public String getSprache() {
		return "deutsch";
	}

}
