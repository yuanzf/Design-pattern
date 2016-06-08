package builderPattern.product;

/**
 * Created by yzf on 6/8/16.
 */
public class BMWModel extends CarModel {
    @Override
    protected void start() {

        System.out.println("宝马启动了");

    }

    @Override
    protected void stop() {

        System.out.println("宝马停止了");

    }

    @Override
    protected void alarm() {

        System.out.println("宝马喇叭响了");

    }

    @Override
    protected void engineBoom() {

        System.out.println("宝马发动机响起来了");

    }
}
