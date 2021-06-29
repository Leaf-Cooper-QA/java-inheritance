package inheritance;

public class Dog extends Animal {
	
	public void dogTalk() {
		System.out.println("Hi, I'm a dog that is also an animal");
	}
	
	public void animalTalk() {
		System.out.println("Ha, you thought I was an animal. Well I am, but also a dog");
	}
	
	@Override
	public void dogCheck() {
		System.out.println("I'm a dog after all");
	}

}
