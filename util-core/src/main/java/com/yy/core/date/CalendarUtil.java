package com.yy.core.date;

import com.yy.core.compare.CompareUtil;

import java.util.Calendar;

/**
 * @author Yu
 * @create 2022-04-01 21:49
 * @Description
 */
public class CalendarUtil {
    /**
     * {@code null}安全的{@link Calendar}比较，{@code null}小于任何日期
     *
     * @param calendar1 日期1
     * @param calendar2 日期2
     * @return 比较结果，如果calendar1 &lt; calendar2，返回数小于0，calendar1==calendar2返回0，calendar1 &gt; calendar2 大于0
     */
    public static int compare(Calendar calendar1, Calendar calendar2) {
        return CompareUtil.compare(calendar1, calendar2);
    }
}
