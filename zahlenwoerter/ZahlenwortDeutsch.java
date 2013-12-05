package zahlenwoerter;

public class ZahlenwortDeutsch extends Zahlenwort {
	
	private String[] einer = {"", "ein", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun"};
	private String[] zehner = {"", "zehn", "undzwanzig", "unddreißig", "undvierzig", "undfünfzig", "undsechzig", "undsiebzig", "undachtzig", "undneunzig"};
	private String hundert = "hundert";
	private String tausend = "tausend";
	
	public ZahlenwortDeutsch(int x) {
		super(x);
	}

	@Override
	public String getWortString() {
		String ret = "";
		if(x > 999){
			ret += einer[this.getZifferAt(1000)] + tausend;
		}
		if(x > 99){
			ret += einer[this.getZifferAt(100)] + hundert;
		}
		ret += einer[this.getZifferAt(1)];
		if(x > 9){
			ret += zehner[this.getZifferAt(10)];
		}
		
		if(x == 1) ret = "eins";
		if(x == 11) ret = "elf";
		if(x == 12) ret = "zwölf";
		
		return ret;
	}

	private int getZifferAt(int i) {
		String tmp = String.valueOf(x);
		while(tmp.length() < 4){
			tmp = "0" + tmp;
		}
		if(i == 1000){
			return Integer.parseInt("" + tmp.charAt(0));
		}
		if(i == 100){
			return Integer.parseInt("" + tmp.charAt(1));
		}
		if(i == 10){
			return Integer.parseInt("" + tmp.charAt(2));
		}
		return Integer.parseInt("" + tmp.charAt(3));
	}

	@Override
	public String getSprache() {
		return "deutsch";
	}

}
