package main.anno;

/**
 * Created by Nlte on 2017/07/17 10:14.
 */
public class Apple {
    @FruitName("Apple")
    private String name;

    @FruitColor(fruitColor = FruitColor.Color.BLUE)
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
