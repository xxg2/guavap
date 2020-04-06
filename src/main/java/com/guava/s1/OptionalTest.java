package com.guava.s1;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;

import java.util.Objects;


/**
 * @author Tom Guan
 * @create 2020-03-13
 */
public class OptionalTest {
    public static void main(String[] args) {
        Optional<Integer> possible = Optional.of(5);
        possible.isPresent();
        possible.get();

        Preconditions.checkArgument(false);
        Objects.isNull(null);

        ComparisonChain.start()
                .compare("", "")
                .compare(2,8)
                .result();

        //排序器
        Ordering.natural();
    }
}
