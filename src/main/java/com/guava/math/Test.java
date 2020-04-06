package com.guava.math;

import com.google.common.math.IntMath;
import com.google.common.reflect.TypeParameter;
import com.google.common.reflect.TypeToken;

import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * @author Tom Guan
 * @create 2020-04-05
 */
public class Test {
    public static void main(String[] args) {
        IntMath.checkedAdd(1,2);
        IntMath.sqrt(1, RoundingMode.DOWN);
        RoundingMode.FLOOR;
        Math.sqrt(1);

        TypeToken<String> stringTok = TypeToken.of(String.class);
        TypeToken<Integer> intTok = TypeToken.of(Integer.class);
        TypeToken<Map<?, ?>> wildMapTok = new TypeToken<Map<?, ?>>() {};
    }

    static <K, V> TypeToken<Map<K, V>> mapToken(TypeToken<K> keyToken, TypeToken<V> valueToken) {
        return new TypeToken<Map<K, V>>() {}
                .where(new TypeParameter<K>() {}, keyToken)
                .where(new TypeParameter<V>() {}, valueToken);
    }

    TypeToken<Map<String, BigInteger>> mapToken = mapToken(
            TypeToken.of(String.class),
            TypeToken.of(BigInteger.class)
    );
    TypeToken<Map<Integer, Queue<String>>> complexToken = mapToken(
            TypeToken.of(Integer.class),
            new TypeToken<Queue<String>>() {}
    );
}
