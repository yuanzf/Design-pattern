package builderPattern.builder;

import builderPattern.product.CarModel;

import java.util.ArrayList;

/**
 * Created by yzf on 6/8/16.
 */
public abstract class CarBuilder {

    //建造一个模型，你要给我一个顺序要求，就是组装的顺序
    public abstract void setSequence(ArrayList<String> sequence);

    //设置完顺序，就可以直接拿到这个车辆的模型
    public abstract CarModel getCarModel();
}
