package com.guava.rawtype;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

import com.google.common.collect.Range;

/**
 * @author Tom Guan
 * @create 2020-04-04
 */
public class Test {
    public static void main(String[] args) {
        Arrays.asList("");
        Collection.toArray();
        Collections.min();
        Range.openClosed(2, 8).contains(3);

        Range.closedOpen(4, 4).isEmpty(); // returns true
        Range.openClosed(4, 4).isEmpty(); // returns true
        Range.closed(4, 4).isEmpty(); // returns false
        Range.open(4, 4).isEmpty(); // Range.open throws IllegalArgumentException
        Range.closed(3, 10).lowerEndpoint(); // returns 3
        Range.open(3, 10).lowerEndpoint(); // returns 3
        Range.closed(3, 10).lowerBoundType(); // returns CLOSED
        Range.open(3, 10).upperBoundType(); // returns OPEN

        //区间之间的最基本关系就是包含[encloses(Range)]:如果内区间的边界没有超出外区间的边界，则外区间包含 内区间。
        //包含判断的结果完全取决于区间端点的比较!

        //Range.isConnected(Range)判断区间是否是相连的。具体来说，isConnected 测试是否有区间同时包含于这 两个区间，
        // 这等同于数学上的定义”两个区间的并集是连续集合的形式”(空区间的特殊情况除外)。
        Range.closed(3, 5).isConnected(Range.open(5, 10)); // returns true
        Range.closed(0, 9).isConnected(Range.closed(3, 4)); // returns true
        Range.closed(0, 5).isConnected(Range.closed(3, 9)); // returns true
        Range.open(3, 5).isConnected(Range.open(5, 10)); // returns false
        Range.closed(1, 5).isConnected(Range.closed(6, 10)); // returns false

        //Range.intersection(Range)返回两个区间的交集:既包含于第一个区间，又包含于另一个区间的最大区间。
        //当且仅当两个区间是相连的，它们才有交集。如果两个区间没有交集，该方法将抛出 IllegalArgumentExceptio n。
        Range.closed(3, 5).intersection(Range.open(5, 10)); // returns (5, 5]
        Range.closed(0, 9).intersection(Range.closed(3, 4)); // returns [3, 4]
        Range.closed(0, 5).intersection(Range.closed(3, 9)); // returns [3, 5]
        Range.open(3, 5).intersection(Range.open(5, 10)); // throws IAE
        Range.closed(1, 5).intersection(Range.closed(6, 10)); // throws IAE

        //Range.span(Range)返回”同时包括两个区间的最小区间”，如果两个区间相连，那就是它们的并集。
        Range.closed(3, 5).span(Range.open(5, 10)); // returns [3, 10)
        Range.closed(0, 9).span(Range.closed(3, 4)); // returns [0, 9]
        Range.closed(0, 5).span(Range.closed(3, 9)); // returns [0, 9]
        Range.open(3, 5).span(Range.open(5, 10)); // returns (3, 10)
        Range.closed(1, 5).span(Range.closed(6, 10)); // returns [1, 10]

        Objects.hashCode("");
    }
}
