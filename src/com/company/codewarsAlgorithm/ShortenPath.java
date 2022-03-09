package com.company.codewarsAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class ShortenPath {
    public static void main(String[] args) {
        String path = "/../../foo/bar/baz";
        System.out.println(shortenPath(path));
    }

    public static String shortenPath(String path) {
        String[] splitPath = path.split("");
        ArrayList<String> pathList = new ArrayList<>();

        for (String element : splitPath) {
            if ((pathList.size() > 0) && element.contains("..")) {
                pathList.remove("..");
            } else if (Arrays.asList(".").contains(element)) {
                pathList.add(element);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String el : pathList) {
            sb.append("/").append(el);
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }
}
