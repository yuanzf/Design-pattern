package abstractFactoryPattern.product;

import abstractFactoryPattern.product.AbstractYellowHuman;

/**
 * Created by yzf on 6/6/16.
 */
public class MaleYellowHuman extends AbstractYellowHuman {
    //黄种人男性
    public void getSex(){
        System.out.println("黄种人男性");
    }
}
