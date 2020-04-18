package com.ruijie.guavacache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.concurrent.ConcurrentMap;

public class GuavaCache1 {
    public static void main(String[] args) {
        Cache<String, String> cache = CacheBuilder.newBuilder().build();
        cache.put("word", "Hello Guava Cache");
        System.out.println(cache.getIfPresent("word"));
        ConcurrentMap<String, String> stringStringConcurrentMap = cache.asMap();
    }
}
