package com.wuyiz.MyTest;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param buttons int整型一维数组 
     * @return long长整型
     */
    public long findMaxButtons(int[] buttons) {
        // write code here
        int res = 0;
        for (int i = 0; i < buttons.length; i++) {
            res += (i + 1) * buttons[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] i = new int[]{2, 2, 2};
        System.out.println(solution.findMaxButtons(i));
    }
}