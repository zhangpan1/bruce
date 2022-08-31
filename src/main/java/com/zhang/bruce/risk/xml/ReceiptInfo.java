package com.zhang.bruce.risk.xml;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.StringJoiner;

/**
 * 回执信息
 *
 * @author lijunhao
 * @date 2021/12/27 10:09 上午
 */
public class ReceiptInfo {

    /**
     * 错误定位
     */
    private String position;

    /**
     * 原因
     */
    private String reason;


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }


    public List<String> getPositionNodes() {
        if (StringUtils.isBlank(position)) {
            return Lists.newArrayList();
        }
        List<String> list = Lists.newArrayList();
        String[] split = StringUtils.split(position, "/");
        for (String s : split) {
            int start = StringUtils.indexOf(s, "[");
            list.add(StringUtils.substring(s, 0, start == -1 ? s.length() : start));
        }
        return list;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", ReceiptInfo.class.getSimpleName() + "[", "]")
                .add("position='" + position + "'")
                .add("reason='" + reason + "'")
                .toString();
    }
}
