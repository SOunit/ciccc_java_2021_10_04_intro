package ex20211012.animals;

import ex20211012.animals.bird.Bird;
import ex20211012.animals.fish.Eel;
import ex20211012.animals.fish.Fish;
import ex20211012.animals.reptile.Crocodile;
import ex20211012.animals.reptile.Reptile;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = new Animal(10, 15, "animal type", "blood type");
		animal.showInfo();

		Reptile reptile = new Reptile(20, 25, "reptile", "reptile blood", "dry skin", "soft-shelled-eggs", true);
		reptile.showInfo();

		Crocodile crocodile = new Crocodile(30, 35, "crocodile", "reptile blood", "dry skin", "hard-shelled-eggs",
				true);
		crocodile.showInfo();

		Fish fish = new Fish("live in water", true);
		fish.showInfo();

		Eel eel = new Eel();
		eel.showInfo();

		Bird bird = new Bird();
		bird.showInfo();

		ex20211012.animals.bird.Crocodile clo = new ex20211012.animals.bird.Crocodile();
		clo.showInfo();

	}

}
