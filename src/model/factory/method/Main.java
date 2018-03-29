package model.factory.method;

import model.factory.base.Animal;
import model.factory.method.AbstrcatFactory;
import model.factory.method.AnimalFactory;

public class Main {
	public static void main(String[] args) {
		AbstrcatFactory df = new AnimalFactory();
		Animal a = df.create("cat");
		a.run();
	}
}
