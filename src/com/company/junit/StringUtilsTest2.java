package com.company.junit;

import static org.testng.AssertJUnit.assertNotNull;

import java.util.function.Supplier;

import org.testng.annotations.Test;

class StringUtilsTest2 {

    // ******** assertNotNull Example - Start **********
    @Test
    void givenNullString_whenReverseIsCalled_thenNullIsReturned() {
        String actual = StringUtils.reverse((null));
        String message = "Actual String should not be null !!! ";

        // assertNotNull with message
        assertNotNull(actual, message);
    }

    @Test
    void givenNullString_whenReverseIsCalled_thenNullIsReturned2() {
        String actual = StringUtils.reverse((null));
        Supplier<String> messageSupplier = () -> "Actual String should not be null !!! ";

        // assertNotNull with Java 8 MessageSupplier
        assertNotNull(actual, messageSupplier);
    }

    @Test
    void givenEmptyString_whenReverseIsCalled_thenEmptyStringIsReturned() {
        String actual = StringUtils.reverse((""));

        // assertNotNull without message
        assertNotNull(actual);
    }

    @Test
    void givenNonNullString_whenReverseIsCalled_thenReversedStringIsReturned() {
        String actual = StringUtils.reverse(("ABCD"));

        // assertNotNull without message
        assertNotNull(actual);
    }

    // ******** assertNotNull Example - End **********
}
