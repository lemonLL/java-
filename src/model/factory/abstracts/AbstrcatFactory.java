package model.factory.abstracts;

import model.factory.base.Animal;
import model.factory.base.Kits;

public abstract class AbstrcatFactory {
	public abstract Animal createAnimal(String s);
	public abstract Kits createKit(String s);
}