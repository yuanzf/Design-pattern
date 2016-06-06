package abstractFactoryPattern;

/**
 * Created by yzf on 6/6/16.el
 */
public interface HumanFactory {

    //制造一个黄种人
    public Human createYellowHuman();
    //制造一个白种人
    public Human createWhiteHumanl();
    //制造一个黑种人
    public Human createBlackHuman();

}
