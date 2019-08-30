package myGit.myGitRepo;

import java.io.Serializable;

public class Dog extends Animal implements Serializable, IdoTrick, Comparable<Dog> {
	
	// Instance Variables 
    String name; 
    String breed; 
    int age; 
    String color; 
    
    // Constructor Declaration of Class 
    public Dog(boolean veg, String food) {
		super(veg, food);
		this.color="White";
	}

	public Dog(String name, String breed, boolean veg, String food, String color, int age){
		super(veg, food);
		this.color=color;
		this.age=age;
		this.name = name;
		this.breed = breed;
	}

	
  
    public Dog(boolean veg, String food, String color,int age) {
    	super(veg, food);
		
		this.age = age;
		this.color = color;
	}

	// method 1 
    public String getName() 
    { 
        return name; 
    } 
  
    // method 2 
    public String getBreed() 
    { 
        return breed; 
    } 
  
    // method 3 
    public int getAge() 
    { 
        return age; 
    } 
  
    // method 4 
    public String getColor() 
    { 
        return color; 
    } 
  
    @Override
    public String toString() 
    { 
        return("\nHi my name is "+ this.getName()+ 
               ".\nMy breed,age and color are " + 
               this.getBreed()+"," + this.getAge()+ 
               ","+ this.getColor()); 
    } 
    
    

	public void trick() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + " is doing trick");

	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + " is barking");

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + " is eating");

	}
	
	public void eat(String s) {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + " is eating" + s);

	}
	
	public int compareTo(Dog o) {
		
		return this.getName().compareTo(o.getName());
	}

}
