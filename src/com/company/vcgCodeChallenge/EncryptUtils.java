//package com.company.vcgCodeChallenge;
//
//import org.apache.commons.codec.binary.Base64;
//
//import java.io.UnsupportedEncodingException;
//import java.nio.charset.StandardCharsets;
//
//
//public class EncryptUtils {
//
//
//    public static String easyEncrypt(String text) throws UnsupportedEncodingException {
//        byte[] encryptArray = Base64.encodeBase64(text.getBytes());
//        String encstr = new String(encryptArray, StandardCharsets.UTF_8);
//        return encstr;
//
//
//    }
//
//    public static String easyDecrypt(String secret) throws UnsupportedEncodingException {
//        byte[] dectryptArray = secret.getBytes();
//        byte[] decarray = Base64.decodeBase64(dectryptArray);
//        String decstr = new String(decarray, StandardCharsets.UTF_8);
//        return decstr;
//    }
//
//
//}