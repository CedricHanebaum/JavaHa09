package zahlenwoerter;

public abstract class Zahlenwort {

	protected int x;

	public Zahlenwort(int x) {
		if (x <= 0 || x >= 10000)
			throw new NumberFormatException("Zahl nicht im Bereich zwischen 1 und 9999");
		this.x = x;
	}

	public String getZifferString() {
		return x + "";
	}

	/**
	 * Gibt die ausgeschriebene Form der gespeicherten Zahl zurueck.
	 * 
	 * @return Die ausgeschriebene Form der Zahl.
	 */
	public abstract String getWortString();

	/**
	 * Gibt die aktuelle Sprache zurueck.
	 * @return aktuele Sprache.
	 */
	public abstract String getSprache();

	/**
	 * Gibt die Ziffer einer uebergebenen Zahl an der 1000er, 100er, 10er oder
	 * 1er Stelle zurueck.
	 * 
	 * @param x
	 *            gewuenschte Zahl.
	 * @param i
	 *            gewuenschte Stelle.
	 * @return Ziffer an gewuenschter Stelle.
	 */
	public static int getDigitAt(int x, int i) {
		String tmp = String.valueOf(x);
		while (tmp.length() < 4) {
			tmp = "0" + tmp;
		}
		if (i == 1000) {
			return Integer.parseInt("" + tmp.charAt(0));
		}
		if (i == 100) {
			return Integer.parseInt("" + tmp.charAt(1));
		}
		if (i == 10) {
			return Integer.parseInt("" + tmp.charAt(2));
		}
		return Integer.parseInt("" + tmp.charAt(3));
	}

	public String toString() {
		return "Die Zahl " + x + " schreibt man auf " + getSprache() + ":" + getWortString() + ".";
	}
}
