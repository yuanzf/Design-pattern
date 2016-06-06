package factoryMethod;

/**
 * Created by yzf on 6/6/16.
 * 抽象的人类创建工厂
 */
public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T createHuman(Class<T> c);
}
