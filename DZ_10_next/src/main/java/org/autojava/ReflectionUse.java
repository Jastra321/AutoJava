package org.autojava;

import java.lang.reflect.Method;
import java.util.HashMap;

public class ReflectionUse {

    private Class c = Class.forName("java.util.HashMap");

    public ReflectionUse() throws ClassNotFoundException {
    }

    public void getMethods(){
        Method[] method = c.getMethods();
        for (Method m: method) {
            System.out.println(m);
        }
    }

    public void getName() {
        System.out.println(c.getName());
    }
}
