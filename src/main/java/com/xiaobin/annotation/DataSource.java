package com.xiaobin.annotation;

import java.lang.annotation.*;

/**
 * @author kevin
 * @since 2020/4/2 11:59 AM
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    String name() default "";
}
