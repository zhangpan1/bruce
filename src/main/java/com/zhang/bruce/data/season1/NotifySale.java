package com.zhang.bruce.data.season1;

import com.tcredit.streaming.core.utils.LoggerUtil;

import java.util.Calendar;
import java.util.Date;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2024/4/12 5:32 下午
 */
public class NotifySale {
    public static void main(String[] args) {
//        List<NotifiEventGroupDTO> notifiEventGroupDTOS = Lists.newArrayList();
//        NotifiEventGroupDTO event = buildNotifiEventGroupDTO();
//        Map<String, List<NotifiEventGroupDTO>> groupedMap = notifiEventGroupDTOS.stream().filter(obj ->
//                StringUtils.isNotBlank(obj.getSalesname()) && !StringUtils.equalsIgnoreCase(obj.getSalesname(),"产品中心"))
//                .collect(Collectors.groupingBy(obj -> obj.getCustomerLevel() + "_" + obj.getSalesname() + "_" + obj.getDealType()));
        System.out.println(timeBetween(1712934336000L,22,8));
    }

    public static boolean timeBetween(Object time, int start, int end) {
        try {
            LoggerUtil.getLogger().debug("time == {}", time);
            LoggerUtil.getLogger().debug("start == {}", start);
            LoggerUtil.getLogger().debug("end == {}", end);
            /**
             * 判断time时刻是否在start整点到end整点之间
             */
            if (time == null || !(time instanceof Date||time instanceof Long))
                return false;
            Calendar c = Calendar.getInstance();
            if (time instanceof Date) {
                Date d = (Date)(time);
                c.setTime(d);
            }
            if (time instanceof Long) {
                c.setTimeInMillis(((Long) time).longValue());
            }
            int hour = c.get(Calendar.HOUR_OF_DAY);
            if (start < end)
                return start <= hour && hour < end;
            else if (start > end) {
                return start <= hour || hour < end;
            } else
                return false;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return false;
        }
    }


}
