package com.wuyiz.learning.MethodReference.ThisRef;

import java.util.HashSet;

/**
 * @ClassName Husband
 * @Description: 通过this引用本类的成员方法
 * @Author AllureLove
 * @Date 2019/11/17 
 * @Version V1.0
 **/
public class Husband {
    public static void main(String[] args) {
        new Husband().happy();;
    }

    public void buyHouse(){
        System.out.println("上海汤臣一品");
    }

    public void marry(Richable richable){
        richable.buy();
    }

    public void happy() {
        marry(()->{
            //使用this.成员方法，调用本类的买房子方法
            this.buyHouse();
        });

        //方法引用  this::buyHouse
        marry(this::buyHouse);
    }
}
