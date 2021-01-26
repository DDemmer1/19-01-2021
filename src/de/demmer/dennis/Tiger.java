package de.demmer.dennis;

public class Tiger extends Raubtier{
	
	boolean isBengal;
	
	@Override
	public void scream() {
		System.out.println("Raawwwr!");
	}

	
	@Override
	public String toString() {
		return "Tiger [isBengal=" + isBengal + ", lengthOfFang=" + lengthOfFang + ", getAge()=" + getAge()
				+ ", getNickname()=" + getNickname() + "]";
	}
	
	
	

}
