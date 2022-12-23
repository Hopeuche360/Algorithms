package com.company.adyen;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Result {
    static Map<Long, String> cache = new ConcurrentHashMap<>();
    static final class BinRange {
        final String start;
        final String end;
        final String cardType;

        BinRange(String start, String end, String cardType) {
            this.start = start;
            this.end = end;
            this.cardType = cardType;
        }
    }

    interface cardTypeCache {
        String get(String cardNumber);
    }

    public static cardTypeCache buildCache(List<BinRange> binRange) {

        cardTypeCache cardTypeCache = cardNumber -> {
            String result = null;
            long lower = Long.parseLong(cardNumber.substring(0, 12));

            if (!cache.containsKey(lower)) {
                for (BinRange element : binRange) {
                    long start = Long.parseLong(element.start);
                    long end = Long.parseLong(element.end);
                    String cardType = element.cardType;
                    if (lower <= end && lower >= start) {
                        result = cardType;
                        cache.put(lower, cardType);
                        break;
                    }
                }
                System.out.println("Fetching from the list");
                return result;
            } else {
                System.out.println("Fetching result from cache");
                return cache.get(cardNumber);
            }
        };
        return cardTypeCache;
    }

    public static void main(String[] args) {
        List<Result.BinRange> binRangeList = new ArrayList<>();

        binRangeList.add(new Result.BinRange("400000000000","419999999999","visa"));
        binRangeList.add(new Result.BinRange("420008000000","420008999999","visadebit"));
        binRangeList.add(new Result.BinRange("435000000000","435000999999","visa"));
        binRangeList.add(new Result.BinRange("540000000000","549999999999","mc"));
        Result.cardTypeCache cacheCache = Result.buildCache(binRangeList);
        System.out.println(cacheCache.get("4350000000004356789"));;
    }
}