package zahlenwoerter;

public abstract class Zahlenwort {
	
	protected int x;
	
	public Zahlenwort(int x){
		if(x <= 0 || x >= 10000) throw new NumberFormatException("Zahl nicht im Bereich zwischen 1 und 9999");
		this.x = x;
	}
	
	public String getZifferString(){
		return x+"";
	}
	
	public abstract String getWortString();
	
	public abstract String getSprache();
	
	public static int getDigitAt(int x, int i) {
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
	
	public String toString(){
		return "Die Zahl " + x + " schreibt man auf " + getSprache() + ":" + getWortString() + ".";
	}
}
