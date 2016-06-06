package abstractFactoryPattern;

import abstractFactoryPattern.creator.FemaleFactory;
import abstractFactoryPattern.creator.MaleFactory;

/**
 * Created by yzf on 6/6/16.
 */
public class Nvwa {

    public static void main(String[] args){

        //第一条生产线，男性生产线
        HumanFactory maleHumanFactory = new MaleFactory();

        //第二条生产线，女性生产线
        HumanFactory femaleHumanFactory = new FemaleFactory();

        //生产线建立完毕，开始造人
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        System.out.println("--------生产第一个黄色女性--------");
        femaleYellowHuman.getColor();
        femaleYellowHuman.talk();
        femaleYellowHuman.getSex();

        System.out.println("--------生产第一个黄种男性--------");
        maleYellowHuman.getColor();
        maleYellowHuman.talk();
        maleYellowHuman.getSex();
    }
}
