package szu.panda.strategy.model.act.impl;

import szu.panda.strategy.model.act.QuackBehavior;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
