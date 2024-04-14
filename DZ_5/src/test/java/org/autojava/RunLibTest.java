package org.autojava;

import org.apache.commons.io.FileUtils;

import static org.junit.jupiter.api.Assertions.*;

class RunLibTest {

    @org.junit.jupiter.api.Test
    void doRunLibisEmpty() {
        String a = "";
        String q = "q";
        assertEquals(RunLib.doRunLibisEmpty(a), true);
        assertEquals(RunLib.doRunLibisEmpty(q), false);
    }

    @org.junit.jupiter.api.Test
    void doRunLibContainsWithCase() {
        String a = " abcd";
        assertEquals(RunLib.doRunLibContainsWithCase(a, "a"), true);
        assertEquals(RunLib.doRunLibContainsWithCase(a, "A"), false);
    }

    @org.junit.jupiter.api.Test
    void doRunLibEqualsWithCase() {
        String a = "abcd";
        assertEquals(RunLib.doRunLibEqualsWithCase(a, "abcd"), true);
        assertEquals(RunLib.doRunLibEqualsWithCase(a, "ABCD"), false);
    }

    @org.junit.jupiter.api.Test
    void doRunLibEqualsWithoutCase() {
        String a = "abcd";
        assertEquals(RunLib.doRunLibEqualsWithoutCase(a, "abcd"), true);
        assertEquals(RunLib.doRunLibEqualsWithoutCase(a, "ABCD"), true);
        assertEquals(RunLib.doRunLibEqualsWithoutCase(a, "123" ), false);
    }

    @org.junit.jupiter.api.Test
    void doRunLibSubstringFromIdxToEnd() {
        assertEquals(RunLib.doRunLibSubstringFromIdxToEnd("abcd", 2), "cd");
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {RunLib.doRunLibSubstringFromIdxToEnd("abcd", 5);});
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {RunLib.doRunLibSubstringFromIdxToEnd("abcd", -1);});
    }

    @org.junit.jupiter.api.Test
    void doRunLibSubstringFromAToB() {
        assertEquals(RunLib.doRunLibSubstringFromAToB("qwerty", 3, 5), "rt");
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {RunLib.doRunLibSubstringFromAToB("qwerty", -1,0);});
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {RunLib.doRunLibSubstringFromAToB("qwerty", 0,7);});
    }

    @org.junit.jupiter.api.Test
    void doRunLibRemoveString() {
        assertEquals(RunLib.doRunLibRemoveString("qwerty","qwe"),"rty");
    }

    @org.junit.jupiter.api.Test
    void doFile() {
        RunLib.doFile("qwerty");
    }
}