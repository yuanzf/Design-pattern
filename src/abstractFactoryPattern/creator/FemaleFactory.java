package abstractFactoryPattern.creator;

import abstractFactoryPattern.Human;
import abstractFactoryPattern.HumanFactory;
import abstractFactoryPattern.product.FemaleBlackHuman;
import abstractFactoryPattern.product.FemaleWhiteHuman;
import abstractFactoryPattern.product.FemaleYellowHuman;

/**
 * Created by yzf on 6/6/16.
 */
public class FemaleFactory implements HumanFactory{

    //执照黄种女性
    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    //制造白种女性
    @Override
    public Human createWhiteHumanl() {
        return new FemaleWhiteHuman();
    }

    //制造黑种女性
    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
