package myGit.myGitRepo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class AnimalDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        
        
        try {
        	Dog tuffy = new Dog("tuffy","chiwawa", false, "bone", "brown", 9);
        	//System.out.println(tuffy.getAge());
        	if(tuffy.getAge()<0) {
        		throw new IllegalArgumentException("Input cannot be negative.");
        	}
        	else {
        		System.out.println(tuffy.toString());
        		System.out.println(tuffy.getName() + " is Vegetarian?" + tuffy.isVegetarian());
        		System.out.println(tuffy.getName() + " eats " + tuffy.getEats());
        		
        		tuffy.speak();
        		tuffy.eat();
        		tuffy.eat(" bacon");
        		tuffy.trick();
        	}
        	
        }catch (Exception e) {
        	
        		System.out.println(e.getMessage());
        };
        
         
//       Dog dog = new Dog(false, "bone", "black", 8);

		

		List<Dog> dogList = new ArrayList<Dog>();
		
	
		dogList.add(new Dog("milow", "German Schefer", false, "bacon", "black", 2));
		dogList.add(new Dog("seto", "husky", false, "pizza", "white", 4));
		dogList.add(new Dog("anu", "chiwawa", true, "bread", "brown", 7));
		dogList.add(new Dog("lu", "husky", true, "broccoli", "black", 1));
		
		System.out.println("\nPrint out dogList:");
		System.out.println(dogList);
		
		
		System.out.println("\nHashSet--------------");
		Set<Dog> dogSet = new HashSet<Dog>(dogList);
		
		dogSet.add(new Dog("anu", "chiwawa", true, "bread", "black", 7));
		dogSet.add(new Dog("lu", "husky", true, "broccoli", "black", 1));
		dogSet.add(new Dog("milo", "chiwawa", false, "beef", "black", 5));
		
		System.out.println(dogSet);
		
		
		//starting off, Iterable and Iterator:
				System.out.println("\nIterable and Iterator:");
				Iterator<Dog> dogIterator = dogList.iterator();
				
				//this is what an enhanced for loop does:
				while(dogIterator.hasNext()) {
					Animal a = dogIterator.next();
					System.out.println(a);
				}
				
				//Sorted Set
				
				System.out.println("\nSorted dog Set");
				SortedSet<Dog> sortedDogSet = new TreeSet<Dog>();
				
				System.out.println(sortedDogSet);
				
				SortedSet<Dog> ageSortedDogSet = new TreeSet<Dog>(new DogScale());
				ageSortedDogSet.addAll(dogList);
				
				System.out.println(ageSortedDogSet);
	}

}
