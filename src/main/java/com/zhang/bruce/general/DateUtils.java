package com.zhang.bruce.general;


import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 日期公用类
 */
public class DateUtils {

    private static final SimpleDateFormat yyyyMMddHHmmssFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static final Lock yyyyMMddHHmmssFormatLock = new ReentrantLock();
    private static final Lock yyyyMMddFormatLock = new ReentrantLock();

    /**
     * 默认生效时间 -- 今天
     */
    public static final String DEFAULT_EFFECTIVE_DATE = getChar10();
    /**
     * 默认失效时间 -- 2999-12-31
     */
    public static final String DEFAULT_EXPIRATION_DATE = "2999-12-31";

    /**
     * yyyyMMddHHmmss时间格式
     */
    public static final String FORMAT14 = "yyyyMMddHHmmss";

    /**
     * yyyyMMddHHmmssSSS时间格式
     */
    public static final String FORMAT17 = "yyyyMMddHHmmssSSS";

    /**
     * yyyy-MM-dd HH:mm:ss时间格式
     */
    public static final String FORMAT19 = "yyyy-MM-dd HH:mm:ss";

    /**
     * yyyy-MM-dd HH:mm:ss时间格式
     */
    public static final String FORMAT21 = "yyyy-MM-dd HH:mm:ss.S";

    /**
     * yyyy-MM-dd HH:mm:ss.SSS时间格式
     */
    public static final String FORMAT23 = "yyyy-MM-dd HH:mm:ss.SSS";

    /**
     * yyyy-MM-dd HH:mm:ss.SSSSS时间格式
     */
    public static final String FORMAT25 = "yyyy-MM-dd HH:mm:ss.SSSSS";

    /**
     * yyMMddHHmmss时间格式
     */
    public static final String FORMAT26 = "yyMMddHHmmss";

    /**
     * MMddHHmmss时间格式
     */
    public static final String FORMAT27 = "MMddHHmmss";

    /**
     * yyyy-MM-dd时间格式
     */
    public static final String FORMAT_DAY = "yyyy-MM-dd";

    /**
     * yyyyMMdd HH:mm:ss时间格式
     */
    public static final String FORMAT_DATE_TIME_17 = "yyyyMMdd HH:mm:ss";
    /**
     * yyyyMMdd时间格式
     */
    public static final String FORMAT_DATE_8 = "yyyyMMdd";

    /**
     * yyyy-MM-dd时间格式
     */
    public static final String FORMAT_TIME_6 = "HHmmss";

    public static final String DATE_PATTERN = "\\d{4}\\-\\d{1,2}\\-\\d{1,2}";

    public static final String TIMESTAMP_PATTERN_MM = "\\d{4}\\-\\d{1,2}\\-\\d{1,2} \\d{1,2}\\:\\d{1,2}\\:\\d{1,2}.\\d{1} CST";

    public static final String DATE_FORMAT = "yyyy-MM-dd";

    public static final String TIME_PATTERN = "\\d{1,2}\\:\\d{1,2}\\:\\d{1,2}";

    public static final String TIME_FORMAT = "HH:mm:ss";

    public static final String TIMESTAMP_PATTERN = "\\d{4}\\-\\d{1,2}\\-\\d{1,2} \\d{1,2}\\:\\d{1,2}\\:\\d{1,2}";

    public static final String TIMESTAMP_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static final String MONTHDAY_FORMAT = "yyyy年M月d日";

    public static final String TODAY = "今天";

    public static final String TOMORROW = "明天";

    /**
     * 工具类是静态成员的集合，注定不会被实例化。因此，不应该有公共的构造函数。 所以这里定义一个私有的构造函数，限制其实例化。
     */
    private DateUtils() {
    }

    public static String getChar10() {
        return DateFormatUtils.format(new Date(), "yyyy-MM-dd");
    }

    public static String getChar10(Date date) {
        return DateFormatUtils.format(date, "yyyy-MM-dd");
    }

    public static String getChar11() {
        return DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss");
    }

    public static String getChar14() {
        return DateFormatUtils.format(new Date(), FORMAT14);
    }

    /**
     * 获取当前8位格式日期
     */
    public static String getChar8() {
        return DateFormatUtils.format(new Date(), "yyyyMMdd");
    }

    /**
     * 获取当前8位格式日期
     */
    public static String getChar8(Date date) {
        return DateFormatUtils.format(date, "yyyyMMdd");
    }

    /**
     * 将长时间格式时间转换为字符串
     *
     * @param dateDate
     * @return
     */
    public static String dateToStrLong(Date dateDate, String format) {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(dateDate);
    }

    /**
     * 将长时间格式字符串转换为时间 yyyy-MM-dd HH:mm:ss
     *
     * @param strDate
     * @return
     */
    public static Date strToDateLong(String strDate, String format) {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        ParsePosition pos = new ParsePosition(0);
        return formatter.parse(strDate, pos);
    }

    /**
     * 将长时间格式字符串转换为时间 yyyyMMdd
     *
     * @param strDate
     * @return
     */
    public static Date strToDate8(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat(FORMAT_DATE_8);
        ParsePosition pos = new ParsePosition(0);
        return formatter.parse(strDate, pos);
    }

    public static String formatDateString(String dateString, String sourceFormat, String targetFormat) {
        String returnString = null;
        try {
            returnString = dateToStrLong(
                    org.apache.commons.lang3.time.DateUtils.parseDate(dateString, new String[]{sourceFormat}),
                    targetFormat);
        } catch (ParseException e) {
        }
        return returnString;
    }

    /**
     * 功能描述: <br>
     * 不同日期字符串转换成日期对象 〈功能详细描述〉
     *
     * @param dateStr
     * @return
     * @throws ParseException
     */
    public static Date parseDate(String dateStr) throws ParseException {
        Pattern pattern = Pattern.compile(DATE_PATTERN);
        Matcher matcher = pattern.matcher(dateStr);
        SimpleDateFormat sdf;
        Date date = null;

        Pattern patternMM = Pattern.compile(TIMESTAMP_PATTERN_MM);

        Matcher matcherMM = patternMM.matcher(dateStr);
        if (matcher.matches()) {
            sdf = new SimpleDateFormat(DATE_FORMAT);
            date = sdf.parse(dateStr);
        } else if (matcherMM.matches()) {
            sdf = new SimpleDateFormat(DATE_FORMAT);
            date = sdf.parse(dateStr);
        } else {
            pattern = Pattern.compile(TIME_PATTERN);
            matcher = pattern.matcher(dateStr);
            if (matcher.matches()) {
                sdf = new SimpleDateFormat(TIME_FORMAT);
                date = sdf.parse(dateStr);
            } else {
                pattern = Pattern.compile(TIMESTAMP_PATTERN);
                matcher = pattern.matcher(dateStr);
                if (matcher.matches()) {
                    sdf = new SimpleDateFormat(TIMESTAMP_FORMAT);
                    date = sdf.parse(dateStr);
                }
            }
        }

        return date;
    }

    public static Date parseDate(String dateStr, String dateFormat) throws ParseException {
        SimpleDateFormat sdf;
        if (dateFormat == null) {
            sdf = new SimpleDateFormat("yyyy-MM-dd");
        } else {
            sdf = new SimpleDateFormat(dateFormat);
        }

        return sdf.parse(dateStr);
    }

    /**
     * 获取指定日期 向前或向后滚动特定分钟后的日期
     *
     * @param dateNow    String 当前日期
     * @return String 指定日期 +/- 特定天数 后的日期（格式yyyy-MM-dd HH:mm:ss）
     */
    public static String rollHour(String dateNow, int rollHour) {
        String dateReturn = "";
        if (dateNow == null || dateNow.trim().length() < 19) {
            return dateReturn;
        }
        try {
            SimpleDateFormat sf = new SimpleDateFormat(FORMAT19);
            dateReturn = sf.format(addHour(sf.parse(dateNow.trim()), rollHour));
        } catch (ParseException e) {
        }
        return dateReturn;
    }

    /**
     * 指定时间向前或者向后挪动rollMinute分钟
     *
     * @param date
     * @param rollMinute
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    public static Date rollMinute(Date date, int rollMinute) {

        if (date == null) {
            return null;
        }

        String dateNow = dateToStrLong(date, FORMAT19);
        String dateReturn = "";

        try {
            SimpleDateFormat sf = new SimpleDateFormat(FORMAT19);
            Calendar c = Calendar.getInstance();
            c.setTime(sf.parse(dateNow));
            c.add(Calendar.MINUTE, rollMinute);
            dateReturn = sf.format(c.getTime());
        } catch (ParseException e) {
        }
        return strToDateLong(dateReturn, FORMAT19);
    }

    public static String getChar6() {
        return DateFormatUtils.format(new Date(), "HHmmss");
    }

    public static String getCharTimeFormat() {
        return DateFormatUtils.format(new Date(), TIME_FORMAT);
    }

    public static String getChar19() {
        return DateFormatUtils.format(new Date(), FORMAT19);
    }

    public static String getChar19(Date date) {
        return DateFormatUtils.format(date, FORMAT19);
    }

    public static Date addHour(Date src, int rollHour) {
        Calendar c = Calendar.getInstance();
        c.setTime(src);
        c.add(Calendar.HOUR_OF_DAY, rollHour);

        return c.getTime();
    }

    public static String formatChar10(String char8) {
        if (char8 == null || char8.length() == 0) {
            return char8;
        }
        return char8.substring(0, 4) + "-" + char8.substring(4, 6) + "-" + char8.substring(6);
    }

    public static String formatChar14(String char19) {
        if (char19 == null || char19.length() == 0) {
            return char19;
        }
        return char19.substring(0, 4) + char19.substring(5, 7) + char19.substring(8, 10) + char19.substring(11, 13)
                + char19.substring(14, 16) + char19.substring(17);
    }

    /**
     * 时间克隆方法 如果时间对象为数据库时间格式 则返回数据库时间格式的对象
     *
     * @param date
     * @return
     */
    public static Date clone(Date date) {
        if (date == null) {
            return null;
        }

        if (date instanceof Timestamp) {
            return new Timestamp(date.getTime());
        }

        return new Date(date.getTime());
    }

    /**
     * 功能描述: 获取相对于当前时间一段时间的指定时间<br>
     * 〈功能详细描述〉
     *
     * @param field
     * @param amount
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    public static Date getDate(int field, int amount) {
        return getDate(new Date(), field, amount);
    }

    public static Date getDate(Date date, int field, int amount) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(field, amount);
        return calendar.getTime();
    }

    /**
     * 得到当前日期
     */
    public static Date getDate() {
        return new Date();
    }

    /**
     * 功能描述: 获取格式化的日期<br>
     * 〈功能详细描述〉
     *
     * @param date
     * @param format
     * @return
     * @see [相关类/方法](可选)
     * @since 2.4.0
     */
    public static Date getDate(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        ParsePosition pos = new ParsePosition(0);
        return sdf.parse(sdf.format(date), pos);
    }

    /**
     * 得到最大日期
     */
    public static Date getMaxDate() {
        Date maxDate = null;
        try {
            maxDate = parseDate("9999", "yyyy");
        } catch (ParseException e) {
        }
        return maxDate;
    }
    /**
     * 获取参数日期的前后 N天
     *
     */
    public static Date getAfBeDayDate(Date date,Integer nDay){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE,nDay);
        return calendar.getTime();
    }
    /**
     * 获取指定时间点前后的时间段内日期列表
     */
    public static List<String> getPeriodOfTime(String dateStr, String format, int num) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        List<String> list = new ArrayList<>();
        Calendar calc = Calendar.getInstance();
        try {
            int absNum = Math.abs(num);
            for (int i = 1; i <= absNum; i++) {
                calc.setTime(sdf.parse(dateStr));
                if (num > 0) {
                    calc.add(GregorianCalendar.DATE, i);
                } else {
                    calc.add(GregorianCalendar.DATE, -i);
                }
                Date date = calc.getTime();
                list.add(sdf.format(date));
            }
        } catch (ParseException e) {
        }
        return list;
    }

    /**
     * 获取几天前的时间
     *
     * @param date   当前日期时间
     * @param day    几天前的天数
     * @param format 输出时间格式
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    public static final String getDateBefore(Date date, int day, String format) {
        Calendar now = Calendar.getInstance();
        now.setTime(date);
        now.set(Calendar.DATE, now.get(Calendar.DATE) - day);

        return DateUtils.dateToStrLong(now.getTime(), format);
    }

    /**
     * 功能描述: <br>
     * 〈秒转换为日期〉
     *
     * @param second
     * @return
     * @see [相关类/方法](可选)
     * @since [1.9.0](可选)
     */
    public static Date secondToDate(long second) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(second * 1000);//转换为毫秒
        return calendar.getTime();
    }

    /**
     * 功能描述: <br>
     * 〈功能详细描述〉 获取当天开始时间(当天) 2019-07-20 00:00:00
     *
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    public static String getStartTimeChangeByHour(int hour) {
        Calendar todayStart = Calendar.getInstance();
        todayStart.set(Calendar.HOUR_OF_DAY, hour);
        todayStart.set(Calendar.MINUTE, 0);
        todayStart.set(Calendar.SECOND, 0);
        todayStart.set(Calendar.MILLISECOND, 0);

        return DateFormatUtils.format(todayStart.getTime(), FORMAT19);
    }

    /**
     * @return 获取今天的日期字符串
     */
    private static String getToday() {
        //取时间
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(FORMAT_DATE_8);
        String dateString = formatter.format(date);
        return dateString;
    }

    /**
     * @return 获取明天的日期字符串
     */
    private static String getTomorrowday() {
        //取时间
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        //把日期往后增加一天.整数往后推,负数往前移动
        calendar.add(Calendar.DATE, 1);
        //这个时间就是日期往后推一天的结果
        date = calendar.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat(FORMAT_DATE_8);
        String dateString = formatter.format(date);
        return dateString;
    }

    /**
     * @return 获取传入日期是一周的周几
     */
    private static String getDayOfWeek(String day) {
        try {
            Date date = new SimpleDateFormat(FORMAT_DATE_8).parse(day);
            Calendar calendar = Calendar.getInstance();
            calendar.setFirstDayOfWeek(Calendar.MONDAY);
            //设置每周的第一天为周一
            calendar.setTime(date);
            int a = calendar.get(Calendar.DAY_OF_WEEK);
            switch (a) {
                case 1:
                    return "周日";
                case 2:
                    return "周一";
                case 3:
                    return "周二";
                case 4:
                    return "周三";
                case 5:
                    return "周四";
                case 6:
                    return "周五";
                case 7:
                    return "周六";
            }
        } catch (ParseException e) {
        }
        return "";
    }

    /**
     * 入参格式 yyyy-MM-dd-X
     *
     * @return 将日期字符串格式化为FORMAT_DATE_8 yyyyMMdd
     */
    public static String formatString(String date) {
        String output = null;
        try {
            String input = date.substring(0, 10);
            Date date1 = new SimpleDateFormat(FORMAT_DAY).parse(input);
            output = new SimpleDateFormat(FORMAT_DATE_8).format(date1);
        } catch (Exception e) {
        }
        return output;
    }

    /**
     * @return 将日期字符串yyyyMMdd 格式化为M月D日
     */
    public static String getMonthAndDay(String inputString) {
        String outputString = null;
        try {
            SimpleDateFormat format = new SimpleDateFormat(FORMAT_DATE_8);
            Date date = format.parse(inputString);
            String now = new SimpleDateFormat(MONTHDAY_FORMAT).format(date);
            outputString = now.substring(5);
        } catch (Exception e) {
        }
        return outputString;
    }
    /**
     * 时间格式化 yyyy-MM-dd HH:mm:ss
     * @param date
     * @return
     */
    public static String getDateStringByFormat(Date date, String format){
        if(date == null){
            return "";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        String dateStr = simpleDateFormat.format(date);
        return dateStr;
    }
    public static Date getDate(Date date,int days){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DAY_OF_MONTH, days);
        Date time = c.getTime();
        return time;
    }
    /**
     * @return 将日期字符串yyyyMMdd 转换为 一周的第几天，如果跟今天日期相等则返回今天，如
     * 果跟明天日期相等，则返回明天，否则返回周几
     */
    public static String getWeekAndDay(String inputString) {
        String today = getToday();
        String tomorrowDay = getTomorrowday();
        // 跟今天相等则返回今天
        if (StringUtils.equals(inputString, today)) {
            return TODAY;
        } else if (StringUtils.equals(inputString, tomorrowDay)) {
            return TOMORROW;
        } else {
            return getDayOfWeek(inputString);
        }
    }
    /**
     * 时间格式化 yyyy-MM-dd HH:mm:ss
     * @param date
     * @return
     */
    public static String formateyyyyMMddHHmmss(Date date){
        if(date == null){
            return "";
        }
        yyyyMMddHHmmssFormatLock.lock();
        String dateStr = yyyyMMddHHmmssFormat.format(date);
        yyyyMMddHHmmssFormatLock.unlock();
        return dateStr;
    }

    public static String parseOccTimeString(Long lt) {
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //将时间戳转换为时间
        Date date = new Date(lt);
        //将时间调整为yyyy-MM-dd HH:mm:ss时间样式
        res = simpleDateFormat.format(date);
        return res;
    }

    public static String long2DateString(long time) {
        String format = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sf = new SimpleDateFormat(format);
        Date date = new Date(time);
        return sf.format(date);
    }
    public static Date getStartOfDay(Date date, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, -day);
        return getStartOfDay(calendar.getTime());
    }
    // 获得某天最小时间 2019-10-15 00:00:00
    public static Date getStartOfDay(Date date) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());
        LocalDateTime startOfDay = localDateTime.with(LocalTime.MIN);
        return Date.from(startOfDay.atZone(ZoneId.systemDefault()).toInstant());
    }
}
