package sandbox.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Fruit {

    protected String type;
    protected String color;
    protected int size;

    public Fruit(String type, String color, int size) {
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fruit{");
        sb.append("type='").append(type).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }
}

    /*
    public class Fruit implements Comparable<Fruit> {
    private String fruitName;
    private int fruitQty;

    public Fruit(String fruitName, int fruitQty) {
        this.fruitName = fruitName;
        this.fruitQty = fruitQty;
    }

    public Fruit(String name) {
        this.fruitName = name;
        this.fruitQty = 0;
    }

    private Fruit() {
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getFruitQty() {
        return fruitQty;
    }

    public void setFruitQty(int fruitQty) {
        this.fruitQty = fruitQty;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fruit{");
        sb.append("name='").append(fruitName);
        sb.append(", quantity=").append(fruitQty);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Fruit that) {
        if (this.fruitName.compareTo(that.fruitName) > 0) { //compare strings
            return -1;
        } else if (this.fruitName.compareTo(that.fruitName) < 0) {
            return 1;
        } else {

            if (this.fruitQty > that.fruitQty) { // compare integers
                return 1;
            } else if (this.fruitQty < that.fruitQty) {
                return -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", 50);
        Fruit orange = new Fruit("Orange", 3);
        Fruit banana = new Fruit("Banana", 7);
        Fruit peach = new Fruit("Peach", 4);
        Fruit tangerine = new Fruit("Tangerine", 6);
        Fruit apple2 = new Fruit("Apple", 3);

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(apple);
        fruits.add(orange);
        fruits.add(banana);
        fruits.add(peach);
        fruits.add(tangerine);
        fruits.add(apple2);

        fruits.forEach(System.out::println);
        System.out.println();

        Collections.sort(fruits);

        fruits.forEach(System.out::println);
    } */
