package model.factory.abstracts;

import model.factory.base.Animal;
import model.factory.base.Cats;
import model.factory.base.Dogs;
import model.factory.base.Kits;
import model.factory.base.Pen;

public class AnimalFactory extends AbstrcatFactory{

	@Override
	public Animal createAnimal(String s) {
		// TODO Auto-generated method stub
		if(s=="dog") return new Dogs();
		if(s=="cat") return new Cats();
		return null;
	}

	@Override
	public Kits createKit(String s) {
		if(s=="pen") return new Pen();
		return null;
	}

}
