package szu.panda.strategy.model;

import szu.panda.strategy.model.act.impl.FlyWithWings;
import szu.panda.strategy.model.act.impl.Quack;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
