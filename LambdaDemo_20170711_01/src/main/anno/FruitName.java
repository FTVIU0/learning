package main.anno;

import java.lang.annotation.*;

/**
 * Created by Nlte on 2017/07/17 10:09.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
    String value() default "";
}
