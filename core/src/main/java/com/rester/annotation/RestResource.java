package com.rester.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a Java POJO as REST resource.
 *
 * @author Robert Peng
 * @since 0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface RestResource {

    /**
     * Name of the REST resource. Default to be the name of the annotated class.
     *
     * @return name of the REST resource.
     */
    String name() default "";

    /**
     * Root path of the respective REST API. Default to be the lower-case plural form of the resource's name.
     *
     * @return root path of the respective REST API.
     */
    String path() default "";
}
