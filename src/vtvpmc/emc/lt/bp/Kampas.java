package vtvpmc.emc.lt.bp;

public class Kampas {

	private Laikrodis laikrodis;
	private double kampas;
	
	public Kampas(Laikrodis laikrodis) {
		this.laikrodis = laikrodis;
		this.kampas = 0;
	}
	
	public double skaiciuotiKampa() {
		double kampasMin = laikrodis.getMin()*6;
		double kampasVal = laikrodis.getVal()*30+laikrodis.getMin()/2;
		kampas = Math.abs(kampasMin-kampasVal);
		
		if (kampas <= 180) {
			return kampas;
		}
		else {
			kampas = 360-kampas;
			return kampas;
		}
	}
	
	public double getKampas() {
		return kampas;
	}

	@Override
	public String toString() {
		return "Smailusis kampas tarp rodykliu yra " + kampas;
	}
	
	
	
}
