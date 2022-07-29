package Streams;

public class Fruits {
    private String name;
    private String colour;
    private int calories;
    private int price;

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }

    public Fruits(String name, String colour, int calories, int price) {
        this.name = name;
        this.colour = colour;
        this.calories = calories;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
