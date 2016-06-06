package factoryMethod;

/**
 * Created by yzf on 6/6/16.
 */
public class BlacekHuman implements Human{
    @Override
    public void getColor() {

        System.out.println("黑色人种的皮肤是黑色的");

    }

    @Override
    public void talk() {

        System.out.println("黑种人说话：我是黑人");

    }
}
