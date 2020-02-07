package szu.panda.strategy.model;

import szu.panda.strategy.model.act.impl.FlyNoWay;
import szu.panda.strategy.model.act.impl.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
