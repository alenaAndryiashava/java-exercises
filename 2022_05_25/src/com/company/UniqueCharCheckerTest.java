package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueCharCheckerTest {

    @Test
    void testCheckAllCharsUniqueHashSet() {
        assertTrue(UniqueCharChecker.checkAllCharsUniqueHashSet("abcd"));
        assertFalse(UniqueCharChecker.checkAllCharsUniqueHashSet("aabcd"));
        assertTrue(UniqueCharChecker.checkAllCharsUniqueHashSet("GFDS"));
        assertFalse(UniqueCharChecker.checkAllCharsUniqueHashSet("PKKTV"));
        assertTrue(UniqueCharChecker.checkAllCharsUniqueHashSet("aBcD"));
        assertFalse(UniqueCharChecker.checkAllCharsUniqueHashSet("aaBBcd"));
    }
    @Test
    void testCheckAllCharsUniqueAscii() {
        assertTrue(UniqueCharChecker.checkAllCharsUnique("abcd"));
        assertFalse(UniqueCharChecker.checkAllCharsUnique("aabcd"));
        assertTrue(UniqueCharChecker.checkAllCharsUnique("GFDS"));
        assertFalse(UniqueCharChecker.checkAllCharsUnique("PKKTV"));
        assertTrue(UniqueCharChecker.checkAllCharsUnique("aBcD"));
        assertFalse(UniqueCharChecker.checkAllCharsUnique("aaBBcd"));
    }
    @Test
    void testCheckAllCharsUniqueString() {
        assertTrue(UniqueCharChecker.checkAllCharsUniqueString("abcd"));
        assertFalse(UniqueCharChecker.checkAllCharsUniqueString("aabcd"));
        assertTrue(UniqueCharChecker.checkAllCharsUniqueString("GFDS"));
        assertFalse(UniqueCharChecker.checkAllCharsUniqueString("PKKTV"));
        assertTrue(UniqueCharChecker.checkAllCharsUniqueString("aBcD"));
        assertFalse(UniqueCharChecker.checkAllCharsUniqueString("aaBBcd"));
    }
}