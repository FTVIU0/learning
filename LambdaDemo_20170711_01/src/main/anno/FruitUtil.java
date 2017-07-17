package main.anno;

import java.lang.reflect.Field;

/**
 * Created by Nlte on 2017/07/17 10:35.
 */
public class FruitUtil {
    public static void getInfo(Class clzz){
        String name = "水果名称：";
        String color = "水果颜色：";

        Field[] declaredFields = clzz.getDeclaredFields();

        for (Field f :declaredFields) {
            if (f.isAnnotationPresent(FruitName.class)){
                FruitName annotation = f.getAnnotation(FruitName.class);
                name  = name + annotation.value();
            }else if (f.isAnnotationPresent(FruitColor.class)){
                FruitColor annotation = f.getAnnotation(FruitColor.class);
                color = color + annotation.fruitColor().toString();
            }

        }

        System.out.println(name + " " + color);
    }
}
