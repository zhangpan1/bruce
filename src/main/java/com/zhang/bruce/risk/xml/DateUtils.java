package com.zhang.bruce.risk.xml;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateUtils {
    public static final String DATE_FORMAT_HHMMSS = "HHmmss";
    public static final String DATE_FORMAT_HHMMSS_WITH = "HH:mm:ss";
    private static final int TOTAL_HOUR_IN_ONE_DAY = 24;
    public static final String DATE_FORMAT_DATE_ONLY = "yyyyMMdd";
    public static final String DATE_FORMAT_MONTH_ONLY = "yyyyMM";
    public static final String DATE_FORMAT_MONTH_ONLY_2 = "yyyy-MM";
    public static final String DATE_FORMAT_DATE = "yyyy-MM-dd";
    public static final String DATE_FORMAT_DATE_2 = "yyyy/MM/dd";
    public static final String DATE_FORMAT_YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
    public static final String DATETIME_FORMAT_COMMON = "yyyy-MM-dd HH:mm:ss";

    public DateUtils() {
    }

    public static Date getDateByStandardStr(String standardDate) {
        String format;
        switch (standardDate.trim().length()) {
            case 10:
                format = "yyyy-MM-dd";
                break;
            default:
                format = "yyyy-MM-dd HH:mm:ss";
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        Date dateValue = null;

        try {
            dateValue = dateFormat.parse(standardDate);
        } catch (ParseException var5) {
        }

        return dateValue;
    }

    public static Date getDate(Object date) {
        return date instanceof Date ? (Date) date : getDateByStandardStr(date.toString());
    }

    /**
     * 转化时间格式
     *
     * @param date
     * @param format
     * @return
     */
    public static String getDateStr(LocalDate date, String format) {
        if (date == null) {
            return null;
        }
        return date.format(DateTimeFormatter.ofPattern(format));
    }

    public static String getMonthStr(Date date, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(date);
    }

    public static String getMonthStr(String str) {
        String[] strs = str.split("-");
        StringBuilder builder = new StringBuilder(strs[0].substring(3, 5));
        builder.append(strs[1]);
        return builder.toString();
    }

    public static Date getTodayAfterNum(Date date, Integer num) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendarTimeSet(calendar);
        calendar.add(5, num);
        return calendar.getTime();
    }

    public static Date getNextMonthAfterNum(Date date, Integer num) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendarTimeSet(calendar);
        calendar.add(2, 1);
        calendar.set(5, 1);
        calendar.add(5, num - 1);
        return calendar.getTime();
    }

    public static Date getNextQuarterAfterNum(Date date, Integer num) {
        Date quarterDayEnd = getQuarterDayEnd(date);
        return getTodayAfterNum(quarterDayEnd, num);
    }

    public static Date convertDate(String date, String exp) {
        if (null != date && !"".equals(date)) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            if (null != exp && !"".equals(exp)) {
                sdf = new SimpleDateFormat(exp);
            }

            try {
                return sdf.parse(date);
            } catch (ParseException var4) {
                var4.printStackTrace();
                return null;
            }
        } else {
            throw new IllegalArgumentException("Invalid string date!");
        }
    }

    public static String convertDate(Date date, String exp) {
        if (null == date) {
//            throw new IllegalArgumentException("Invalid date!");
            return "";
        } else {
            try {
                SimpleDateFormat sdf;
                if (null != exp && !"".equals(exp)) {
                    sdf = new SimpleDateFormat(exp);
                    return sdf.format(date);
                } else {
                    sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    return sdf.format(date);
                }
            } catch (Exception e) {

            }
            return "";
        }
    }

    public static Date convertDateToDate(Date date, String exp) {
        if (null == date) {
            return null;
        } else {
            try {
                SimpleDateFormat sdf;
                if (null != exp && !"".equals(exp)) {
                    sdf = new SimpleDateFormat(exp);
                    return sdf.parse(sdf.format(date));
                } else {
                    sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    return sdf.parse(sdf.format(date));
                }
            } catch (Exception e) {
//                throw new IllegalArgumentException("Invalid date!");
            }
            return null;
        }
    }

    public static String currentDate() {
        return convertDate(new Date(), DATE_FORMAT_DATE);
    }

    public static List<Date> splitDays(Date start, Date end) {
        if (null != start && end != null) {
            if (start.after(end)) {
                throw new IllegalArgumentException("Invalid date.");
            } else {
                ArrayList dates;
                for (dates = new ArrayList(); !start.after(end); start = com.yeepay.g3.utils.common.DateUtils.addDay(start, 1)) {
                    dates.add(start);
                }

                return dates;
            }
        } else {
            throw new IllegalArgumentException("Invalid date.");
        }
    }

    public static List<Date> splitDayHours(Date date) {
        if (null == date) {
            return new ArrayList();
        } else {
            List<Date> dates = new ArrayList();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.set(11, 0);
            int hour = calendar.get(11);

            while (hour < 24) {
                dates.add(getHourStart(calendar.getTime()));
                ++hour;
                calendar.set(11, hour);
            }

            return dates;
        }
    }

    public static Date getLastMonthDateStart(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(2, -1);
        return getMonthDayStart(calendar.getTime());
    }

    public static Date getLastMonthDateEnd(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(2, -1);
        return getMonthDayEnd(calendar.getTime());
    }

    public static Date getLastWeekDateStart(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(4, -1);
        return getWeekDayStart(calendar.getTime());
    }

    public static Date getLastWeekDateEnd(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(4, -1);
        return getWeekDayEnd(calendar.getTime());
    }

    public static Date getYearDayEnd(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(2, 11);
        calendar.set(5, 1);
        calendarTimeSet(calendar);
        calendar.add(2, 1);
        calendar.add(14, -1);
        return calendar.getTime();
    }

    public static Date getYearDayStart(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(2, 0);
        calendar.set(5, 1);
        calendarTimeSet(calendar);
        return calendar.getTime();
    }

    public static Date getQuarterDayEnd(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int currentMonth = calendar.get(2);
        if (currentMonth >= 0 && currentMonth <= 2) {
            calendar.set(2, 2);
        } else if (currentMonth >= 3 && currentMonth <= 5) {
            calendar.set(2, 5);
        } else if (currentMonth >= 6 && currentMonth <= 8) {
            calendar.set(2, 8);
        } else if (currentMonth >= 9 && currentMonth <= 11) {
            calendar.set(2, 11);
        }

        calendar.set(5, 1);
        calendarTimeSet(calendar);
        calendar.add(2, 1);
        calendar.add(14, -1);
        return calendar.getTime();
    }

    public static Date getQuarterDayStart(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int currentMonth = calendar.get(2);
        if (currentMonth >= 0 && currentMonth <= 2) {
            calendar.set(2, 0);
        } else if (currentMonth >= 3 && currentMonth <= 5) {
            calendar.set(2, 3);
        } else if (currentMonth >= 6 && currentMonth <= 8) {
            calendar.set(2, 6);
        } else if (currentMonth >= 9 && currentMonth <= 11) {
            calendar.set(2, 9);
        }

        calendar.set(5, 1);
        calendarTimeSet(calendar);
        return calendar.getTime();
    }

    /**
     * 获取到月最后的时间（以毫秒结束）
     *
     * @param date
     * @return
     */
    public static Date getMonthDayEnd(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, 1);
        calendarTimeSet(calendar);
        calendar.add(2, 1);
        calendar.add(14, -1);
        return calendar.getTime();
    }

    /**
     * 获取到月最后的时间（以秒结束）
     *
     * @param date
     * @return
     */
    public static Date getMonthDayEndWithSecond(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, 1);
        calendarTimeSet(calendar);
        calendar.add(2, 1);
        calendar.add(13, -1);
        return calendar.getTime();
    }

    public static Date getMonthDayStart(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, 1);
        calendarTimeSet(calendar);
        return calendar.getTime();
    }

    public static Date getWeekDayEnd(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(7, 1);
        calendarTimeSet(calendar);
        calendar.add(3, 1);
        calendar.add(14, -1);
        return calendar.getTime();
    }

    public static Date getWeekDayStart(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(7, 1);
        calendarTimeSet(calendar);
        return calendar.getTime();
    }

    public static Date getDayEnd(Date date) {
        if (date == null) {
            return null;
        } else {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendarTimeSet(calendar);
            calendar.add(5, 1);
            calendar.add(14, -1);
            return calendar.getTime();
        }
    }

    public static Date getDayStart(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendarTimeSet(calendar);
        return calendar.getTime();
    }

    public static Date getHourEnd(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        timeSet(calendar);
        calendar.add(10, 1);
        calendar.add(14, -1);
        return calendar.getTime();
    }

    public static Date getHourStart(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        timeSet(calendar);
        return calendar.getTime();
    }

    private static void calendarTimeSet(Calendar calendar) {
        calendar.set(11, 0);
        timeSet(calendar);
    }

    private static void timeSet(Calendar calendar) {
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    public static boolean timeIntervalLegal(Date startDate, Date endDate) {
        if (null == startDate) {
            return false;
        } else if (null == endDate) {
            return true;
        } else {
            return !startDate.after(endDate);
        }
    }

    public static boolean isTimeInInterval(Date left, Date right, Date target) {
        if (null != left && null != target) {
            if (null == right) {
                if (!target.before(left)) {
                    return true;
                }
            } else if (!target.before(left) && !target.after(right)) {
                return true;
            }

            return false;
        } else {
            throw new IllegalArgumentException("The date of left, target can not be null!");
        }
    }

    public static Date calculateEffectiveDate(Date date, int amount) {
        if (null == date) {
            throw new IllegalArgumentException("Illegal arguments for calculate next effective end date!");
        } else {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(13, amount);
            return calendar.getTime();
        }
    }

    public static boolean isEquals(String s, Date d, String pattern) {
        DateFormat df = new SimpleDateFormat(pattern);
        return df.format(d).equals(s);
    }

    public static Date mothDayAdd(Date date, int days) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(5, days);
        return c.getTime();
    }

    public static List<String> getMonthBetween(String minDate, String maxDate) {
        ArrayList<String> result = new ArrayList();
        Calendar min = Calendar.getInstance();
        Calendar max = Calendar.getInstance();
        min.setTime(convertDate(minDate, DATE_FORMAT_DATE));
        min.set(min.get(1), min.get(2), 1);
        max.setTime(convertDate(maxDate, DATE_FORMAT_DATE));
        max.set(max.get(1), max.get(2), 2);
        Calendar curr = min;

        while (curr.before(max)) {
            result.add(convertDate(curr.getTime(), DATE_FORMAT_MONTH_ONLY));
            curr.add(2, 1);
        }

        return result;
    }

    public static List<String> getMonthBetweenForSharding(String minDate, String maxDate) {
        ArrayList<String> result = new ArrayList();
        Calendar min = Calendar.getInstance();
        Calendar max = Calendar.getInstance();
        min.setTime(convertDate(minDate, DATE_FORMAT_DATE));
        min.set(min.get(1), min.get(2), 1);
        max.setTime(convertDate(maxDate, DATE_FORMAT_DATE));
        max.set(max.get(1), max.get(2), 2);
        Calendar curr = min;

        while (curr.before(max)) {
            result.add(convertDate(curr.getTime(), "yyMM"));
            curr.add(2, 1);
        }

        return result;
    }

    /**
     * 获取两个时间之间的月份间隔
     *
     * @param minDate 最小时间
     * @param maxDate 最大时间
     * @param format  时间格式
     * @return
     */
    public static List<String> getMonthBetweenByDateWithFormat(Date minDate, Date maxDate, String format) {
        try {
            Objects.requireNonNull(minDate);
            Objects.requireNonNull(maxDate);
            Objects.requireNonNull(format);
        } catch (Exception e) {
            throw new RuntimeException("拆分时间段与时间格式模板不可为空");
        }
        if (minDate.getTime() > maxDate.getTime()) {
            throw new RuntimeException("最小时间不可晚于最大时间");
        }
        Calendar min = Calendar.getInstance();
        min.setTime(minDate);
        min.set(min.get(1), min.get(2), 1);
        Calendar max = Calendar.getInstance();
        max.setTime(maxDate);
        max.set(max.get(1), max.get(2), 2);
        Calendar curr = min;
        List<String> result = new ArrayList<>();
        while (curr.before(max)) {
            result.add(convertDate(curr.getTime(), format));
            curr.add(2, 1);
        }
        return result;
    }

    /**
     * 获取月间隔时间段
     *
     * @param minDate
     * @param maxDate
     * @return
     */
    public static List<Map<String, LocalDateTime>> getMonthPeriod(Date minDate, Date maxDate) {
        List<String> months = getMonthBetweenByDateWithFormat(minDate, maxDate, DATE_FORMAT_MONTH_ONLY_2);
        List<Map<String, LocalDateTime>> result = new ArrayList<>();
        for (int i = 0; i < months.size(); i++) {
            Map<String, LocalDateTime> map = new HashMap<>();
            Date startDate = parseStr2Date(months.get(i) + "-01 00:00:00", DATETIME_FORMAT_COMMON);
            map.put("start", parseToLocalDateTime(startDate));
            map.put("end", parseToLocalDateTime(getMonthDayEndWithSecond(startDate)));
            result.add(map);
        }
        return result;
    }

    /**
     * 字符串按格式转化为时间
     *
     * @param str
     * @param format
     * @return
     */
    public static Date parseStr2Date(String str, String format) {
        SimpleDateFormat mat = new SimpleDateFormat(format);
        try {
            return mat.parse(str);
        } catch (ParseException e) {
            throw new RuntimeException("时间转换异常");
        }
    }

    public static LocalDate parseToLocalDate(Date date) {
        if (date == null) {
            return null;
        }
        Instant instant = date.toInstant();
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        return localDateTime.toLocalDate();
    }

    /**
     * 将localDateTime类型的日期转化为Date类型的日期
     *
     * @param localDateTime
     * @return
     */
    public static Date parseLocalDateTimeToDate(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return null;
        }
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    public static LocalDate convertLocalDate(String dateStr, String format) {
        return LocalDate.parse(dateStr, DateTimeFormatter.ofPattern(format));
    }

    public static Date parseLocalDateToDate(LocalDate localDate) {
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zdt = localDate.atStartOfDay(zoneId);
        return Date.from(zdt.toInstant());
    }

    public static LocalDateTime parseToLocalDateTime(Date date) {
        if (date == null) {
            return null;
        }
        Instant instant = date.toInstant();
        ZoneId zone = ZoneId.systemDefault();
        return LocalDateTime.ofInstant(instant, zone);
    }

    /**
     * 格式化
     *
     * @param localDate
     * @param format
     * @return
     */
    public static String format(LocalDate localDate, String format) {
        if (localDate == null) {
            return null;
        }
        return localDate.format(DateTimeFormatter.ofPattern(format));
    }

    /**
     * 对指定的时间进行月份加减计算
     *
     * @param date
     * @param increaseNum
     * @return
     */
    public static Date dateIncreaseMonth(Date date, int increaseNum) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + increaseNum, calendar.get(Calendar.DATE));
        return calendar.getTime();
    }

    /**
     * 将时间localDateTime按照format的格式进行格式化
     *
     * @param localDateTime 时间
     * @param format
     * @return
     */
    public static String format(LocalDateTime localDateTime, String format) {
        if (localDateTime == null) {
            return null;
        }
        return localDateTime.format(DateTimeFormatter.ofPattern(format));
    }

    /**
     * 时间格式化
     *
     * @param date
     * @param format
     * @return
     */
    public static String format(Date date, String format) {
        if (date == null) {
            return null;
        }
        try {
            return new SimpleDateFormat(format).format(date);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 往前计算时间
     *
     * @param date
     * @param duration
     * @return
     */
    public static Date getDateBefore(Date date, int duration) {
        if (date == null) {
            return null;
        }
        return org.apache.commons.lang3.time.DateUtils.addDays(date, -duration);
    }


    /**
     * 获取一段时间范围内的随机时间
     *
     * @param start 开始时间
     * @param end   结束时间
     * @return
     */
    public static Date getRandomDateTime(Date start, Date end) {
        return getRandomDateTimeWithExclude(start, end, null, null);
    }

    /**
     * 获取一段时间范围内的随机时间，并排除其中特定的时间段
     *
     * @param start        开始时间
     * @param end          结束时间
     * @param excludeStart 排除时间段开始时间
     * @param excludeEnd   排除时间段结束时间
     * @return
     */
    public static Date getRandomDateTimeWithExclude(Date start, Date end, Date excludeStart, Date excludeEnd) {
        try {
            Objects.requireNonNull(start);
            Objects.requireNonNull(end);
            if (excludeStart != null) {
                Objects.requireNonNull(excludeEnd);
            }
            if (excludeEnd != null) {
                Objects.requireNonNull(excludeStart);
            }
        } catch (Exception e) {
            throw new RuntimeException("随机时间入参异常.");
        }

        long startLong = start.getTime();
        long excludeStartLong = excludeStart.getTime();
        long excludeEndLong = excludeEnd.getTime();
        long endLong = end.getTime();

        if (startLong == endLong) {
            return start;
        }
        if (startLong > endLong) {
            throw new RuntimeException("随机时间 开始时间不可大于等于结束时间.");
        }

        if (excludeStart != null &&
                (startLong > excludeStartLong
                        || excludeStartLong > excludeEndLong
                        || excludeEndLong > endLong)) {
            throw new RuntimeException("随机时间 时间范围错误.");
        }
        long resultDate = doGetRandomDateTime(startLong, endLong, excludeStartLong, excludeEndLong);

        return new Date(resultDate);

    }

    /**
     * 执行随机时间获取
     *
     * @return
     */
    private static long doGetRandomDateTime(Long start, Long end, Long excludeStart, Long excludeEnd) {
        long rtn = start + (long) (Math.random() * (end - start));
        if (rtn == start || rtn == end) {
            return doGetRandomDateTime(start, end, excludeStart, excludeEnd);
        }
        if (excludeStart != null && (rtn >= excludeStart && rtn <= excludeEnd)) {
            return doGetRandomDateTime(start, end, excludeStart, excludeEnd);
        }
        return rtn;
    }

    public static Date getCalculateDate(Date source, int diff, int unit) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(source);
        calendar.add(unit, diff);
        return calendar.getTime();

    }

    /**
     * 判断输入的日期是否是周末
     *
     * @param date
     * @return
     */
    public static boolean isWeekend(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        boolean isFirstSunday = (calendar.getFirstDayOfWeek() == Calendar.SUNDAY);
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        if (isFirstSunday) {
            day = day - 1;
            if (day == 0) {
                day = 7;
            }
        }
        return day == 6 || day == 7;
    }


    /**
     * 获取当前时间年月日
     *
     * @return
     */
    public static String getThisDate(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(date);
    }

    /**
     * 获取m目标时间年月日
     *
     * @param diff 时间差
     * @param unit 时间单位
     * @return
     */
    public static String getTargetDate(int diff, int unit, Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(unit, diff);
        return cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DATE);
    }

    /**
     * 获取时间对应单位的数值
     * @param date
     * @param unit
     * @return
     */
    public static int getEachUnit(Date date, int unit){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(unit);
    }

    public static String getEndDayOfMonth(String year,String month){
        if (Arrays.asList("1","3","5","7","8","10","12").contains(month)){
            return "31";
        }else if (Arrays.asList("3","5","9","11").contains(month)){
            return "30";
        }else if ("2" == month){
            if (Integer.parseInt(year) % 4 == 0){
                return "29";
            }else {
                return "28";
            }
        }else {
            throw new RuntimeException("error month");
        }

    }

    /**
     * @param date
     * @Description: 将日期转化为日期23：59：59
     */
    public static Date ToDetailTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH),
                23, 59, 59);
        Date endOfDate = calendar.getTime();
        return endOfDate;
    }

    /**
     * @param date
     * @Description: 清零日期对象的时分秒
     */
    public static Date zeroToDetailTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH),
                00, 00, 00);
        Date endOfDate = calendar.getTime();
        return endOfDate;
    }

    /**
     * 选出最早的时间
     *
     * @param list 时间列表
     * @return 最早的时间
     */
    public static Date getEarliestDateFromList(List<Date> list) {
        list.sort(new Comparator<Date>() {
            @Override
            public int compare(Date o1, Date o2) {
                return o1.compareTo(o2);
            }
        });
        return list.get(0);
    }


    public static final String parseDateToStr(final String format, final Date date) {
        return new SimpleDateFormat(format).format(date);
    }

    public static LocalDateTime parseStrToLocalDateTime(String occTime, String format) {
        try {
            Date parse = new SimpleDateFormat(format).parse(occTime);
            return parseToLocalDateTime(parse);
        } catch (Exception e) {
            return null;
        }
    }

    public static LocalDateTime now() {
        return LocalDateTime.now();
    }
}
