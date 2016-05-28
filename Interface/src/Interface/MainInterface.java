package Interface;

import Animal.Duck;
import Animal.Person;

public class MainInterface {

	private static final Walkable Walkables = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Walkable[] w = new Walkable[3];
		w[0] = new Person("Jack");
		w[1] = new Duck("Jeff");
		w[2] = new Person("John");
		// Let everyone walk
		Walkable.letThemWalk(w);
	}

}
