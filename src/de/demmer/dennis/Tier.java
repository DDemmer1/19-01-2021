package de.demmer.dennis;

public abstract class Tier {
	
	private int age;
	
	private String nickname;
	
	
	public void scream() {
		System.out.println("Aaahh!");
	}
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	@Override
	public String toString() {
		return "Tier [age=" + age + ", nickname=" + nickname + "]";
	}
	
	
	
	

}
