//package com.company.vcgCodeChallenge.utils;
//
//import org.junit.jupiter.api.Test;
//
//import java.io.UnsupportedEncodingException;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//class EncryptUtilsTest {
//
//    @Test
//    void givenGameCodeOfString_shouldEncrypt_andDecrypt() throws UnsupportedEncodingException {
//        String gameCode = GameCodeGenerator.generateCode();
//        String value = EncryptUtils.easyEncrypt(gameCode);
//        String returnedGameCode = EncryptUtils.easyDecrypt(value);
//        assertThat(gameCode).isNotEqualTo(value);
//        assertThat(gameCode).isEqualTo(returnedGameCode);
//    }
//
//}