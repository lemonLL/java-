package model.factory.simply;

import model.factory.base.Animal;
import model.factory.base.Cats;
import model.factory.base.Dogs;


public class SimpleFactory {
	public Animal create(String s){
		if(s=="dog"){
			return new Dogs();
		}
		if(s=="cat"){
			return new Cats();
		}
		return null;
	}
	
	public static void main(String[] args) {
		SimpleFactory sf = new SimpleFactory();
		Cats cat = (Cats)sf.create("cat");
		cat.run();
	}
}
