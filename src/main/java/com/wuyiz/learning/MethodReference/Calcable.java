package com.wuyiz.learning.MethodReference;

/**
 * @InterfaceName Calcable
 * @Description: 定义一个抽象方法，传递一个证书，对整组进行绝对值计算并返回
 * @Author AllureLove
 * @Date 2019/11/17 
 * @Version V1.0
 **/
@FunctionalInterface
public interface Calcable {
    int calsAbs(int num);
}
