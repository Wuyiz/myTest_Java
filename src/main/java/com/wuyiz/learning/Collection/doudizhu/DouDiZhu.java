package com.wuyiz.learning.Collection.doudizhu;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName doudizhu
 * @Description: 牌组定义
 * @Author AllureLove
 * @Date 2019/11/7
 * @Version V1.0
 **/
public class DouDiZhu {
    public static void main(String[] args) {
        //1.组合
        //定义一个String类型的ArrayList集合,存储扑克牌
        ArrayList<String> poker = new ArrayList<>();
        //定义两个String数组，分别存储花色和大小
        String[] colors = {"♠","♦","♣","♥"};
        String[] number = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        poker.add("大王");
        poker.add("小王");

        for (String num : number) {
            for (String color : colors) {
                poker.add(color+num);
            }
        }

        /**
         * 2.洗牌
         * 利用集合的包装类Collections中
         * static void shuffle(List<?> list)方法，对默认源列表置换
         */
        Collections.shuffle(poker);

        /**
         * 3.发牌
         * 通过poker集合的索引%3对玩家轮流发牌
         */
        ArrayList<String> player_01 = new ArrayList<>();
        ArrayList<String> player_02 = new ArrayList<>();
        ArrayList<String> player_03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if (i >= 51){
                dipai.add(p);
            } else if(i%3 == 0){
                player_01.add(p);
            } else if(i%3 == 1){
                player_02.add(p);
            } else if(i%3 == 2){
                player_03.add(p);
            }
        }

        /**
         * 4.看牌
         */
        System.out.println("刘德华： " + player_01);
        System.out.println("周润发： " + player_02);
        System.out.println("周星驰： " + player_03);
        System.out.println("底  牌： " + dipai);
    }
}
