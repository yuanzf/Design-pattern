package abstractFactoryPattern.product;

import abstractFactoryPattern.Human;

/**
 * Created by yzf on 6/6/16.
 */
public abstract  class AbstractBlackHuman implements Human {
    //白种人皮肤是白的
    public void getColor(){

        System.out.println("黑种人的皮肤是黑色的");

    }

    //白种人讲话
    public void talk(){

        System.out.println("黑种人说话：我是黑种人");

    }
}
