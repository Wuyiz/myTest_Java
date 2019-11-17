package com.wuyiz.learning.ThreadPool.Synchronized;

/**
 * @ClassName BaoZi
 * @Description: 保存包子的皮和馅，以及包子现有存货量的状态
 * @Author AllureLove
 * @Date 2019/11/13 
 * @Version V1.0
 **/
public class BaoZi {
    private String pi;  //包子皮
    private String xian;    //包子馅

    private boolean state = false;  //包子数量状态

    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
