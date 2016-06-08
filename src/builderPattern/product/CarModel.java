package builderPattern.product;

import java.util.ArrayList;

/**
 * Created by yzf on 6/8/16.
 */
public abstract class CarModel {

    //这个参数是各个基本方法执行的顺序
    private ArrayList<String> sequence = new ArrayList<String>();

    //模型是启动就开始跑了
    protected abstract void start();

    //能发动，还要能停下来，
    protected abstract void stop();

    //喇叭会发声
    protected abstract void alarm();

    //引擎会相
    protected abstract void engineBoom();

    //模型会跑
    final public void run(){
        //循环谁在前面就先执行谁
        for(int i = 0;i<this.sequence.size();i++){

            String actionName = this.sequence.get(i);
            if (actionName.equalsIgnoreCase("start")){

                this.start();

            }else if (actionName.equalsIgnoreCase("stop")){

                this.stop();

            }else if (actionName.equalsIgnoreCase("alarm")){

                this.alarm();

            }else if (actionName.equalsIgnoreCase("engineBoom")){
                this.engineBoom();
            }

        }

    }

    //把传递过来的只传递到类内
    final public void setSequence(ArrayList<String> sequence){
        this.sequence=sequence;
    }
}
