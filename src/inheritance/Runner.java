package inheritance;

public class Runner {
	public static void main(String[] args) {
		Animal a = new Animal();
		
		a.animalTalk();
		
		Dog d = new Dog();
		d.animalTalk();
		d.dogTalk();
		
		Animal b = new Dog();
		
		b.dogCheck();
//		b.dogTalk();    //doesn't work because b is sees Animal classes despite being Dog
		
		Collie c = new Collie();
		c.animalTalk();
		c.collieTalk();
		c.dogTalk();
		
		Fish f = new Fish();
		f.animalTalk();
		f.fishTalk();
		f.dogCheck();
	}

}
