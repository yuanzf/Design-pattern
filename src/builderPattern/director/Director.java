package builderPattern.director;

import builderPattern.concreteBuilder.BMWBuilder;
import builderPattern.concreteBuilder.BenzBuilder;
import builderPattern.product.BMWModel;
import builderPattern.product.BenzModel;

import java.util.ArrayList;

/**
 * Created by yzf on 6/8/16.
 */
public class Director  {

    private ArrayList<String> sequence = new ArrayList<>();

    private BenzBuilder bnezBulider = new BenzBuilder();

    private BMWBuilder bmwBuilder = new BMWBuilder();

    /*
    * A类型的奔驰模型，先start，然后stop,其他引擎喇叭什么都没有
    * */
    public BenzModel getABenzModel(){

        //清理场景
        this.sequence.clear();

        //AbenzModel的执行顺序
        this.sequence.add("start");
        this.sequence.add("stop");

        //按照顺序返回一奔驰车
        this.bnezBulider.setSequence(this.sequence);

        return (BenzModel)this.bnezBulider.getCarModel();
    }

    /*
    * B型奔驰车，先引擎，启动，停止，没有喇叭
    * */

    public BenzModel getBBenzModel(){

        this.sequence.clear();
        this.sequence.add("engineBoom");
        this.sequence.add("start");
        this.sequence.add("stop");

        //按照顺序返回奔驰模型
        this.bnezBulider.setSequence(this.sequence);

        return (BenzModel)this.bnezBulider.getCarModel();

    }
    /*
    * c型号的宝马：喇叭，启动，停止
    * */

   public  BMWModel getCBMWModel(){

       this.sequence.clear();

       this.sequence.add("alarm");
       this.sequence.add("start");
       this.sequence.add("stop");

       this.bmwBuilder.setSequence(this.sequence);

       return (BMWModel)this.bmwBuilder.getCarModel();
   }
}
