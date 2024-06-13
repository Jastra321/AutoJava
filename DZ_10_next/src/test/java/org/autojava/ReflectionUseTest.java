package org.autojava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReflectionUseTest {

    ReflectionUse r;

    {
        try {
            r = new ReflectionUse();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void Test0(){
        r.getMethods();
        r.getName();
    }

}