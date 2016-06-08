package builderPattern.concreteBuilder;

import builderPattern.builder.CarBuilder;
import builderPattern.product.BMWModel;
import builderPattern.product.CarModel;

import java.util.ArrayList;

/**
 * Created by yzf on 6/8/16.
 */
public class BMWBuilder extends CarBuilder {
    private BMWModel BMW = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {

        this.BMW.setSequence(sequence);

    }

    @Override
    public CarModel getCarModel() {
        return this.BMW;
    }
}
