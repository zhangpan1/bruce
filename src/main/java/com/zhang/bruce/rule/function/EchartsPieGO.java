package com.zhang.bruce.rule.function;

import java.io.Serializable;

/**
 * @className EchartsPieGO.java
 * @author Haodong.Wong
 * @version 1.0.0
 * @description echarts饼图(环图、玉玦图)出参
 * @date 2023/2/14 15:08
 */
public class EchartsPieGO implements Serializable {
    private static final long serialVersionUID = -3658284511516835737L;
    private String x;
    private String y;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }
}
