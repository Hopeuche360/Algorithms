package com.company.junit;

import org.testng.annotations.Test;

import java.util.function.Supplier;

import static org.testng.AssertJUnit.assertNull;

public class StringUtilsTest {

    @Test
    void givenNullString_whenReverseIsCalled_thenNullIsReturned() {
        String actual = StringUtils.reverse(null);

        //assert null without message
        assertNull(actual);
    }

    @Test
    void givenEmptyString_whenReverseIsCalled_thenEmptyStringIsReturned() {
        String actual = StringUtils.reverse("");
        String message = "Actual string should be null!!";

        //assert null with message
        assertNull(actual, message);
    }

    @Test
    void givenNonNullString_whenReversedIsCalled_thenReversedStringIsReturned() {
        String actual = StringUtils.reverse("rtpoiuytrdfcvbnkliuhg");
        Supplier<String> messageSupplier = ()-> "Actual string should be null!!";

        //assert null with Java 8 supplier message
        assertNull(actual, messageSupplier);
    }
}
