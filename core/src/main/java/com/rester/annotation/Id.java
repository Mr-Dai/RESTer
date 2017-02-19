package com.rester.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks the identifier attribute of a REST resource class. The attribute will be used as the
 * primary key of the underlying database and the identifier when constructing URL.
 *
 * @author Robert Peng
 * @since 0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Id {
}
