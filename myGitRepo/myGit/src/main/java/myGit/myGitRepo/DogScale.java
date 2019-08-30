package myGit.myGitRepo;

import java.util.Comparator;

public class DogScale implements Comparator<Dog> {
	
	public int compare(Dog o1, Dog o2) {
		int out = 0;
		int dogOneAge = o1.getAge();
		int dogTwoAge = o2.getAge();
		out = (dogOneAge - dogTwoAge);
		
		if(out == 0) {
			out = o1.compareTo(o2);
		}
		
		return out;
	}

}
