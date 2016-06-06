package abstractFactoryPattern.creator;

import abstractFactoryPattern.Human;
import abstractFactoryPattern.HumanFactory;
import abstractFactoryPattern.product.MaleBlackHuman;
import abstractFactoryPattern.product.MaleWhiteHuman;
import abstractFactoryPattern.product.MaleYellowHuman;

/**
 * Created by yzf on 6/6/16.
 */
public class MaleFactory implements HumanFactory{

    //制造黄种男性
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    //制造白种男性
    @Override
    public Human createWhiteHumanl() {
        return new MaleWhiteHuman();
    }

    //制造黑种男性
    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
