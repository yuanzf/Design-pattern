package abstractFactoryPattern.product;

import abstractFactoryPattern.Human;

/**
 * Created by yzf on 6/6/16.
 */
public abstract class AbstractYellowHuman implements Human {

    //黄种人皮肤是黄的
    public void getColor(){

        System.out.println("黄种人的皮肤是黄色的");

    }

    //白种人讲话
    public void talk(){

        System.out.println("黄种人说话：我是黄种人");

    }
}
