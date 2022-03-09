//package com.company.mondayAlgo;
//
//import java.util.Map;
//import java.util.*;
//public class HtmlColorParser {
//    private final Map<String, String> presetColors;
//    public HtmlColorParser(Map<String, String> presetColors) {
//        this.presetColors = presetColors;
//    }
//    public RGB parse(String color) {
//        List<Integer>newList= new ArrayList<>();
//        if(!(color.contains("#"))){
//            String newWord= color.toLowerCase(Locale.ROOT);
//            String intValue="";
//            if(presetColors.containsKey(newWord)){
//                intValue=presetColors.get(newWord);
//                for(int i=1;i<intValue.length();i+=2){
//                    String word= intValue.substring(i,i+2);
//                    int number= Integer.parseInt(word,16);
//                    newList.add(number);
//                }
//            }
//        }
//            else if(color.length()==7){
//            for(int i=1;i<color.length();i+=2){
//                String word= color.substring(i,i+2);
//                int number= Integer.parseInt(word,16);
//                newList.add(number);
//            }
//        }
//            else if(color.length()==4){
//            for(int i=1;i<color.length();i++){
//                String word= color.substring(i,i+1)+ color.charAt(i);
//                int number=Integer.parseInt(word,16);
//                newList.add(number);
//            }
//        }
//        return new RGB(newList.get(0),newList.get(1),newList.get(2));
//    }
//}