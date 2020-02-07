package szu.panda.strategy.service;

import org.springframework.stereotype.Service;
import szu.panda.strategy.model.*;
import szu.panda.strategy.model.act.FlyBehavior;
import szu.panda.strategy.model.act.QuackBehavior;
import szu.panda.strategy.model.act.impl.FlyRocketPowered;

@Service
public class MiniDuckSimulator {
 
	public void MiniDuckSimulator() {
		MallardDuck mallard = new MallardDuck();
		FlyBehavior cantFly = () -> System.out.println("I can't fly");
		QuackBehavior squeak = () -> System.out.println("Squeak");
		RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak);
		DecoyDuck decoy = new DecoyDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();

		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}




