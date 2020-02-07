package szu.panda.strategy.service;

import org.springframework.stereotype.Service;
import szu.panda.strategy.model.Duck;
import szu.panda.strategy.model.MallardDuck;
import szu.panda.strategy.model.ModelDuck;
import szu.panda.strategy.model.act.impl.FlyRocketPowered;

@Service
public class MiniDuckSimulator1 {
 
	public void MiniDuckSimulator1() {
 
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}
