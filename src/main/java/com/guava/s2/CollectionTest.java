package com.guava.s2;

import com.google.common.base.*;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

/**
 * @author Tom Guan
 * @create 2020-03-14
 */
public class CollectionTest {
    public static void main(String[] args) {
        ImmutableSet<String> COLOR_NAMES = ImmutableSet.of("red", "orange", "yellow");
        ImmutableSet.copyOf(COLOR_NAMES);
        ImmutableMap.of();

//        new Multimap<String>();
//        Collections2.transform(Lists.asList("", ""));
        Lists.newCopyOnWriteArrayList();
        Sets.newCopyOnWriteArraySet();

        List<String> list = Lists.newArrayList();
//        Set<Type> copySet = Sets.newHashSet(elements);

        Joiner joiner = Joiner.on(";").skipNulls();
        System.out.println(joiner.join("harry", null, "ron", "herm"));
        System.out.println(Joiner.on(",").join(Arrays.asList(1,5,7)));

        String str = ",a,,b,";
        System.out.println(str.split(","));
        System.out.println(Splitter.on(",").trimResults().omitEmptyStrings().split(str));

        Splitter.on(';');
        Splitter.on(CharMatcher.breakingWhitespace());
        Splitter.fixedLength(2);

        String noControl = CharMatcher.javaIsoControl().removeFrom(str); //移除control字符 String theDigits = CharMatcher.DIGIT.retainFrom(string); //只保留数字字符
        String spaced = CharMatcher.whitespace().trimAndCollapseFrom(str, ' '); //去除两端的空格，并把中间的连续空格替换成单个空格
        String noDigits = CharMatcher.digit().replaceFrom(str, "*"); //用*号替换所有数字
        String lowerAndDigit = CharMatcher.javaDigit().or(CharMatcher.javaLowerCase()).retainFrom(str); // 只保留数字和小写字母
        CharMatcher.inRange('b','z');

        str.getBytes(Charsets.UTF_8);
        try {
            str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "CONSTANT_NAME")); // returns "constantName
    }
}
