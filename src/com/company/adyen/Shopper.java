package com.company.adyen;

import java.util.*;
class Shopper {
    private String shopperReference;
    private Double riskScore;
    public Shopper(String shopperReference, Double riskScore) {
        this.shopperReference = shopperReference;
        this.riskScore = riskScore;
    }
    public String getShopperReference() {
        return shopperReference;
    }
    public void setShopperReference(String shopperReference) {
        this.shopperReference = shopperReference;
    }
    public Double getRiskScore() {
        return riskScore;
    }
    public void setRiskScore(Double riskScore) {
        this.riskScore = riskScore;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Shopper shopper = (Shopper) o;
        return Objects.equals(shopperReference, shopper.shopperReference) && Objects.equals(riskScore, shopper.riskScore);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), shopperReference, riskScore);
    }
}
class ShopperCacheException extends RuntimeException {
    public ShopperCacheException(String message){
        super(message);
    }
}

class ShopperCache {
    int capacity;
    Map<String, Double> cache;
    ShopperCache(int capacity) throws ShopperCacheException {
            if( capacity > 0) {
                this.capacity = capacity;
                cache = new LinkedHashMap<>();
            } else throw new ShopperCacheException("Capacity is not a valid value!");
    }
    Double getRiskScore(String shopperReference) {
        if(cache.containsKey(shopperReference))
            return cache.get(shopperReference);
        return null;
    }
    void insertShopper(Shopper shopper) {
        try {
            if (!isFull()) {
                cache.put(shopper.getShopperReference(), shopper.getRiskScore());
            }  else {
                cache.remove(cache.keySet().stream().findFirst().orElseThrow());
                cache.put(shopper.getShopperReference(), shopper.getRiskScore());
            }
        } catch (NoSuchElementException exception) {
            System.out.println("Element to remove from cache not found");
        }
    }
//    Map<String, Double> getShopper() {
//        return cache;
//    }
    boolean isFull() {
        return cache.size() == this.capacity;
    }
}
final class Solution {
    public static void main(String args[]) throws Exception {
        ShopperCache shopperCache = null;
        try (final Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextLine()) {
                String operation = scanner.next();
                switch (operation) {
                    case "init":
                        int capacity = scanner.nextInt();
                        try {
                            shopperCache = new ShopperCache(capacity);
                        } catch (ShopperCacheException e) {
                            System.out.println("Error thrown in init");
                        }
                        break;
                    case "insert":
                        String shopperReference = scanner.next();
                        Double riskScore = scanner.nextDouble();
                        Shopper shopper = new Shopper(shopperReference, riskScore);
                        shopperCache.insertShopper(shopper);
                        break;
                    case "score":
                        String shopperReferenceToGet = scanner.next();
                        Double score = shopperCache.getRiskScore(shopperReferenceToGet);
                        System.out.println(score == null ? null : String.format("%.2f", score));
                        break;
//                    case "shoppers":
//                        System.out.println(shopperCache.getShopper());
//                        break;
                    case "isfull":
                        System.out.println(shopperCache.isFull());
                        break;
                    default:
                        throw new RuntimeException("Invalid operation");
                }
            }
        }
    }
}
