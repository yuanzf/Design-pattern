package singletonPattern;

import singletonPattern.Emperor;

/**
 * Created by yzf on 6/2/16.
 */
public class Minister {

    public static void main(String[] args){
        for (int day = 0;day < 3; day++){
             Emperor emperor = Emperor.gerInstandce();
             emperor.say();
        }
    }
}
