package com.test.demo.annotation;

import java.lang.annotation.*;

/**
 * @author caixintian
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckSize {
    int min() default 0;
    int max() default Integer.MAX_VALUE;
    String value() default "";
}
