package model.factory.method;

import model.factory.base.Animal;
import model.factory.base.Cats;
import model.factory.base.Dogs;

public class AnimalFactory extends AbstrcatFactory{

	@Override
	public Animal create(String s) {
		// TODO Auto-generated method stub
		if(s=="dog") return new Dogs();
		if(s=="cat") return new Cats();
		return null;
	}

}
