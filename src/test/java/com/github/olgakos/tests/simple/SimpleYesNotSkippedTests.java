package com.github.olgakos.tests.simple;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("It's 3 Simple Yes-Not-Skipped Tests")
public class SimpleYesNotSkippedTests {


    @Test
    @Tag("Positive Test One (Tag)")
    @DisplayName("Positive Test One")
    void test00() {
        assertTrue(true);
    }

    @Test
    @Disabled("Skipped Test: With some reason")
    @DisplayName("False Test: With some reason")
    void test01() {
        assertTrue(false);
    }

    @Test
    @Disabled("Skipped Test: With some reason")
    void test02() {
        assertTrue(true);
    }

    @Test
    @Tag("Positive Test Two (Tag)")
    @DisplayName("Positive Test Two")
    void test03() {
        assertTrue(true);
    }
}
