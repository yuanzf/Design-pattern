package builderPattern.concreteBuilder;

import builderPattern.builder.CarBuilder;
import builderPattern.product.BenzModel;
import builderPattern.product.CarModel;

import java.util.ArrayList;

/**
 * Created by yzf on 6/8/16.
 */
public class BenzBuilder extends CarBuilder {

    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {

        this.benz.setSequence(sequence);

    }

    @Override
    public CarModel getCarModel() {

        return this.benz;

    }
}
