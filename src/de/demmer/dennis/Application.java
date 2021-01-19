package de.demmer.dennis;

public class Application {

	public static void main(String[] args) {

		
		Löwe löwe1 = new Löwe();
		
		Tiger tiger1 = new Tiger();
		
		
		tiger1.setNickname("Peter");
		
		
		Tier[] zoo = new Tier[5];
//		Tier[] zoo1 = {löwe1, tiger1};

		zoo[0] = löwe1;
		
		
		
		// Array kann jede Klasse behinhalten
		Object[] obj = new Object[100];
		
		
	}

}
