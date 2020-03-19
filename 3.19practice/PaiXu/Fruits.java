package PaiXu;

public class Fruits implements Comparable{
    private String fruit;

    public Fruits() {
    }

    public Fruits(String fruit) {
        this.fruit = fruit;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "fruit='" + fruit + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return this.fruit.compareTo(((Fruits)o).getFruit());
    }
}
