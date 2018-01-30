package vtvpmc.emc.lt.bp;

public class Laikrodis {

	private double val;
	private double min;
	
	public Laikrodis () {
		val = 0;
		min = 0;
	}
		
	public void setVal(double val) throws IllegalArgumentException {
		if (val >= 1 && val <=11) {
			this.val = val;
		}
		else if (val == 12) {
			this.val = 0;
		}
		else {
			throw new IllegalArgumentException("Nejuokauk. Toki� valand� paprastame laikrodyje neb�na...");
		}
	}
	
	public void setMin(double min) throws IllegalArgumentException{
		if (min >= 0 && min <=59) {
			this.min = min;
		}
		else {
			throw new IllegalArgumentException("Toki� minu�i� neb�na...");
		}
	}
	
	public double getVal() {
		return val;
	}
	
	public double getMin() {
		return min;
	}
	
}
