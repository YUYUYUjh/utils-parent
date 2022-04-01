package com.yy.core.date;

import java.util.Date;

/**
 * @author Yu
 * @create 2022-04-01 21:55
 * @Description
 */
public class DateUtil extends Date {
    /**
     * 是否在给定日期之前
     *
     * @param date 日期
     * @return 是否在给定日期之前
     */
    public boolean isBefore(Date date) {
        if (null == date) {
            throw new NullPointerException("Date to compare is null !");
        }
        return compareTo(date) < 0;
    }

    /**
     * 是否在给定日期之前或与给定日期相等
     *
     * @param date 日期
     * @return 是否在给定日期之前或与给定日期相等
     */
    public boolean isBeforeOrEquals(Date date) {
        if (null == date) {
            throw new NullPointerException("Date to compare is null !");
        }
        return compareTo(date) <= 0;
    }

    /**
     * 是否在给定日期之后
     *
     * @param date 日期
     * @return 是否在给定日期之后
     * @since 4.1.3
     */
    public boolean isAfter(Date date) {
        if (null == date) {
            throw new NullPointerException("Date to compare is null !");
        }
        return compareTo(date) > 0;
    }

    /**
     * 是否在给定日期之后或与给定日期相等
     *
     * @param date 日期
     * @return 是否在给定日期之后或与给定日期相等
     * @since 3.0.9
     */
    public boolean isAfterOrEquals(Date date) {
        if (null == date) {
            throw new NullPointerException("Date to compare is null !");
        }
        return compareTo(date) >= 0;
    }
}
