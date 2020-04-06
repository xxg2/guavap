package com.guava.reflact;

import com.google.common.collect.Lists;

import java.util.ArrayList;

/**
 * @author Tom Guan
 * @create 2020-04-05
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> stringList = Lists.newArrayList();
        ArrayList<Integer> intList = Lists.newArrayList();
        System.out.println(stringList.getClass().isAssignableFrom(intList.getClass()));
        returns true, even though ArrayList<String> is not assignable from ArrayList<Integer>
    }
}
