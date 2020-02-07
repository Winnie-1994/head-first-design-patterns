package szu.panda.strategy.model;

import szu.panda.strategy.model.act.impl.FlyWithWings;
import szu.panda.strategy.model.act.impl.Quack;

//MallardDuck.java
public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
