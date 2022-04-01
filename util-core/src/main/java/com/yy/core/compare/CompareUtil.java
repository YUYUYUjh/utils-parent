package com.yy.core.compare;

/**
 * @author Yu
 * @create 2022-04-01 21:40
 * @Description
 */
public class CompareUtil {

    /**
     * 对象比较, {@code null}对象小于任何对象
     * @param <T> 比较的对象类型 (必须实现Comparable接口)
     * @param c1  对象1, 可以为{@code null}
     * @param c2  对象2, 可以为{@code null}
     * @return 比较结果, 如果c1 &lt; c2 返回数小于0, c1==c2返回0, c1 &gt; c2 大于0
     */
    public static <T extends Comparable<? super T>> int compare(T c1, T c2) {
        return compare(c1, c2, false);
    }

    /**
     * 对象比较
     * @param <T> 比较的对象类型 (必须实现Comparable接口)
     * @param c1  对象1, 可以为{@code null}
     * @param c2  对象2, 可以为{@code null}
     * @param isNullGreater 当被比较对象为null时是否排在后面, true表示null大于任何对象,false反之
     * @return 比较结果, 如果c1 &lt; c2 返回数小于0, c1==c2返回0, c1 &gt; c2 大于0
     */
    public static <T extends Comparable<? super T>> int compare(T c1, T c2, boolean isNullGreater) {
        if (c1 == c2) {
            return 0;
        } else if (c1 == null) {
            return isNullGreater ? 1 : -1;
        } else if (c2 == null) {
            return isNullGreater ? -1 : 1;
        }

        return c1.compareTo(c2);
    }
}
