package templateMethodPattern.productModel;

import templateMethodPattern.HummerModel;

/**
 * Created by yzf on 6/7/16.
 */
public class HummerH1Model extends HummerModel{

    //H1型号悍马启动
    @Override
    public void start() {
        System.out.println("悍马H1启动");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停止");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1发动引擎");
    }


}
