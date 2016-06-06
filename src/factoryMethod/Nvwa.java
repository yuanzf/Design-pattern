package factoryMethod;

/**
 * Created by yzf on 6/6/16.
 */
public class Nvwa {

    public static void main(String[] args){
        //声明阴阳八卦炉
        AbstractHumanFactory yinyanglu = new HumanFactory();
        //造出白人
        System.out.println("---------第一次造出白人----------");
        //Human whiteman = new WhiteHuman();
        Human whiteman = yinyanglu.createHuman(WhiteHuman.class);
        whiteman.getColor();
        whiteman.talk();
        //造出黑人
        System.out.println("---------第二次造出黑人----------");
        //Human blackHuan = new BlacekHuman();
        Human blackHuan = yinyanglu.createHuman(BlacekHuman.class);
        blackHuan.getColor();
        blackHuan.talk();
        //造出黄种人
        System.out.println("--------第三次造出黄种人----------");
        //Human yellowHuman = new YellowHuman();
        Human yellowHuman = yinyanglu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
