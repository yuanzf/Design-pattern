package builderPattern.product;

/**
 * Created by yzf on 6/8/16.
 */
public class BenzModel extends CarModel {
    @Override
    protected void start() {

        System.out.println("奔驰启动了");

    }

    @Override
    protected void stop() {

        System.out.println("奔驰停止了");

    }

    @Override
    protected void alarm() {

        System.out.println("奔驰喇叭想了");

    }

    @Override
    protected void engineBoom() {

        System.out.println("奔驰发动机响了");

    }
}
