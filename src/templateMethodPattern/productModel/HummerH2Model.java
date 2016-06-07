package templateMethodPattern.productModel;

import templateMethodPattern.HummerModel;

/**
 * Created by yzf on 6/7/16.
 */
public class HummerH2Model extends HummerModel{
    //H1型号悍马启动
    @Override
    public void start() {
        System.out.println("悍马H2启动");
    }

    @Override
    public void stop() {
        System.out.println("悍马H2停止");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H2发动引擎");
    }

}
