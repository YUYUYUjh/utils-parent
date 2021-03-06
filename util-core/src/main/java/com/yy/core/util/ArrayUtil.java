package com.yy.core.util;

/**
 * @author Yu
 * @create 2022-04-01 22:30
 * @Description: 数组工具类
 */
public class ArrayUtil {

    /**
     * 数组是否为空
     *
     * @param <T>   数组元素类型
     * @param array 数组
     * @return 是否为空
     */
    public static <T> boolean isEmpty(T[] array) {
        return array == null || array.length == 0;
    }
}