package de.demmer.dennis;

public class Application {

	public static void main(String[] args) {

		
		
		Kuh günther = new Kuh(false);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Löwe löwe1 = new Löwe();
		löwe1.colorOfMane = "Yellow";
		
		Tiger tiger1 = new Tiger();
		
		tiger1.scream();
		
		tiger1.setNickname("Peter");
		
		System.out.println(löwe1.toString());
		
		Tier[] zoo = new Tier[5];
//		Tier[] zoo1 = {löwe1, tiger1};

		zoo[0] = löwe1;
		
		Tier meinTier = new Löwe();
		
		
		
		// Array kann jede Klasse behinhalten
		Object[] obj = new Object[100];
		
		
	}

}
