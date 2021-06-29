package com.wuyiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seatNum = sc.nextInt();
        sc.nextLine();
        String seatOrLeaveLine = sc.nextLine();
        String[] c = seatOrLeaveLine.substring(1, seatOrLeaveLine.length() - 1).split(", ");
        int[] seatOrLeave = new int[c.length];
        for (int i = 0; i < c.length; i++) {
            seatOrLeave[i] = Integer.parseInt(c[i]);
        }

        Main socialDistance = new Main();
        int ans = socialDistance.conferenceSeatDistance(seatNum, seatOrLeave);
        System.out.println(ans);
    }

    /**
     * 计算最后进来的人，坐的位置
     * @param seatNum 会议室座位总数
     * @param seatOrLeave 员工的进出顺序
     * @return 最后进来的人，坐的位置
     */
    public int conferenceSeatDistance(int seatNum, int[] seatOrLeave) {
        int length = seatOrLeave.length;
        List<Integer> seat = new ArrayList<>(seatNum);
        for (int i = 0; i < length - 1; i++) {
            if (seatOrLeave[i] > 0) {
                if (seat.isEmpty()) {
                    seat.set(1, seatOrLeave[i]);
                } else if (seat.size() == 1) {
                    seat.set(seatNum, seatOrLeave[i]);
                } else {
                    int key = (seatNum / (seat.size() + 1)) - 1;
                    seat.set(key, seatOrLeave[i]);
                }
            } else if (seatOrLeave[i] < 0) {
                seat.remove(Math.abs(seatOrLeave[i]));
            }
        }
        return seat.size();
    }
}