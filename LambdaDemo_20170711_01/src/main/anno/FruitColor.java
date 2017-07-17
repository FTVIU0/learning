package main.anno;

import java.lang.annotation.*;

/**
 * Created by Nlte on 2017/07/17 10:10.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
    enum Color{BLUE, RED, GREEN}

    Color fruitColor() default Color.GREEN;
}
