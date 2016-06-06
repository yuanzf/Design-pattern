package singletonPattern;

import java.util.ArrayList;

/**
 * Created by yzf on 6/2/16.
 */
public class Emperor {

    private static final Emperor emperor = new Emperor();

    private Emperor(){
        //世俗和道德约束你，目的就是不希望产生第二个皇帝
    }

    public static Emperor gerInstandce(){
        return emperor;
    }

    //皇帝发话了

    public static void say(){
        System.out.println("我就是皇帝某某某....");
    }

}