package com.guava.cache;

/**
 * @author Tom Guan
 * @create 2020-03-16
 */
public class CacheTest {
    public static void main(String[] args) {
//        LoadingCache<String, String> cache = CacheBuilder.newBuilder().maximumSize(1000)
//                .expireAfterWrite(10, TimeUnit.MINUTES)
//                .build(
//                        new CacheLoader<String, String>() {
//                            @Override
//                            public String load(String s) throws Exception {
//                                return createExpensiveString();
//                            }
//                        }
//                );
//        try {
//            cache.get("key");
//            cache.getUnchecked("key");
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
//
//        CacheLoader<Key, DatabaseConnection> loader = new CacheLoader<Key, DatabaseConnection>() {
//            @Override
//            public DatabaseConnection load(Key key) throws Exception {
//                return openConnection(key);
//            }
//        }
//
//        RemovalListener<Key, DatabaseConnection> removalListener = new RemovalListener<Key, DatabaseConnectioon>();
    }
}
