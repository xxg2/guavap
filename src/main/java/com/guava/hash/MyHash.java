package com.guava.hash;

import com.google.common.base.Charsets;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

import java.util.Objects;

/**
 * @author Tom Guan
 * @create 2020-04-05
 */
public class MyHash {
    public static void main(String[] args) {
        HashFunction hf = Hashing.md5(); HashCode hc = hf.newHasher()
                .putLong(id)
                .putString(name, Charsets.UTF_8) .putObject(person, personFunnel) .hash();
        HashCode.fromInt(1).asInt();
        Objects.hashCode(1);

        BloomFilter<Person> friends = BloomFilter.create(personFunnel, 500, 0.01); for(Person friend : friendsList) {
            friends.put(friend);
        }
// 很久以后
        if (friends.mightContain(dude)) { //dude不是朋友还运行到这里的概率为1% //在这儿，我们可以在做进一步精确检查的同时触发一些异步加载 }
    }
}
