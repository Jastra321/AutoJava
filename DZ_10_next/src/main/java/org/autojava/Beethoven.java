package org.autojava;

import java.lang.annotation.*;
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Beethoven {
    String breed() default "saint bernard";
    String name() default "Beethoven";
    int weight() default 70;
}
