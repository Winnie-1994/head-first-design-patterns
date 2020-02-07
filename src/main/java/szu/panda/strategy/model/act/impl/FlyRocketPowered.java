package szu.panda.strategy.model.act.impl;

import szu.panda.strategy.model.act.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
	public void fly() {
		System.out.println("I'm flying with a rocket");
	}
}
