package com.update.pattern.structural.decorator.v1;

/**
 * @author : liupu.
 * @date : 2018/12/19
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg {
    @Override
    public String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
