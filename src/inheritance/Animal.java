package inheritance;

public class Animal {
	private String name;
	private String species;
	private int age;
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", species=" + species + ", age=" + age + "]";
	}
	
	public void animalTalk() {
		System.out.println("Hi, I'm an animal");
	}
	
	public void dogCheck() {
		System.out.println("I'm not a dog");
	}
	
	

}
