package szu.panda.strategy.model;

import szu.panda.strategy.model.act.FlyBehavior;
import szu.panda.strategy.model.act.QuackBehavior;

/**
 * @author : wuniting
 * @date :   2020-01-15
 * @description :
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    abstract void display();

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

}




