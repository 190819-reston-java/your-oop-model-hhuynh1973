package myGit.myGitRepo;

public abstract class Animal {
	
	private boolean vegetarian;

	private String eats;
	

	public Animal(){}

	public Animal(boolean veg, String food){
		this.vegetarian = veg;
		this.eats = food;
		
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public String getEats() {
		return eats;
	}

	public void setEats(String eats) {
		this.eats = eats;
	}

	

	
	


	public abstract void speak();
	public abstract void eat();


	
}
