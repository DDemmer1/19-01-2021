package de.demmer.dennis;

public class Kuh extends Pflanzenfresser{
	
	
	
	public Kuh(boolean gibtMilch) {
		super(true);
		this.gibtMilch = gibtMilch;
	}
	
	
	

	boolean gibtMilch;

	public boolean isGibtMilch() {
		return gibtMilch;
	}

	public void setGibtMilch(boolean gibtMilch) {
		this.gibtMilch = gibtMilch;
	}
	
		

}
