package builderPattern;

import builderPattern.product.BenzModel;

import java.util.ArrayList;

/**
 * Created by yzf on 6/8/16.
 */
public class ClientBZ {

    public static void main(String[] args){

        //生产奔驰模型b
        BenzModel benz = new BenzModel();

        //存放run的顺序
        ArrayList<String> sequence = new ArrayList<>();

        sequence.add("engineboom");
        sequence.add("start");
        sequence.add("stop");
        sequence.add("alarm");

        //把顺序交给奔驰
        benz.setSequence(sequence);
        benz.run();
    }

}
