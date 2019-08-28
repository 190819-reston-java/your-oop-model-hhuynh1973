package myGit.myGitRepo;

public class AnimalDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog tuffy = new Dog("tuffy","papillon", 5, "white"); 
        System.out.println(tuffy.toString()); 
        Dog dog = new Dog(false, "bone", 4, "black");

		System.out.println("Dog is Vegetarian?" + dog.isVegetarian());
		System.out.println("Dog eats " + dog.getEats());
		System.out.println("Dog has " + dog.getNoOfLegs() + " legs.");
		System.out.println("Dog color is " + dog.getColor());
		
		
		tuffy.speak();
		tuffy.eat();
		tuffy.eat(" bacon");
		tuffy.trick();

	}

}
