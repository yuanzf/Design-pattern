package templateMethodPattern;

/**
 * Created by yzf on 6/7/16.
 * 悍马汽车模型抽象类
 */
public abstract class HummerModel {

    /*
     *首先，这个模型要能够被发动起来，别管是手动还是摇发动，还是电力发动
     * 反正首先要能发动起来，那这个实现要在类里了
     */
    public abstract void start();

    //停下来
    public abstract void stop();

    //喇叭
    public  abstract void  alarm();

    //引擎
    public abstract void engineBoom();

    //奔跑
    public void run(){
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    };
}