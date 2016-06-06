package factoryPattern;

/**
 * Created by yzf on 6/6/16.
 */
public class YellowHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("黄色人种的皮肤是黄色的");
    }

    @Override
    public void talk() {

        System.out.println("黄色人种说话：我是黄色人种");

    }
}
