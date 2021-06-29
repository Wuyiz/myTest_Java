package com.wuyiz.MyTest.DouDIZhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName DouDiZhu
 * @Description: 斗地主综合案例：有序
 *                  1.准备牌组
 *                  2.洗牌
 *                  3.发牌
 *                  4.排序
 *                  5.看牌
 * @Author AllureLove
 * @Date 2019/11/11
 * @Version V1.0
 **/
public class DouDiZhu {
    public static final String NAME_1 = "刘德华";
    public static final String NAME_2 = "周润发";
    public static final String NAME_3 = "周星驰";
    public static final String DIPAI = "底牌";

    private static List<String> colors;     //牌型
    private static List<String> numbers;    //牌大小
    private static HashMap<Integer, String> poker = new HashMap<>();    //存储牌组
    private static ArrayList<Integer> pokerIndex = new ArrayList<>();   //存储洗牌后的序号

    //存放三位玩家的手牌和底牌
    private static ArrayList<Integer> player01 = new ArrayList<>();
    private static ArrayList<Integer> player02 = new ArrayList<>();
    private static ArrayList<Integer> player03 = new ArrayList<>();
    private static ArrayList<Integer> diPai = new ArrayList<>();

    static {
        //colors = List.of("♠", "♥", "♦", "♣");
        //numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        poker.put(0, "大王");
        poker.put(1, "小王");
        pokerIndex.add(0);
        pokerIndex.add(1);
    }

    public static void main(String[] args) {

        cardGroup();
        Collections.shuffle(pokerIndex);
        Licensing();

        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(diPai);

        watchCard(NAME_1, poker, player01);
        watchCard(NAME_2, poker, player02);
        watchCard(NAME_3, poker, player03);
        watchCard(DIPAI, poker, diPai);
    }

    //看牌
    private static void watchCard(String name, HashMap<Integer, String> poker, ArrayList<Integer> list) {
        System.out.printf(name + "：");
        for (Integer num : list) {
            System.out.printf(poker.get(num) + " ");
        }
        System.out.println();
    }


    //发牌
    private static void Licensing() {
        for (int i = 0; i < pokerIndex.size(); i++) {
            if (i >= 51) {
                diPai.add(pokerIndex.get(i));
            } else if (i % 3 == 0) {
                player01.add(pokerIndex.get(i));
            } else if (i % 3 == 1) {
                player02.add(pokerIndex.get(i));
            } else if (i % 3 == 2) {
                player03.add(pokerIndex.get(i));
            }
        }
    }

    //组牌
    private static void cardGroup() {
        int index = 2;
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index, color + number);
                pokerIndex.add(index++);
            }
        }
    }
}
