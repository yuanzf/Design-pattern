package factoryMethod;

/**
 * Created by yzf on 6/6/16.
 */
public class WhiteHuman implements Human{
    @Override
    public void getColor() {

        System.out.println("白色人种的皮肤是白色的");

    }

    @Override
    public void talk() {

        System.out.println("白色人种说话：我是白种人");

    }
}
