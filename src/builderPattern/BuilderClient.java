package builderPattern;

import builderPattern.director.Director;

/**
 * Created by yzf on 6/8/16.
 */
public class BuilderClient {

    public static void main(String[] args){

        Director director = new Director();

        System.out.println("-------A类奔驰-------");
        director.getABenzModel().run();
        System.out.println("-------B类奔驰-------");
        director.getBBenzModel().run();
        System.out.println("-------A类宝马-------");
        director.getCBMWModel().run();
    }


}
