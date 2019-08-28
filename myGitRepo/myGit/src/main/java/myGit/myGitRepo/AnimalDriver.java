package myGit.myGitRepo;

import java.util.ArrayList;
import java.util.List;

public class AnimalDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog tuffy = new Dog("toto","chiwawa", 5, "brown"); 
        System.out.println(tuffy.toString()); 
        Dog dog = new Dog(false, "bone", 4, "black");

		System.out.println(tuffy.getName() + " is Vegetarian?" + dog.isVegetarian());
		System.out.println(tuffy.getName() + " eats " + dog.getEats());
		System.out.println(tuffy.getName() + " has " + dog.getNoOfLegs() + " legs.");
		System.out.println(tuffy.getName() + " color is " + dog.getColor());
		
		
		tuffy.speak();
		tuffy.eat();
		tuffy.eat(" bacon");
		tuffy.trick();

		List<Animal> animalList = new ArrayList<Animal>();
		List<Dog> dogList = new ArrayList<Dog>();
	
		animalList.add(new Dog("milow", "German Schefer", 3, "black"));
		animalList.add(new Dog("seto", "papilon", 9, "white"));
		dogList.add(new Dog(true, "pizza", 4, "brown"));
		dogList.add(new Dog(false, "bone", 4, "white"));
		
		for(Animal a : animalList){
			System.out.println(a.toString());
			
		};
		
		for(Dog d : dogList){
			
			System.out.println("Eating " + d.getEats() + ", Vegetarian?" + d.isVegetarian());
			System.out.println("Has " + d.getNoOfLegs() + " legs.");
			System.out.println("Color is " + d.getColor());
				
		};
	}

}
