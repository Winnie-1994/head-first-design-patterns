package szu.panda.strategy.model.act.impl;

import szu.panda.strategy.model.act.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}
