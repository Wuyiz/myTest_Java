package com.wuyiz.MyTest.leetcode;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: suhai
 * @create: 2020-12-10 13:20
 * 1 < logn < n < nlogn < n^2 < n^3 < 2^n < n!
 */
public class suanfa {
    public static void main(String[] args) {
        //fun();
        System.out.println(Arrays.toString(twoSum(new int[]{2, 5, 8, 9, 10}, 17)));
    }

    public static void fun() {
        JSONArray jsonArray = JSONUtil.createArray();
        jsonArray.add(123);
        jsonArray.add("sasd12");
        jsonArray.add(1.2);

        System.out.println(jsonArray.toString());
    }

    public static int[] twoSum(int[] nums, int target) {
        // int size = nums.length;
        // for(int i = 0; i < size; i++){
        //     for(int j = i + 1; j < size; j++){
        //         if(nums[i] + nums[j] == target){
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return new int[]{};

        int size = nums.length;
        Map<Integer, Integer> hashTable = new HashMap<>();
        for (int i = 0; i < size; ++i) {
            if (hashTable.containsKey(target - nums[i])) {
                return new int[]{hashTable.get(target - nums[i]), i};
            }
            hashTable.put(nums[i], i);
            System.out.println(hashTable);
        }
        return new int[0];
    }
}
