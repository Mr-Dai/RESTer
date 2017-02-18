package com.rester.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks an attribute of a  REST resource.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Attribute {

    /**
     * Name of the attribute in Camel Case. Default to be the marked field's name.
     *
     * @return name of the attribute.
     */
    String name() default "";

    /**
     * Whether to expose the attribute when returning the resource as a reply to {@code GET} requests.
     *
     * @return whether to expose the attribute when returning the resource as a reply to {@code GET} requests.
     */
    boolean exposed() default true;
}
