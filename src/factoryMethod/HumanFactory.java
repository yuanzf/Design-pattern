package factoryMethod;

/**
 * Created by yzf on 6/6/16.
 */
public class HumanFactory extends AbstractHumanFactory{
    @Override
    public <T extends Human> T createHuman(Class<T> c) {

        //定义一个生产的人种
        Human human=null;
        try{
            //生产一个人种
            human = (T)Class.forName(c.getName()).newInstance();
        }catch(Exception e){

        System.out.print("创建人种失败");
    }
        return (T)human;
    }
}
