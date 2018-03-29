package model.factory.abstracts;

import model.factory.base.Animal;
import model.factory.base.Kits;
/*
 * 工厂模式：使得程序具有可扩展性，降低程序之间的耦合程度，使得程序更有层次；缺点：当产品进行修改时，工厂类也要进行相应的修改
 * 简单工厂模式：工厂类根据提供提供给他的参数，返回一个类的实例。
 * 工厂方法模式：在简单工厂模式的基础上，创建一个抽象工厂接口，使得具体工厂实现这个接口
 * 抽象工厂模式：最具有一般性的一种模式，抽象工厂向客户端提供一个接口，使得客户端可以创建多种产品的对象
 * */

public class Main {
	public static void main(String[] args) {
		AbstrcatFactory df = new AnimalFactory();
		Animal a = df.createAnimal("cat");
		a.run();
		Kits k = df.createKit("pen");
		k.use();
	}
}
