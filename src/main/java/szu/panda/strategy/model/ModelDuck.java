package szu.panda.strategy.model;

import szu.panda.strategy.model.act.impl.FlyNoWay;
import szu.panda.strategy.model.act.impl.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
